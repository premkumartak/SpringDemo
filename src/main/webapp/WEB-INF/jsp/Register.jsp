<html>
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow">

    <title>Registration form </title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style type="text/css">
    body{
    background-color: #525252;
}
.centered-form{

}

.centered-form .panel{
	background: rgba(255, 255, 255, 0.8);
	box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
}
    </style>
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
    	
    	// Function to get input value.
    	$('#register').click(function() {
    		alert("hello");
    	var first_name = $("#first_name").val();
    	var last_name =$("#last_name").val();
    	var  email=$("email").val();
    	var password=$("password").val();
    	var user = {};
    	user.first_name = first_name;
    	}};

    	 $.ajax({
             type: "POST", 		//GET or POST or PUT or DELETE verb
             url: "http://localhost:8090/demoApp/users/registerUser", 		// Location of the service
             data: user, 		//Data sent to server
             contentType: "application/json",		// content type sent to server
         });

         return false;
     });
    </script>
    
</head>
<body>


<div class="panel-body" style="margin-bottom: 10px ;padding: 313px;">
<Center><h3>Register Please</h3></Center><br><br>
			    		<form action="/demoApp/users/registerUser" role="form" method="post">
			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			                <input type="text" name="first_name" id="first_name" class="form-control input-sm" placeholder="First Name">
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="text" name="last_name" id="last_name" class="form-control input-sm" placeholder="Last Name">
			    					</div>
			    				</div>
			    			</div>

			    			<div class="form-group">
			    				<input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address">
			    			</div>

			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
			    					</div>
			    				</div>
			    				
			    			</div>
			    			
			    			<input type="submit" id="register" value="Register" class="btn btn-info btn-block">
			    		
			    		</form>
			    	</div>
			    	</body>
			    	</html>