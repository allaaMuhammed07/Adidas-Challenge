package CreateProducts;


import Definition.defineProducts;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class createProductsTests {

    private defineProducts products = new defineProducts();
    private String productId = "Original";
    private String productName = "Adidas Original Tshirt";
    private String productDescription = "This is the new Adidas original tshirt. It comes in two colors; White and blue";

    @Test
    public void createProductSuccessfully(){
        String endpoint = "http://localhost:3001/product";

        products.createProduct(productId,productName, productDescription);
        var response = given().body(products).when().post(endpoint).then();
        response.log().body();
    }
}
