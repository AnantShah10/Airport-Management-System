/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Connection;
import java.sql.*;

/**
 *
 * @author Anant
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","ashah2002");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
