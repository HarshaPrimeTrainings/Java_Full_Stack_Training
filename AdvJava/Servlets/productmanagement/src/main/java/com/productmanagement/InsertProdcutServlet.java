package com.productmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertProdcutServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/html");
		 Integer pid = Integer.parseInt(request.getParameter("pid"));
		 String pname =request.getParameter("pname");
		 Integer qnty = Integer.parseInt(request.getParameter("qnty"));
		 Integer price = Integer.parseInt(request.getParameter("price"));
		 
		 
		  ServletContext contxt = getServletContext();
		   String username = (String) contxt.getInitParameter("dbuser");
		  String pwd = (String) contxt.getInitParameter("dbpwd");
		  
		  System.out.println(username +  ":: " + pwd);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_managment", username,	pwd);
		
		 PreparedStatement preparedStatment = conn.prepareStatement("insert into product values(?,?,?,?) ");
		 
		 preparedStatment.setInt(1, pid); // ID
		 preparedStatment.setString(2, pname); // Product Name
		 preparedStatment.setInt(3, qnty); // Quantity
		 preparedStatment.setInt(4, price); // Price
		 
		 preparedStatment.execute();
		 
		 
		 out.println("<center>");
		 out.println("<h1 style=\"color:red\"> Prodcut Insert Succesfully Following Details</h1>");
		 out.println("<b>PID   : </b>"+ pid);
		 out.println("</br>");
		 out.println("<b>PNAME :</b>" + pname);
		 out.println("</br>");
		 out.println("<b>QUNTY :</b>" + qnty);
		 out.println("</br>");
		 out.println("<b>PRICE :</b>" + price);
		 out.println("</br>");
		 out.println("</center>");
		
		 conn.close();
		 
		}catch(SQLException | ClassNotFoundException ex) {
			out.println("</center>");
			out.println(ex.getMessage());
			out.println("</center>");
		}

	}

}
