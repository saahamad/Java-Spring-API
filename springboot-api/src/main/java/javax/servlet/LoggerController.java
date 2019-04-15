package javax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class LoggerController
 */
@WebServlet("/LoggerController")
public class LoggerController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Logger logger = Logger.getLogger(LoggerController.class);
		PrintWriter out = response.getWriter();
		logger.info("print writer created...");
		out.print("<h1>This is Servlet Controller!</h1>");
		logger.info("Response send to the client!...");
	}

}
