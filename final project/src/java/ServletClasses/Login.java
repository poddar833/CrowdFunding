

package ServletClasses;

import DatabaseConnectivity.DatabaseActivity;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
/**
 *
 * @author Abhishek Poddar 
 */
public class Login extends HttpServlet {
    int flag;
    
    @Override
    public void init(){}
    @Override
    public void service(HttpServletRequest request  , HttpServletResponse response) throws ServletException, IOException{
        String username  = request.getParameter("Username");
        String password  = request.getParameter("Password");
        DatabaseActivity db = new DatabaseActivity();
        try {
            flag = db.authenticateUser(username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag==1){
            HttpSession session = request.getSession();
            session.setAttribute("name", username);
            response.sendRedirect("index.jsp");
        }
        else{
            response.sendRedirect("loginError.jsp");
        }
    }
    @Override
    public void destroy(){}

}
