
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.*;
import javax.json.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bihunjakub
 */
public class JsonHandler {
    private static JsonHandler instance;
    
    private JsonHandler(){}
    
    public static JsonHandler getInstance(){
        if (instance == null){
            instance = new JsonHandler();
        }
        return instance;
    }

    public static String jsonToString(JsonObject jsonObject){
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(stringWriter);
          jsonWriter.writeObject(jsonObject);
          jsonWriter.close();
        return stringWriter.toString();
    }
    
    public static JsonArray resultSetToJson(ResultSet rs){
         try{
            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();

                for (int i = 1; i <= columnCount; i++) {
                    String colName = meta.getColumnName(i);
                    Object value = rs.getObject(i);

                    if (value == null) {
                        jsonBuilder.addNull(colName);
                    } else if (value instanceof Integer) {
                        jsonBuilder.add(colName, (Integer) value);
                    } else if (value instanceof Long) {
                        jsonBuilder.add(colName, (Long) value);
                    } else if (value instanceof Double) {
                        jsonBuilder.add(colName, (Double) value);
                    } else {
                        jsonBuilder.add(colName, value.toString());
                    }
                }

                arrayBuilder.add(jsonBuilder.build());
            }
            JsonArray json = arrayBuilder.build();
            return json;
        
        } catch (Exception e) { 
          System.out.println(e.toString()); 
        }
        return Json.createArrayBuilder().build();
    }
}
