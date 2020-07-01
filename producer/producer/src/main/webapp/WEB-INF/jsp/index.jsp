<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import = "com.example.rabbitmq.producer.controller.MessageController" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE HTML>
<html>
  <head>

  </head>
  <body class="sp_subs" style="font-family:sans-serif;"  >


	<div class="sp_subs_frm">
		<div class="container">
			<div class="row">


				<div class="col-sm-4 col-sm-offset-4">
					<h2 class="text-center">Send Message</h2>

					<form method="get" action = "${pageContext.request.contextPath}/sendMessage" >

						<div class="form-group">
							<div class="input-group">

						      	<input style="font-family:sans-serif;" id="numberfield" type="text" name ="number" class="form-control">

							        <button id="onclick_func"  class="btn btn-default" type="submit" >Send</button>


                             </div>


						</div>
					</form>

					<h4 class="text-center">${MessageStatus}</h2>
				</div>
			</div>
		</div>
	</div>



  </body>
</html>