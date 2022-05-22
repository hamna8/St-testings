import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class RestApi {

   @Test
   public void apiCall() {
	given.when.get("http://gen.lib.rus.ec/");
   }
}