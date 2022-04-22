package commonLibraries;

import io.restassured.RestAssured;
import io.restassured.response.Response;


/**
 * this class consists of generic methods related to restassured
 * @author madhu
 *
 */
public class RestAssuredLibrary
{
	/**
	 * This method will return the json path
	 * @param resp
	 * @param jsonPath
	 * @return
	 */
	public String getJsonPath(Response resp, String jsonpath)
	{
	        String value = resp.jsonPath().get(jsonpath);
	        return value;
	}
}
