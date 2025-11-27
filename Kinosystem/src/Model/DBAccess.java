import java.sql.Connection;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bihunjakub
 */
public class DBAccess {
    private static DBAccess instance;
    private String databaseName = "Kino.sqlite";
    public static JsonHandler json = JsonHandler.getInstance();
    
    
    private DBAccess(){}
    
    public static DBAccess getInstance(){
        if (instance == null){
            instance = new DBAccess();
        }
        return instance;
    }
    
    public void getTable(String tableName){
        try { 
            Class.forName("org.sqlite.JDBC"); 
            Connection conn = DriverManager.getConnection("jdbc:sqlite:"+this.databaseName); 
            Statement stat = conn.createStatement(); 
            String sql = "select * from " + tableName; 
            ResultSet rs = stat.executeQuery(sql);
            
            System.out.println(json.toString());
            rs.close(); 
            conn.close(); 
        } catch (Exception e) { 
            System.out.println(e.toString()); 
        }  
    }
}
