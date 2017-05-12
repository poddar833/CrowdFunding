package ServletClasses;
import DatabaseConnectivity.DatabaseActivity;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek Poddar 
 */
public class Registeration extends HttpServlet {
    int flag=0;
    @Override
    public void init(){}
    @Override
    public void service(HttpServletRequest request , HttpServletResponse response) throws IOException{
        String UserName = request.getParameter("UserName");
        String email = request.getParameter("Email");
        String passwd= request.getParameter("Password");
        String phone = request.getParameter("Phone");
        
        DatabaseActivity db = new DatabaseActivity();
        try {
            flag=db.registerUser(UserName, email, passwd , phone);
        } catch (SQLException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag==1)
            response.sendRedirect("index.jsp");
        else
            response.sendRedirect("registrationError.jsp");
            
            
        
            
        
        
        
        
        
        
    }
    @Override
    public void destroy(){}

}
