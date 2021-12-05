package UpdateProduct;

import models.Products;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class updateProductTests {

    private String productId = "groundBoots";
    private String productName = "ADIPURE FIRM GROUND BOOTS - For Men";
    private String productDescription = "FINESSE YOUR TOUCH IN THESE LIMITED-COLLECTION BOOTS. Comes in one color";

    @Test
    public void updateProductDescription(){
        String endpoint = "http://localhost:3001/product/" + productId;

        Products products = new Products(productId, productName, productDescription);
        var response = given().body(products).when().put(endpoint).then();
        response.log().body();

        System.out.println("Test Passed !!");
    }
}
