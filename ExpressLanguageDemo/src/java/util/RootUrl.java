/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IVIETTECH EDUCATION
 */
public class RootUrl {
     public static String getRootUrl(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
     {
     String scheme = req.getScheme() + "://";
     String serverName = req.getServerName();
     String serverPort = (req.getServerPort() == 80) ? "" : ":" + req.getServerPort();
     String contextPath = req.getContextPath();
     return scheme+serverName+serverPort+contextPath;
     
     }
}
