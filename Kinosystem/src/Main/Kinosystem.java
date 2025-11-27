/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author luab
 */
public class Kinosystem {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBAccess db = DBAccess.getInstance();
        db.getTable("Film");
    }
}
