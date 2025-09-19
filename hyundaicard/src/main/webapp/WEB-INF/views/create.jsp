<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="include/header.jsp" flush="false"/>

<h1>쓰기</h1>
<form method="POST">
<!-- get과 post가 있으나 get은 보안에 취약하여 포스트를 사용함 -->
<label>제목 : </label>
<input type="text" name="title"/><br/>

<label>카테고리 : </label>
<input type="text" name="category"/><br/>

<label>가격 : </label>
<input type="text" name="price"/><br/>

<input type="submit" value="저장"/>







</form>

<jsp:include page="include/footer.jsp" flush="false"/>