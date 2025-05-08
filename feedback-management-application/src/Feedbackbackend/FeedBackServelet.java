package Feedbackbackend;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/feedback")
public class FeedBackServelet extends GenericServlet {
    public FeedBackServelet(){
        System.out.println("FeedBackServelet is started by Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Feedback form is Running");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contact=servletRequest.getParameter("contact");
        String feedback=servletRequest.getParameter("feedback");
        System.out.println("name is-->"+name);
        System.out.println("email is-->"+email);
        System.out.println("contact number is-->"+contact);
        System.out.println("Feedback is-->"+feedback);
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(name+" Thanks for the Feedback");
    }
}
