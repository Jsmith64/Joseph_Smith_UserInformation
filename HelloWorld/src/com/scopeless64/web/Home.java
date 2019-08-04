package com.scopeless64.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  //...
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // get the value for the query parameter
            String firstName = "unkown";
            String lastName = "unknown";
            String favoriteLang = "unknown";
            String homeTown = "unkown";
            
            firstName = request.getParameter("firstName");
            lastName = request.getParameter("lastName");
            favoriteLang = request.getParameter("favoriteLanguage");
            homeTown = request.getParameter("homeTown");
            response.setContentType("text/html");
            
            if(firstName == null) {
            	firstName = "unkown";
            }
            
            if(lastName == null) {
            	lastName = "unkown";
            }
            
            if(favoriteLang == null) {
            	favoriteLang = "unkown";
            }
            
            if(homeTown == null) {
            	homeTown = "unkown";
            }
            
            PrintWriter out = response.getWriter();
            out.write("<h1>Welcom, " + firstName + " " + lastName + "</h1>");
            out.println("<h2>Your favorite language is: " + favoriteLang + "</h2>");
            out.println("<h2>Your hometown is: " + homeTown + "</h2>");
        }
    //...
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
