package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String usuario = request.getParameter("user_name");//Se pone el name del formulario
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: "+usuario);
        out.print("<br>");
        out.print("El parametro password es: "+password);
        out.print("</body>");
        out.print("</html>");
        
        out.close();

        
    }
}
