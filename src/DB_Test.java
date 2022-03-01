public class DB_Test {

    public static void main(String[] args) {
        DB_Statements.connect("nika0147", "Sebtoby0121");//connect to database
        //DB_Statements.createTable("employee", "name", "address");
        //DB_Statements.insertInto("employee", "Bob Bobby", "Bob street 12");
        //DB_Statements.showData("employee");
       // DB_Statements.deleteEmployee("employee", "Bob Bobby");
        //DB_Statements.showDataByName("employee","Bob");

        DB_Login_Window window = new DB_Login_Window(); /*initialise*/
    }
}
