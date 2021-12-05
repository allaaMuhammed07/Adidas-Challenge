package UpdateProduct;

import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.path.json.JsonPath;
import models.Products;
import org.junit.jupiter.api.Test;

import java.util.List;
import static io.restassured.RestAssured.given;

public class updateProductTests {

    private String productId = "ZipHoodie";
    private String productName = "THERMAL QUARTER-ZIP HOODIE";
    private String productDescription = "A COZY HOODED TOP WITH REFLECTIVE 3-STRIPES FOR COLD WEATHER RUNS.";
    public String createdProduct_id;

    @Test
    public void updateProductDescription(){
        String endpoint = "http://localhost:3001/product/" + productId;

        Products products = new Products(productId, productName, productDescription);
        var response = given().body(products).when().put(endpoint).then();
        response.log().body();

        System.out.println("Test Passed !!");
    }
}
