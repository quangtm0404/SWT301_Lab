<%-- 
    Document   : index.jsp
    Created on : Oct 11, 2022, 9:45:37 PM
    Author     : MinhQuang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <style>
            form {
                margin: 0 auto;
                margin-top: 100px;
                width:250px;
            }
        </style>
        <form action="DateTimeCheckerController" method="GET"> 
            <table>
                <tr>
                    <td>Year</td> <td><input type="text" name="year" required=""></td>

                </tr>
                <tr>
                    <td>Month </td> <td><input type="text" required="" name="month"></td>
                </tr>
                <tr>
                    <td>Day</td><td> <input type="text" required="" name="day"></td>
                </tr>
                <tr><td><input type="submit" value="Check"></td></tr>
            </table>
            <c:if test="${requestScope.MESSAGE != null}"> 
                <h2 name="message">${requestScope.MESSAGE}</h2> 
            </c:if>
        </form>
    </body>
</html>