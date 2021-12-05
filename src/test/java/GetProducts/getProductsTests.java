package GetProducts;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class getProductsTests {

    private String existingProductId = "Original";
    private String notExistingProductId = "dummy";

    @Test
    public void getExistingProductById(){
        String endpoint = "http://localhost:3001/product/" + existingProductId;

        var response = given()
                .when().get(endpoint).then().assertThat().statusCode(200);

        response.log().body();

        response.assertThat().body("currency", equalTo("$"));
        System.out.println("Test Passed !!");

    }

    @Test
    public void getNotExistingProductById(){
        String endpoint = "http://localhost:3001/product/" + notExistingProductId;
        var response = given()
                .when().get(endpoint).then().assertThat().statusCode(500);
        response.log().body();
        System.out.println("Status code shall be 500 as there are no such product with id dummyText");
    }
}
