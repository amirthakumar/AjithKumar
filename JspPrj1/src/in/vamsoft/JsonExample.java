package in.vamsoft;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample {
  
  public static void main(String[] args) {
    
    JSONObject obj=new JSONObject();
    obj.put("name", "Ajith");
    obj.put("Age", 21);
    
    JSONArray array=new JSONArray(); 
    array.put("Ajith");
    array.put("21");
    array.put("Chenani");

    System.out.println(array);
    
  }

}
