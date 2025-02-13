package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.http.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uemail = request.getParameter("Emailid");
		String pass = request.getParameter("pwd");
		
	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/templereservationsystem","root","root");
			PreparedStatement pst=con.prepareStatement("select * from User where EmailId=? and Password=?");
			pst.setString(1, uemail);
			pst.setString(2, pass);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				
				
				RequestDispatcher rd=request.getRequestDispatcher("home.html");  
		        rd.forward(request,response); 
	
			}
			else
			{
				out.println("<h1> login fail</h1>");
				RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		        rd.include(request,response);  
				
			}
			rs.close();
			con.close();
			out.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	
	}

}
/*CREATE TABLE `User` (
`Name` varchar(50) not NULL,
`EmailId` varchar(50) not NULL unique,
`Gender` varchar(11) not NULL,
`Address` varchar(100) not NULL,
`PhoneNo` varchar(10) not NULL,
`Password` varchar(50) not NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
*/