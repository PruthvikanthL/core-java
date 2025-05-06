package com.games.gameslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/hockey")
public class HockeyServlet extends GenericServlet {
    public HockeyServlet(){
        System.out.println("HockeyServlet is started by the Tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Runinng the Service in the HockeyServlet");
    }
}
