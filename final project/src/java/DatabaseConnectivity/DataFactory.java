package DatabaseConnectivity;

/**
 *
 * @author Abhishek Poddar
 */

import java.sql.*;
public class DataFactory {
    
    //Loading the driver class
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
    //getting connection object
    public static  Connection getConnectionToDb() throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crowdfunding" , "root" , "ABHISHEK");     
        return con;      
    }
    //Closing the connections 
    public static void close(ResultSet rs , Connection con , Statement st){
        try{
            if(rs!=null)
                rs.close();
            if(con!=null)
                con.close();
            if(st!=null)
                st.close();
        }catch(Exception e ){
            e.printStackTrace();
        }
        
    }
    
}
