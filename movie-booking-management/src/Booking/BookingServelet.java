package Booking;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/book")
public class BookingServelet extends GenericServlet{
    public BookingServelet(){
        System.out.println("BookingServlet is Started by the Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running the service in the Booking servelet");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contact=servletRequest.getParameter("contact");
        String moviename=servletRequest.getParameter("moviename");
        String moviecost=servletRequest.getParameter("moviecost");
        int m_cost=0;
        if(moviecost!=null && moviecost!=""){
            m_cost=Integer.parseInt(moviecost);
        }
        String seats=servletRequest.getParameter("seat");
        int m_seat=0;
        if(seats!=null && seats!=""){
            m_seat=Integer.parseInt(seats);
        }
        String time=servletRequest.getParameter("time");
        String location=servletRequest.getParameter("location");
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("<h1>Thanks for Booking with Us!...");
        int payable=m_cost*m_seat;
        writer.println("<h2>Overall Details<h2>");
        writer.println("<h3>The Person name is --><h3>"+name);
        writer.println("<h3>The Contact number is --><h3>"+contact);
        writer.println("<h3>The Email is --><h3>"+email);
        writer.println("<h3>The movie name --><h3>"+moviename);
        writer.println("<h3>The movie cost for single person --><h3>"+moviecost);
        writer.println("<h3>The Total seat for is --><h3>"+seats);
        writer.println("<h3>The Total Amount Payable is --><h3>"+payable);
        writer.println("<h3>Make UPI for this number We will send Tickets -->8105546615<h3>");
        System.out.println("Customer Details");
        System.out.println("Name-->"+name);
        System.out.println("contactnumber-->"+contact);
        System.out.println("Email-->"+email);
        System.out.println("Moviename-->"+moviename);
        System.out.println("Movive Price-->"+moviecost);
        System.out.println("Total Seats-->"+seats);
        System.out.println("Location-->"+location);
        System.out.println("Total amout need to pay-->"+payable);

    }
}
