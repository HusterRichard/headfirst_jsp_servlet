package com.huawei.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huawei.model.Dog;

public class ListenerTester extends HttpServlet {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6106346229712350065L;

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("test context attributes set by listener<br>");
		out.println("<br>");
		
		Dog dog = (Dog)getServletContext().getAttribute("dog");
		out.println("Dog's breed is:" + dog.getBreed());
    }
}