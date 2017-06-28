package com.huawei.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huawei.model.BeerExpert;

public class BeerSelectServletV2 extends HttpServlet {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6106346229712350065L;
	
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	String color = req.getParameter("color");
    	BeerExpert oBeerExpert = new BeerExpert();
    	List<String> lstBrand = oBeerExpert.getBrands(color);
    	
    	req.setAttribute("styles", lstBrand);
    	
    	RequestDispatcher view = req.getRequestDispatcher("result.jsp");
    	view.forward(req, resp);
    }
}
