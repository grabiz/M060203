/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import util.RootUrl;

/**
 *
 * @author IVIETTECH EDUCATION
 */
@WebServlet ("/expressLanguage")
public class ExpressLanguageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        String email = req.getParameter("email");
        req.setAttribute("email", email);
        HttpSession session = req.getSession();
        session.setAttribute("email", email);
        User user = new User("a@a","ghgh","gfdhgd");
        User user1 = new User("b@b","ghgh","gfd");
        User user2 = new User("c@c","ghgh","gfdhgd");
        session.setAttribute("user",user);
        String[] emailArr = {"h@gmail.com","lotus@gf","sa@gh"};
        req.setAttribute("emailArr",emailArr);
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        req.setAttribute("userList", userList);
        
        Map<String,User> mapUser = new HashMap<String,User>();
        
        mapUser.put(user.getEmail(), user);
        mapUser.put(user1.getEmail(), user1);
        mapUser.put(user2.getEmail(), user2);
       
        req.setAttribute("mapUser", mapUser); // 2 thang nay trung ten ?? check lai
        
        getServletContext().getRequestDispatcher("/welcome.jsp").forward(req,resp);

    }
    
}
