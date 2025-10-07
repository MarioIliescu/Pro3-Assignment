package via.pro3.slaughterhouse.services;

import com.slaughterhouse.grpc.*;
import com.slaughterhouse.grpc.Product;
import via.pro3.slaughterhouse.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService
{
  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository)
  {
    this.productRepository = productRepository;
  }

  public CreateProductResponse createProduct(CreateProductRequest request)
  {
    via.pro3.slaughterhouse.model.Product entity =
        new via.pro3.slaughterhouse.model.Product();
    entity.setId(request.getProduct().getId());
    entity.setName(request.getProduct().getName());
    entity.setDescription(request.getProduct().getDescription());

    productRepository.save(entity);
    Product protoProduct = Product.newBuilder().
        setId(entity.getId()).setName(entity.getName()).
        setDescription(entity.getDescription()).build();
    return CreateProductResponse.newBuilder().setProduct(protoProduct).build();
  }
  public Product getProduct(Integer id)
  {
    return productRepository.findById(id)
        .map(entity -> Product.newBuilder()
            .setId(id)
        .setName(entity.getName())
        .setDescription(entity.getDescription())
        .build()).orElse(null);
  }

  public DeleteResponse deleteProduct(Integer id)
  {
    DeleteResponse.Builder response = DeleteResponse.newBuilder();
    if (productRepository.existsById(id)) {
      productRepository.deleteById(id);
    } else {
      response.setError(com.slaughterhouse.grpc.Error.newBuilder()
          .setCode(404)
          .setMessage("Product not found")
          .build());
    }
    return response.build();
  }

  public ListProductsResponse listProducts()
  {
    List<Product> products = productRepository.findAll().stream()
        .map(entity -> Product.newBuilder()
            .setId(entity.getId())
            .setName(entity.getName())
            .setDescription(entity.getDescription())
                .build())
        .collect(Collectors.toList());

    return ListProductsResponse.newBuilder()
        .addAllProducts(products)
        .build();
  }
}
