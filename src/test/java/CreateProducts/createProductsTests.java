package CreateProducts;

import models.Products;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class createProductsTests {

    private String productId = "ZipHoodie1";
    private String productName = "ESSENTIALS FRENCH TERRY 3-STRIPES FULL-ZIP HOODIE";
    private String productDescription = "A COSY HOODIE FOR POST-WORKOUT HANGS - For Women";

    @Test
    public void createProductSuccessfully(){
        String endpoint = "http://localhost:3001/product";

        Products products = new Products(productId,productName, productDescription);
        var response = given().body(products).when().post(endpoint).then();
        response.log().body();

    }
}
