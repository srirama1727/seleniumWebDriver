package ReadingJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJsonFile2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		String path = System.getProperty("user.dir")+"//src/test/java//samplejson.json";
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(new FileReader(path));
		System.out.println("json is "+json.toString());
		JSONArray classdetails = (JSONArray) json.get("classdetails");
		for(int i=0;i<classdetails.size();i++) {
			JSONObject cdetail = (JSONObject) classdetails.get(i); 
			String classname = (String) cdetail.get("class");
			JSONArray methods = (JSONArray)cdetail.get("methods");
			System.out.println("Method names of class"+classname);
			for(int j=0;j<methods.size();j++) {
				System.out.println(methods.get(j));
			}
			System.out.println("*************");
		}
	}

}
