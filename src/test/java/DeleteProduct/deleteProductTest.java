package DeleteProduct;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class deleteProductTest {

    private String id = "groundBoots";

    @Test
    public void deleteSpecificProduct(){
        String endpoint = "http://localhost:3001/product/" + id;

        var response = given().body(id).when().delete(endpoint).then();
        response.log().body();
    }

    @Test
    public void validateDeletedProduct(){
        String endpoint = "http://localhost:3001/product/" + id;

        var response = given()
                .when().get(endpoint).then();

        response.log().body();

    }
}
