package CreateProducts;


import models.Products;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class createProductsTests {

    @Test
    public void createProduct(){
        //String endpoint = System.getProperty("product_endpoint", api_properties.getProperty("product_endpoint"));
        String endpoint = "http://localhost:3001/product";
        Products products = new Products(
                "Original t-shirt",
                "Adidas Original T-shirt",
                "This is the new Adidas original t-shirt. It comes in two colors; White and blue"
        );

        var response = given().body(products).when().post(endpoint).then();
        response.log().body();
    }
}
