package com.productmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/html");
		 Integer pid = Integer.parseInt(request.getParameter("pid"));
		 
		 ServletContext contxt = getServletContext();
		 
		  ServletConfig config = getServletConfig();
		 
		 System.out.println( config.getInitParameter("config1"));
		 
		  
		 String username = (String) contxt.getInitParameter("dbuser");
		  String pwd = (String) contxt.getInitParameter("dbpwd");
		  
		  System.out.println(username +  ":: " + pwd);
		  
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_managment", username,pwd);
				
				 PreparedStatement preparedStatment = conn.prepareStatement("select * from product where id = ? ");
				 
				 preparedStatment.setInt(1, pid); // ID

				 
				  ResultSet rs = preparedStatment.executeQuery();
				 
				  rs.next();
				 
				 out.println("<center>");
				 out.println("<h1 style=\"color:red\"> Prodcut Insert Succesfully Following Details</h1>");
				 
				 out.println("<b>PID   : </b>"+ rs.getInt("id"));
				 out.println("</br>");
				 out.println("<b>PNAME :</b>" + rs.getString("name"));
				 out.println("</br>");
				 out.println("<b>QUNTY :</b>" + rs.getInt("QUANTITY"));
				 out.println("</br>");
				 out.println("<b>PRICE :</b>" + rs.getInt("PRICE"));
				 out.println("</br>");
				 out.println("</center>");
				
				 conn.close();
				 
				}catch(SQLException | ClassNotFoundException ex) {
					out.println("<center>");
					out.println(ex.getMessage());
					out.println("</center>");
				}
		
	}

}
