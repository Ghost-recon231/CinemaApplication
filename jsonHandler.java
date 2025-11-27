
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.*;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

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
    
    public void test(){
          getSQL();
    }
    
    public void getSQL(){
        try { 
            Class.forName("org.sqlite.JDBC"); 
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Kino_Ref.sqlite"); 
            Statement stat = conn.createStatement(); 
            String sql = "select * from Film"; 
            ResultSet rs = stat.executeQuery(sql);
            
            System.out.println(json.toString());
            rs.close(); 
            conn.close(); 
        } catch (Exception e) { 
            System.out.println(e.toString()); 
        }  
    }
    
    public String jsonToString(JsonObject jsonObject){
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(stringWriter);
          jsonWriter.writeObject(jsonObject);
          jsonWriter.close();
          return stringWriter.toString();
    }
    
    public static JsonArray resultsetToJson(ResultSet rs){
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
    }
}
