<%@page import="com.DB.DbConnect" %>
<%@page import="java.sql.Connection" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="all_component/all_css.jsp"%>
<style type="text/css">
.back-img {
	background: url("img/p1.jpg");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	
	<%-- <% Connection conn= DbConnect.getconn();
	out.println(conn);%> --%>
	

	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-white p-4">
				<i class="fa fa-book" aria-hidden="true"></i> Online Job Portal
			</h1>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>
</body> 
</html>