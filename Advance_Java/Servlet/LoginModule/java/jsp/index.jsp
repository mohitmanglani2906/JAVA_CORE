


<!DOCTYPE html>
<html>
<head>
	<title>Sign up</title>
	<style type="text/css">
		*{
			padding:0;
			margin:0;
		}
		.header{
			width:98.7vw;
			height:10vh;
			background-color: white;
			color: black;
			box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
			position: fixed;
                        z-index: 1000;
			top: 0px;
		}
		.h1{
			margin-right:15px;
		}
		a{
			text-decoration:none;
			width: 100px;
			padding: 8px 16px;
			color: black; 
		}
		.h1 li{
			float:right;
			display:block;
			width:60px;
			
			padding: 8px 16px;
			margin-top: 15px;
		}
		.h1 a:hover{
			background-color:#ccc;
			color: black;
			font-weight: bold;
			border-radius: 20px;
		}

		.middle{
			width:98.7vw;
			height:95vh;
                        margin-top: 100px;
                        background-color: #f1f1f1;
			
		}
		.login{
			width:49vw;
			
			height: 100vh;
			float: left;
		}
		.signup{
			width:49.7vw;
			
			height:100vh;
			float: left;
		}
		.formfill{
			width:70%;
			height:70%;
			background-color:white;
			margin-left: 50px;
			margin-top: -50px;
			background-color:coral;
			border-radius:40px;
                        box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
		}


		.signup_input{
				width:calc(200px-8px);
				height:3vh;
				padding: 8px; 
				border:1px solid black;
				margin-top: 40px;
		}
		.signupform{
			margin-left: 50px;
			margin-top: 50px;
			
		}
		#btnsubmit{
			width:150px;
			height:50px;
			color: black;
			font-family: verdana;
			text-align: center;
			font-weight: 800;
			font-size: 15px;
			border:0px solid black;
			background-color:#ccc;
		}
		#btnsubmit:hover
		{
			background-color: white;
		}
		.loginform{
			width:50%;
			height:50%;
			background-color:coral;
			margin-left: 100px;
			margin-top: 50px;
			border-radius: 20px;
                        box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);
		}
		.login_input{
				width:calc(200px-8px);
				height:3vh;
				padding: 8px; 
				border:1px solid black;
				margin-top: 40px;
				margin-left: 50px;
		}
		#btnlogin{
			width:150px;
			height:50px;
			color: black;
			font-family: verdana;
			text-align: center;
			font-weight: 800;
			font-size: 15px;
			border:0px solid black;
			background-color:#ccc;
			margin-top: 15px;
			margin-left: 50px;
		}
		#btnlogin:hover{
			background-color: white;
		}
	</style>


</head>
<body>	
        
	<div class="header">
		<ul class="h1">
			<li><a href="#address">Address</a></li>
			<li><a href="#contact">Contact</a></li>
			<li><a href="#about">About</a></li>
		</ul>
	</div>

	<div class="middle">

		<div class="login">
			<div class="loginform">
				<form action="loginadd" method="post">
					<h1 style="margin-left: 30px;">Log in your Account</h1>
					<input type="text" name="phone" placeholder="Enter Mobile no" class="login_input"><br>
					<input type="password" name="pwd" placeholder="Password" class="login_input" style="margin-top: 15px;"><br>
					<input type="submit" name="btnlogin" value="Log In" id="btnlogin">
				</form>
			</div>
			

		</div>

		<div class="signup">
			
			<div class="formfill">
				<form action="validate.jsp" method="post" style="margin-top: 100px;" class="signupform">
					<h1>Create An Account Free!!</h1>
					<input type="text" name="fname" placeholder="First Name" class="signup_input">
					<input type="text" name="lname" placeholder="Last Name " class="signup_input">
					<input type="email" name="email" placeholder="Enter Email" class="signup_input" style="margin-top: 15px;width:360px">
					<input type="text" name="phone" placeholder="Enter Mobile no" class="signup_input" style="margin-top: 15px;">
					<input type="date" name="dob" placeholder="Date of Birth " class="signup_input" style="margin-top: 15px;width:170px;">
					<input type="password" name="pwd" placeholder="Enter password " class="signup_input" style="margin-top: 15px;">
					<input type="password" name="repwd" placeholder="ReEnter password " class="signup_input" style="margin-top: 15px;">
					<br><br>

					<input type="radio" name="rd1" value="male"  style="margin-top: 0px;padding: 0px;"> Male
					&nbsp;&nbsp;
					<input type="radio" name="rd1" value="female"  style="margin-top: 0px;padding: 0px;"> Female
					<br><br>
					<input type="submit" name="btn" value="Create Account"  id="btnsubmit" 
                                                                                               
					>					
				</form>
			</div>
			
		</div>
	</div>
       
</body>
</html>
