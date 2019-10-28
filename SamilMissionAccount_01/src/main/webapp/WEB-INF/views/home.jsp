<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
		<jsp:include page="/resources/cmm/jsp/inBootHeadLink.jsp"/>
		
		<jsp:include page="/resources/cmm/jsp/inJqueryHeadScript.jsp"/>
	</head>
	<body>
		<h1>
			Hello world!  
		</h1>
		
		<P>  The time on the server is ${serverTime}. </P>
		<div class="container">
			<div class="row">
				<form class="form-inline" action="/" method="get">
					<div class="form-group">
						<label class="sr-only" for="user">ID</label>
						<input type="email" class="form-control" id="user" placeholder="Enter UserId">
					</div>
					<div class="form-group">
						<label class="sr-only" for="password">Password</label>
						<input type="password" class="form-control" id="password" placeholder="Password">
					</div>
					<div class="checkbox">
						<label>
							<input type="checkbox"> Remember me
						</label>
					</div>
					<button type="submit" class="btn btn-default">Sign in</button>
				</form>
			</div>
		</div>
		
		<jsp:include page="/resources/cmm/jsp/inBottomBodyScript.jsp"/>
	</body>
</html>
