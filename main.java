public class main {
    
    public static void main(String[] args) {
        DBAccess db = DBAccess.getInstance();
        db.getTable("Film");
    }
}


