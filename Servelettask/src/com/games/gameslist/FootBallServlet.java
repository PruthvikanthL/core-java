package com.games.gameslist;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/football")
public class FootBallServlet extends GenericServlet {
    public FootBallServlet(){
        System.out.println("FootBallServlet is started by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is Runninng in the FootBallServlet");
    }
}
