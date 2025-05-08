package NammaAdhar;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/adhar")
public class NammaAdhar extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running the Service in the NammaAdhar");
        String num=servletRequest.getParameter("adhar");
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        if(num.length()==12){
            writer.println("You Entered Correct Aadhar number");
            System.out.println("adhar number is -->"+num);
        }
        else{
            writer.println("You have Entered Wrong adhar number");
        }
    }
}
