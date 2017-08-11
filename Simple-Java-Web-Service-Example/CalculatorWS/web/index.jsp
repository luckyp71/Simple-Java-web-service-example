<%-- 
    Document   : index
    Created on : Aug 11, 2017, 8:55:15 PM
    Author     : Lucky Pratama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test Calculator Web Service</h1>
        
        <a href="<%=request.getContextPath()%>/CalculatorWS?Tester">Go to Tester</a> <br/><br/>
        <a href="<%=request.getContextPath()%>/CalculatorWS?wsdl">Go to WSDL File</a> <br/><br/>
        <a href="<%=request.getContextPath()%>/CalculatorWS">Go to Web Services</a> <br/><br/>
    </body>
</html>
