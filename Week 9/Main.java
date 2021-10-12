package light;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/reg";
        String user = "root";
        String password = "Tequila123*";
        
        Connection con = null;
        Statement stmt = null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/reg?" +
            	                               "user=root&password=Tequila123*");
            
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM user");

                if (stmt.execute("SELECT * FROM user")) {
                    rs = stmt.getResultSet();
                    System.out.println("success");
                    
                }
                
                String sql = "INSERT INTO user (name, age) VALUES (?, ?)";
                
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, "bill");
                statement.setInt(2, 60);
                 
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new user was inserted successfully!");
                }

            }
            catch (SQLException ex){

                System.out.println("SQLException: " + ex.getMessage());
      
            }
        }//try ends
        catch(Exception ex)
        	{System.out.println("DB error: "+ex);
}//catch ends
}//connect ends
}//class ends
