package com.games.gameslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/badminton")
public class BadmintonServlet extends GenericServlet {
    public BadmintonServlet(){
        System.out.println("BadmintonServlet is started by the Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Runninng the Service in the BadmintonServlet");
    }
}
