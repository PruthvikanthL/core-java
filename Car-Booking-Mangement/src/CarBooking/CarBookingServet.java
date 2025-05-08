package CarBooking;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/carbook")
public class CarBookingServet extends GenericServlet{
    public CarBookingServet(){
        System.out.println("CarBookingServet is Started by the Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running the service in the CarBookingServet");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contact=servletRequest.getParameter("contact");
        String carname=servletRequest.getParameter("carname");
        String carcost=servletRequest.getParameter("carcost");
        int c_cost=0;
        if(carcost!=null && carcost!=""){
            c_cost=Integer.parseInt(carcost);
        }

        String time=servletRequest.getParameter("time");
        String location=servletRequest.getParameter("location");
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("<h1>Thanks for Booking with Us!...");

        writer.println("<h2>Overall Details<h2>");
        writer.println("<h3>The Person name is --><h3>"+name);
        writer.println("<h3>The Contact number is --><h3>"+contact);
        writer.println("<h3>The Email is --><h3>"+email);
        writer.println("<h3>The car name --><h3>"+carname);
        int total=c_cost*10000*2344;
        writer.println("<h3>The car cost is  --><h3>"+c_cost);
        writer.println("<h3>The Total Amount Payable after all taxes is --><h3>"+total);
        writer.println("<h3>Make UPI for this number We will Deliver car -->8105546615<h3>");
        System.out.println("Customer Details");
        System.out.println("Name-->"+name);
        System.out.println("contactnumber-->"+contact);
        System.out.println("Email-->"+email);
        System.out.println("Carname-->"+carname);
        System.out.println("CarPrice-->"+carcost);
        System.out.println("Location-->"+location);
        System.out.println("Total amout need to pay after all taxes-->"+total);

    }
}
