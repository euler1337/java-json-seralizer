import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader
{
    String s="{\"my_string\":\"euler\",\"my_int\":1337}";

    public String getData() {
        return s;
    }
}