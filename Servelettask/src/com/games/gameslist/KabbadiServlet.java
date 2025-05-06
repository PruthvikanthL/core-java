package com.games.gameslist;

import javax.jws.WebResult;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/kabbadi")
public class KabbadiServlet extends GenericServlet {
    public KabbadiServlet(){
        System.out.println("KabbadiServlet is started by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running the Service method in the KabbadiServlet");
    }
}
