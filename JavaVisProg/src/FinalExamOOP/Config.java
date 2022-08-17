/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExamOOP;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Config {

    /**
     * @param args the command line arguments
     */
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException {
       try{
           String url = "jdbc:mysql://localhost:3307/university";
           String user = "root";
           String pass = "";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           MySQLConfig =  DriverManager.getConnection(url, user, pass);
       }catch(SQLException e) {
           System.out.println("Connection database is failed" + e.getMessage());
       }
        return MySQLConfig;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
}