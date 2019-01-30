<%-- 
    Document   : welcome
    Created on : Jan 1, 2019, 10:34:47 AM
    Author     : mohit2906
--%>

<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        
        <style type="text/css">
		*{
			margin:0;
			padding:0;
		}
		#btnlogout{
				width: 150px;
				height:50px; 
				text-align: center;
				font-family: arial;
				background-color: red; 
				border:0px solid black;
				font-size: 25px;
				font-weight: bold;
				float: right;
				margin-top: 10px;
				border-radius: 5px;
				margin-right: 10px;
		}
                .header{
                    width:98.7vw;
                    height:10vh;
                    background-color: #ccc;
                }
                .header1{
                    margin-right: 20px;
                }
                .header1 li{
                    display:block;
                    float: right; 
                    width:auto;
                    height:3vh;
                    padding: 10px;
                    background-color: coral;
                    margin-left: 5px;
                    text-align: center;
                    margin-top: 10px;
                 }
                 #info{
                     text-decoration: none;
                     color:black;
                 }
                 .subheader{
                     display:block;
                     
                 }
                 .middle{
                     
                     background-color: coral;
                     height:100vh;
                 }
                 
                 #updatesubmit
                 {
                     width:200px;
                     height:50px;
                     background-color: blue;
                     border:1px solid black;
                     margin-left: 100vh;
/*                     margin-top: 50px; */
                     margin-top: 40px;
                     margin-bottom: 50px;
                     color:white;
                     font-size: 36px;
                     border:none;
                     padding: 8px 16px;
                     text-align: center;
                 }
                 #logout{
                     width:200px;
                     height:50px;
                     background-color: blue;
                     border:1px solid black;
                     margin-left: 100vh;
                     text-decoration: none;
                     color:white;
                     font-size: 36px;
                     border:none;
                     padding:8px 40px;
                     text-align: center;
                     margin-bottom: 100px;
                    
                 }
                 #deleteaccount
                 {
                     width:200px;
                     height:50px;
                     background-color: red;
                     border:1px solid black;
                     margin-left: 100vh;
/*                     margin-top: 200px; */
                     text-decoration: none;
                     color:white;
                     font-size: 25px;
                     border:none;
                     padding:8px 23px;
                     text-align: center;
                     margin-top: 150px;
                    
                 }
	</style>
        
    </head>
    <body>
        
       
        
        <% 
            
            String pho ="";
            String pa ="";
            int i=0;
            Cookie cookies[]= request.getCookies();
            System.out.println("we are in welcome.jsp");
           
//            for(Cookie c: cookies)
//            {
//                i++;
//                if(c.equals("ph"))
//                {
//                    pho = c.getValue().toString();
//                    System.out.println(pho + "hereeeeeeeeee phone ");
//                }
//               else
//                {
//                    pa = c.getValue().toString();
//                    System.out.println(pa + "Here password");
//                }
//            }
            System.out.println(cookies[2].getValue() + "Phone number");
            
           //System.out.println("total : " + i);
          
         
            if(pho==null || pa==null)
            {
                response.sendRedirect("index.jsp");
            }
            
            else
            {
               response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); // To Prevent Back Button
               response.setHeader("Pragma","no-cache");
               response.setHeader("Expires","0");
            } 

           
            
         %>
         
         
 
         
         <div class="header">
             <ul class="header1">
                 <li><% out.print(cookies[2].getValue()); %></li>
             <li>
                  <form action="show.jsp" method="">
                      <input type="submit" value="get All User information" name="show" style="background-color:coral;border:none;">
                  </form>
             </li>
                 
             </ul>
         </div>

            
             
       
             <div class="middle">
                 <form action="update.jsp" method="get">
                     <input type="submit" value="Update" name="update" id="updatesubmit">
                 </form> 
                 <a href="index.jsp" id="logout">Log Out</a><br><br><br><br>
                 <a href="delete.jsp" id="deleteaccount">Delete Account</a>
            </div>
        
    </body>
</html>
