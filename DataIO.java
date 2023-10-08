
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author markl
 */
public class DataIO {
    private final String DATABASE_NAME = "ceis400_sept30";
    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    private final String USER_NAME = "root";
    private final String PASSWORD = "Makmak!827";
    
    public boolean validateLogin(Login log) throws ClassNotFoundException, SQLException{
        // Check for database driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish connection with the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        String username = log.getUsername();
        String password = log.getPassword();
        
        // Retrieve data from database
        String strSQL = "SELECT * FROM login where Username='"+username+"' and Password='"+password+"'";
        java.sql.Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery(strSQL);
        if(rs.next()){
            System.out.println("Login Succesful");
            return true;
        }else{
            conn.close();
            return false;
        }
    }
    
    public void addEmployeeData(Register emp) throws ClassNotFoundException, SQLException{
        // Check for database driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish connection with the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING,
                USER_NAME, PASSWORD);
        
        // Add record
        String strSQL = "INSERT INTO registrationform (Name, stAddress, City, State, Zip, username, password) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        pstmt.setString(1, emp.getName());
        pstmt.setString(2, emp.getStAddress());
        pstmt.setString(3, emp.getCity());
        pstmt.setString(4, emp.getState());
        pstmt.setInt(5, emp.getZip());
        pstmt.setString(6, emp.getUsername());
        pstmt.setString(7, emp.getPassword());
        // Execute the prepared statement
        pstmt.execute();
        
        String strSQL2 = "INSERT INTO login (Username, Password) VALUES(?,?)";
        PreparedStatement pstmt2 = conn.prepareStatement(strSQL2);
        pstmt2.setString(1, emp.getUsername());
        pstmt2.setString(2, emp.getPassword());
        
        // Execute the prepared statement
        pstmt2.execute();
        
        // Close connection
        conn.close();
    }
}
