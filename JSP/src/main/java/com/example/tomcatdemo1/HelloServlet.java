package com.example.tomcatdemo1;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello


        request.setAttribute("messageRequest","HelloRequest from Servlet");
        request.getSession().setAttribute("messageSession","HelloSession from Servlet");

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i=0; i<11; i++)
            numeros.add(i);
        request.setAttribute("numeros",numeros);


        try {
            request.getRequestDispatcher("page.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }


    public void destroy() {
    }
}