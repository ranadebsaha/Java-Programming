
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//compile --> javac -cp "lib/*" jdbc.java
//run --> java -cp "lib/*;." jdbc
public class jdbc {
    public static void main(String[] args) {
        // String url="jdbc:oracle:thin:@localhost:8080:xe";
        String url="jdbc:mysql://localhost:3308/rds";
        String uname="root";
        String pass="ABab1234@";
        try{
        // Class.forName("oracle.jdbc.driver.OracleDriver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,uname,pass);
        Statement st = conn.createStatement();
        ResultSet rs=st.executeQuery("select * from student");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }

    }
}
