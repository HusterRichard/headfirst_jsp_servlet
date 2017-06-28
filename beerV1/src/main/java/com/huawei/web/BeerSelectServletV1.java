package com.huawei.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huawei.model.BeerExpert;

public class BeerSelectServletV1 extends HttpServlet {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6106346229712350065L;

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	String color = req.getParameter("color");
    	BeerExpert oBeerExpert = new BeerExpert();
    	List<String> lstBrand = oBeerExpert.getBrands(color);
    	
    	resp.setContentType("text/html");
    	PrintWriter out = resp.getWriter();
    	out.println("Beer Selection Advice<br>");
    	
    	for (String brand : lstBrand) {
    		out.print("<br>try: " + brand);
    	}
    	
    	out.println("<br><br>" + getServletConfig().getInitParameter("adminEmail"));
    }
}