<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<jsp:include page="/resources/cmm/jsp/inBootHeadLink.jsp"/>
		<style media="screen">
	      .top-30 {
	        top:30px;
	      }
	      .mar-top-30 {
	        margin-top: 30px;
	      }
	      .input_align_right {
	        text-align: right;
	        padding-right:5px;
	      }
	      input[type="number"]::-webkit-outer-spin-button, input[type="number"]::-webkit-inner-spin-button {
	          -webkit-appearance: none;
	          margin: 0;
	      }
	    </style>
	    
		<jsp:include page="/resources/cmm/jsp/inJqueryHeadScript.jsp"/>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<form class="form-inline">
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