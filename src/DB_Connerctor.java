import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connerctor {

    // declare a connection & initialize -> null
    private static Connection connect = null;

    // declare DB
    private static String db;

    // declare URl and initiate
    private static  String url = System.getenv("url");
    private static  String user = System.getenv("user");
    private static  String password = System.getenv("password");    // declare usrName
    private static String usr;

    // declare pswrd
    private static String pswrd;

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED ="\u001B[31m";
    private static final String ANSI_YELLOW ="\u001B[33m";
    private static final String ANSI_GREEN ="\u001B[32m";


    // method to connect to DB
    public static Connection connect(String usr, String pswrd) {
        System.out.println(ANSI_RED + "\n--Connectiong to MYSQL JDBC--"+ ANSI_RESET);
        System.out.println(ANSI_YELLOW + "\n--Connectiing to MYSQL DBMS--" + ANSI_RESET);
        try {
            connect = DriverManager.getConnection(url,usr,pswrd);
            System.out.println(ANSI_GREEN + "\n--Connection successful--"+ ANSI_RESET);
        }catch(SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return connect;
    }
}
