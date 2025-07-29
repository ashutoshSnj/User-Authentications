package Com.User.Authentication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/checkservlet")
// Service layer
public class Usercheck extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User userObj = new User(username, password);
        
        System.out.println(username+password);
        Actual_User_Authentication businessObj = new Actual_User_Authentication();
        boolean result=false;
        if (req.getMethod().equalsIgnoreCase("get")) {
              result = businessObj.Verification(userObj);
        }
        if(req.getMethod().equalsIgnoreCase("post")) {
        	System.out.println("we called");
        	result=businessObj.ragisteruser(userObj);
        	System.out.println("we called");
        }
        
  
        PrintWriter myout = res.getWriter();

        
       
       
        res.setContentType("text/html");
        if (result) {
        	  
            HttpSession session = req.getSession(); 
            session.setAttribute("username", username); 
            session.setMaxInactiveInterval(10 * 60); 

            myout.println("<h2 style='color: green; text-align: center;'>User authenticated successfully!</h2>");
        } else {
            myout.println("<h2 style='color: red; text-align: center;'>Authentication failed! Please check your username and password.</h2>");
        }
    }
}
