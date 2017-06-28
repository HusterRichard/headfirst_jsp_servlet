package com.huawei;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5778266762215708858L;

	@Override
	public void doGet (HttpServletRequest oRequest,
		HttpServletResponse oResponse) {
		try {
			PrintWriter pw = oResponse.getWriter();
			Date today = new Date();
			
			pw.println(	"<html>" +
						"<body>" +
						"<h1>Head First\'s Chapter1 Servlet</h1><br>" +
						"<p>" + today + "</p>" +
						"</body>" +
						"</html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
