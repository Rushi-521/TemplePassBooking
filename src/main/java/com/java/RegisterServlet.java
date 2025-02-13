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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String Uname=request.getParameter("name");
		String Uemail=request.getParameter("EmailUser");
		String Ugender=request.getParameter("Gender");
		String Uaddress=request.getParameter("Addr");
		String M_no=request.getParameter("MobileNo");
		String pass=request.getParameter("password1");
		
		
		
		
		try {
			  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/templereservationsystem", "root", "root" );  
				      
				PreparedStatement ps=con.prepareStatement("insert into User values(?,?,?,?,?,?)");  
				ps.setString(1,Uname);    
				ps.setString(2, Uemail);
				ps.setString(3, Ugender);
				ps.setString(4, Uaddress);
				ps.setString(5, M_no);
				ps.setString(6, pass);
				
				      
			if(ps.executeUpdate()>0);
			{
				out.println("sucess");
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


/*CREATE TABLE `User` (
`Name` varchar(50) not NULL,
`EmailId` varchar(50) not NULL unique,
`Gender` varchar(11) not NULL,
`Address` varchar(100) not NULL,
`PhoneNo` varchar(10) not NULL,
`Password` varchar(50) not NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
*/