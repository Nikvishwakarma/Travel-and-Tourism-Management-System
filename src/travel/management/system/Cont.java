package travel.management.system;
import java.sql.*;

public class Cont {
    Connection c;
    Statement s;
    Cont(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Y1012Jqkhkp");
           s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
