<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<style type="text/css">
* {
    margin: 0;
    padding: 0;
}
.container {
    height: 70px;
    width: 800px;
    margin: 100px auto 0 auto;
}
.parent {
    position: relative;
}
.search {
    width: 300px;
    height: 40px;
    border-radius: 18px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
    position: absolute;

}
.btn{
    height: 35px;
    width: 35px;
    position: absolute;
    background: url(image/searchButton.png) repeat 2px 74px;
    top: 6px;
    left: 285px;
    border: none;
    outline: none;
    cursor: pointer;
}
</style>
<title>Insert title here</title>
</head>
<body>
   <div class="container">
    <form action="" method="post" class="parent">
        <input type="text" class="search" placeholder="搜索">
        <input type="submit" value=" " name="" id="" class="btn">

    </form>
</div>
</body>
</html>