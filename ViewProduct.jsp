<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "org.h2.Driver";
String connectionUrl = "jdbc:h2:tcp://localhost/~/test";
String userId = "sa";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Product In Store</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="Purple">
<td><b>Product ID</b></td>
<td><b>Product Name</b></td>
<td><b>Product Brand</b></td>
<td><b>Product Price</b></td>
<td><b>Product Description</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();
String sql ="select*from ADDPRODUCT;";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="Fuchsia">

<td><%=resultSet.getString("Pid") %></td>
<td><%=resultSet.getString("pname") %></td>
<td><%=resultSet.getString("brand") %></td>
<td><%=resultSet.getString("pprice") %></td>
<td><%=resultSet.getString("pdesc") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
