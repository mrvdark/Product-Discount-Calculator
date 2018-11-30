<%--
  Created by IntelliJ IDEA.
  User: mrv
  Date: 30/11/2018
  Time: 08:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css.css" />
  </head>
  </head>
  <body>
  <div id="content">

    <h1>Product Discount Calculator</h1>

    <form method="post" action="${pageContext.request.contextPath}/Discount">

      <div id="data">

        <label>Product Description:</label>
        <input type="text" name="productDescription"/><br/>
        <label>List Price:</label>
        <input type="text" name="listPrice"/><br/>
        <label>Discount Percent:</label>
        <input type="text" name="discountPercent"/><br/>

      </div>

      <div id="buttons">
        <label>&nbsp;</label>
        <input type="submit" value="Calculate Discount"/>

      </div>

    </form>

  </div>


  </body>
</html>
