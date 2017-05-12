package DatabaseConnectivity;

import java.sql.*;

/**
 *
 * @author Abhishek Poddar
 */

public class DatabaseActivity {
    public static Connection con;
    public ResultSet rs;
    public Statement st;
    static{
        try{
         con=DataFactory.getConnectionToDb();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // Showing all the data
    public void showData() throws SQLException{
        String sql1 ="select * from a";
        st=con.createStatement();
        rs=st.executeQuery(sql1);
        System.out.println(rs);
        while(rs.next()){
            System.out.print(rs.getString(1)  + " ");
            System.out.print(rs.getString(2)  + " ");
            System.out.print(rs.getInt(3)  + " ");
            System.out.println();
        }
        
    }
    
    //For inserting image in the database 
    public void insertImage(String uname , String email , String loc , String amount , String state , String cat){
        
    }
    
    
    //FOr retrieving image
    public String retrieveImage(){
        return "";
    }
    
    // For showing the project list
    public int  registerProject(String name , String cat , String Pname , int a ,String imageLoc , String pdetails ) throws SQLException{
        //Username varchar(20) , category varchar(20) ,  ProjectName varchar(50)
        //,ProjectFundReq int(10) ,   ProjectFunCol int(10) ,  ImageLoc varchar(100)
        
        //int amount = Integer.parseInt(amount1);
        String sql = "insert into Project_Register values(?,?,?,?,?,? ,?)";
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setString(1, name);
        pr.setString(2,cat);
        pr.setString(3,Pname);
        
        pr.setInt(4, a);
        pr.setInt(5, 0);
        pr.setString(6, imageLoc);
        pr.setString(7, pdetails);
        
       int f = pr.executeUpdate();
       if(f>0)
        return 1;
       else 
         return 0;
        
      
    }
    
    //For checking the username and password
    public int authenticateUser(String name , String passwd) throws SQLException{
        String sql = "select * from Registration where Username=?";
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setString(1, name);
        ResultSet rs = pr.executeQuery();
          while(rs.next()){
           if(rs.getString(1).equals(name) && rs.getString(3).equals(passwd))
                 return 1;   
       } 
        return 0;
    }
    
    //For registration 
    public int registerUser(String UserName , String email , String password  , String phone) throws SQLException{
        String sql = "insert into Registration values(?,?,?,? ,?)";
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setString(1, UserName);
        pr.setString(2, email);
        pr.setString(3, password);
        pr.setString(4, phone);
        pr.setInt(5, 0);
        
        
        int f = pr.executeUpdate();
        if(f>0)
            return 1;
        else 
           return 0;
    }
    
    
    public static void main(String[] args) throws SQLException {
        DatabaseActivity db = new DatabaseActivity();
       int a= db.registerProject("a", "a", "a",  5, "a", "a");
        System.out.println(a);
       
    }
    
    
   
}

