package ReadingJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonObject;

public class ReadingJsonFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		String path = System.getProperty("user.dir")+"//src/test/java//samplejson.json";
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(new FileReader(path));
		System.out.println("json is "+json.toJSONString());
		JSONArray classdetails = (JSONArray) json.get("classdetails");
		for(int i=0;i<classdetails.size();i++) {
			JSONObject cdetail = (JSONObject) classdetails.get(i); 
			String classname = (String) cdetail.get("class");
			ArrayList<String> methods = (ArrayList<String>)cdetail.get("methods");
			System.out.println("Method names of class"+classname);
			for(String s:methods) {
				System.out.println(s);
			}
			System.out.println("*************");
		}
	}

}
