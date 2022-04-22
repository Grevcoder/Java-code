package com.training.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServelet
 */
@WebServlet("/home")

public class HomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	String name = null;

	public void init() {
		name = "Jacob";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * response.setContentType("text/html"); PrintWriter out=response.getWriter();
		 * out.println("<HTML>");
		 * out.println("<HEAD><TITLE>Servlet Demo</TITLE></HEAD>");
		 * out.println("<BOADY>"); out.println("<H1>Hello Servlet</H1>" + name);
		 * out.println("</BODY></HTML>");
		 */
		 // response.sendRedirect("home.jsp");
         //request.setAttribute("userName", name);

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=Mars;"
					+ "encrypt=true;trustServerCertificate=true";

			String user = "sa";
			String password = "admin";
			Connection con = DriverManager.getConnection(url, user, password);

			String query = "select * from login";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			String useNameFromDb = null;
			String passwordFromDb = null;

			while (rs.next()) {

				useNameFromDb = rs.getString("user_name");
				passwordFromDb = rs.getString("password");
			}

			String userName = request.getParameter("uname");
			String pwd = request.getParameter("password");
			if (useNameFromDb.equalsIgnoreCase(userName) && passwordFromDb.equals(pwd)) {
				request.setAttribute("userName", userName);
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
				rd.forward(request, response);

			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
