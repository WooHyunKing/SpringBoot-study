import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class JsonTest {

    public static void main(String[] args) throws IOException,ParseException{
//        JSONParser parser=new JSONParser();
//        Reader reader = new FileReader("/Users/woohyun/Downloads/shop/test.json");
//        JSONObject jsonObject=(JSONObject)parser.parse(reader);
//
//        String name=(String)jsonObject.get("name");
//        long id=(Long)jsonObject.get("id");
//        long price=(Long)jsonObject.get("price");
//
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(price);
        Gson gson=new Gson();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name","anna");
        jsonObject.addProperty("id",1);

        String jsonStr=gson.toJson(jsonObject);
        System.out.println(jsonStr);
    }
}
