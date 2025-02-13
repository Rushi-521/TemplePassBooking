package com.java;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/BookdarshanServlet")
public class BookdarshanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookdarshanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String fullname=request.getParameter("fullname");
		String mobileno=request.getParameter("mobileno");
		String address=request.getParameter("address");
		String date=request.getParameter("date");
		String gendar=request.getParameter("gendar");
		String cardname=request.getParameter("cardname");
		String cardnumber=request.getParameter("cardnumber");
		String cardcvc=request.getParameter("cardcvc");


		
		try {
			  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/templereservationsystem", "root", "root" );  
			      
			PreparedStatement ps=con.prepareStatement("insert into bookdarshan(fullname,mobileno,address,date,gendar,cardname,cardnumber,cardcvc) values(?,?,?,?,?,?,?,?)");  
			ps.setString(1,fullname);    
			ps.setString(2, mobileno);
			ps.setString(3, address);
			ps.setString(4, date);
			ps.setString(5, gendar);
			ps.setString(6, cardname);
			ps.setString(7, cardnumber);
			ps.setString(8, cardcvc);
			      
		/*if(ps.executeUpdate()>0);
		{
			out.println("sucess");
		}*/
			
			if(ps.executeUpdate() > 0) {
			    RequestDispatcher rd = request.getRequestDispatcher("Bookdarshan.jsp");
			    rd.forward(request, response);
			}
		
			con.close();
			          
			}
	catch(Exception e)
	{
		System.out.println(e);
		}  
	out.close();




}

		
}








	
		
		
		
		
		



	
		
	