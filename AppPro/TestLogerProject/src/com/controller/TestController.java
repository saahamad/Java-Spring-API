package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Servlet implementation class TestController
 */
public class TestController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ILoggerFactory ilogger= LoggerFactory.getILoggerFactory();
		Logger logger = ilogger.getLogger("TestController.class");
		
		logger.info("Response object is ready to send the response!");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is Logger Controller!</h1>");
		logger.info("Response has been sent!");
	}

}
