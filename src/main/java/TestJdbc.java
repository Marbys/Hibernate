import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String args[]){
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSLL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try{
            System.out.println("Connecting to database: "+jdbcUrl);
            Connection myConnection = DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("Connection successful!!!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
