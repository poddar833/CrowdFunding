
package ServletClasses;
import DatabaseConnectivity.DatabaseActivity;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Abhishek Poddar
 */
public class RegisterEvent extends HttpServlet {
    int flag;
    String dloc;
    private final String loc ="C:\\Users\\Abhishek Poddar\\Documents\\NetBeansProjects\\final project\\web\\images";
    String newLoc;
    String name;
    String email;
    String cat;
    String pname;
    String amount;
    String state;
    String pdetails;
    
    @Override
    public void init(){}
    @Override
    public void service(HttpServletRequest request , HttpServletResponse response) throws IOException{
        HttpSession s = request.getSession();
        PrintWriter out = response.getWriter();
        if(ServletFileUpload.isMultipartContent(request)){
            try{
                List<FileItem> multiparts = (List<FileItem>) new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                for(FileItem i : multiparts){
                    if(i.isFormField()){
                        
                        if(i.getFieldName().equals("uname")){
                            name=i.getString();
                            System.out.println(name);
                            newLoc=loc+"/"+name;
                            File f = new File(newLoc);
                            f.mkdir();
                        }
                        else if(i.getFieldName().equals("cat"))
                            cat=i.getString();
                        else if(i.getFieldName().equals("Pname"))
                            pname=i.getString();
                        else if(i.getFieldName().equals("amount"))
                            amount=i.getString();
                        else if(i.getFieldName().equals("state"))
                            state=i.getString();
                        else if(i.getFieldName().equals("pdetails"))
                            pdetails=i.getString();     
                    }
                     else{
                        String name1 = new File(i.getName()).getName();
                         dloc  = newLoc + File.separator + name1;
                        i.write(new File(dloc ));
                                }
                }
                
            }catch(Exception e ){
                
            }
        }  
        out.print(dloc);
        DatabaseActivity db = new DatabaseActivity();
        int z=0 ;
        try {
           z = db.registerProject(name ,cat ,  pname , 5, dloc ,pdetails);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(z==1)
            response.sendRedirect("index.jsp");
        else
            response.sendRedirect("registrationError.jsp");
    }
    @Override
    public void destroy(){}

    
}
