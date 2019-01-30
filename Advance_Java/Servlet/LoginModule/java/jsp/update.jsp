
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            *{
                margin:0;
                padding:0;
            }
            .updateform{
                /*padding: 10px;*/
                background-color: #f1f1f1;
                height:100vh;
            }
            #headerh1{
                letter-spacing: 5px;
                 padding:10px;
                 margin: 10px;
            }
            .formupdate{
                border:1px soild black;
                width:50%;
                height:50%;
                padding: 10px;
            }
            .updateinfo{
                /*border: 0px solid black;      */
                padding:10px;
                margin: 10px;
                border:none;
            
            }
            #submitinfo
            {
                font-weight: bold;
                box-shadow: 1px 1px 1px 1px gray;
            }
            #submitinfo:hover{
                background-color: coral;
               
            }
            
            #previous{
                text-decoration: none;
                width:100px;
                height:20px;
                padding: 20px;
                margin:10px;                
                color:black;
                background-color: #ccc;
                float:right;
                text-align: center;
            }
        </style>
        <title>Update Your Information</title>
    </head>
    <body>
        <% 
            String pho="";
            String pa="";
            Cookie cookies[] = request.getCookies();
            System.out.println("We are in Update page");
            for(Cookie c:cookies)
            {
                if(c.equals("pho"))
                {
                    pho = c.getValue();
                    System.out.println(pho);
                }
                else
                {
                    pa = c.getValue();
                    System.out.println(pa);
                }
            }
            if(pho==null && pa==null)
            {
                response.sendRedirect("index.jsp");
            }
        
        
        %>
        <div class="updateform">
            <a href="welcome.jsp" id="previous">Previous</a>
            <form class="formupdate" action="validateUpdate.jsp" method="get">
                <h1 id="headerh1">Update</h1>
                <input type="text" name="ufirst_name" placeholder="Enter your Name:" class="updateinfo">
                <input type="text" name="ulast_name" placeholder="Enter your last Name:" class="updateinfo"><br>
                <input type="email" name="uemail_id" placeholder="Enter your Email id" class="updateinfo" style="width:"><br>
                <input type="text" name="umobile_no" placeholder="Enter mobile no:" class="updateinfo">
                <input type="date" name="udob" class="updateinfo"><br>
                <input type="password" name="upwd" placeholder="Enter password" class="updateinfo">
                <input type="password" name="reupwd" placeholder="Enter password again" class="updateinfo"><br>
                <input type="radio" name="rd1" value="male" class="updateinfo">Male &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="rd1" value="female" class="updateinfo">Female<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="Update" class="updateinfo" style="width:100px;" id="submitinfo">
                
            </form>
                
        </div>
    </body>
</html>
