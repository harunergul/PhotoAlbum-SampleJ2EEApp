<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<title>Page Title</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="">
<style>
</style>
<script src=""></script>
<body>


	<div class=""></div>

	<h3>Photos</h3>
	<%@ page import ="com.harunergul.*" %>

	<%
		ServletContext context = pageContext.getServletContext();

		PhotoAlbum pa = PhotoAlbum.getPhotoAlbum(context); 

         out.println("Your IP address is " + request.getRemoteAddr());
		
		 
        
      %>
      <p> Photo Count: <%  out.println(pa.getPhotoCount());  %></p>

</body>
</html>