package com.user.Authentication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/checkservlet")
// Service layer
public class Usercheck extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
  
        PrintWriter myout = res.getWriter();

        
        User userObj = new User(username, password);
        Actual_User_Authentication businessObj = new Actual_User_Authentication();
        boolean result = businessObj.Verification(userObj);

       
        res.setContentType("text/html");
        if (result) {
            myout.println("<h2 style='color: green; text-align: center;'>User authenticated successfully!</h2>");
        } else {
            myout.println("<h2 style='color: red; text-align: center;'>Authentication failed! Please check your username and password.</h2>");
        }
    }
}
