package com.games.gameslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/volleyball")
public class VolleyBallServlet extends GenericServlet {
    public VolleyBallServlet(){
        System.out.println("VolleyBallServlet is started by the tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Runninng the service in the VolleyBallServlet");
    }
}
