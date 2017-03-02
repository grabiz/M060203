<%-- 
    Document   : welcome
    Created on : Mar 2, 2017, 7:43:11 PM
    Author     : IVIETTECH EDUCATION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <label>Email:${email} </label><p></p>
        <label>Email:${requestScope.email} </label><p></p>
        <label>Email:${sessionScope.email} </label><p></p>
        <label>Email:${sessionScope.user.email} </label><p></p>
        <label>Email:${sessionScope.user.firstName} </label><p></p>
        <label>Email:${sessionScope.user.lastName} </label><p></p>
        <label>Email:${emailArr[0]} </label><p></p>
        <label>Email:${emailArr[1]} </label><p></p>
        <label>Email:${emailArr[2]} </label><p></p>
        
        <table>
            <tr>
                <th>Email</th> <th>FirstName</th> <th>LastName</th>
                
                
            </tr>
            <tr>
                <td>${userList[0].email}</td> 
                <td>${userList[0].firstName}</td>
                <td>${userList[0].lastName}</td>
                
                
            </tr>
            <tr>
                  <td>${userList[1].email}</td> 
                <td>${userList[1].firstName}</td>
                <td>${userList[1].lastName}</td>
                
                
            </tr>
            <tr>
                  <td>${userList[2].email}</td> 
                <td>${userList[2].firstName}</td>
                <td>${userList[2].lastName}</td>
                
                
            </tr>
           
            
        </table>
                
        <table>
            <tr>
                <th>Email</th> <th>FirstName</th> <th>LastName</th>
                
                
            </tr>
            <tr>
                <td>${mapUser["a@a"].email}</td> 
                <td>${mapUser["a@a"].firstName}</td>
                <td>${mapUser["a@a"].lastName}</td>
                
                
            </tr>
             <tr>
                <td>${mapUser["b@b"].email}</td> 
                <td>${mapUser["b@b"].firstName}</td>
                <td>${mapUser["b@b"].lastName}</td>
                
                
            </tr>
            
             <tr>
                <td>${mapUser["c@c"].email}</td> 
                <td>${mapUser["c@c"].firstName}</td>
                <td>${mapUser["c@c"].lastName}</td>
                
                
            </tr>
            
            
           
            
        </table>
       
        
        
    </body>
</html>
