package com.huawei;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JarDownloadServlet extends HttpServlet {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest oRequest, HttpServletResponse oResponse) throws IOException {
		oResponse.setContentType("application/jar");
		
		ServletContext cxt = getServletContext();
		InputStream is = cxt.getResourceAsStream("/servlet-api.jar");
		
		int read = 0;
		byte[] bytes = new byte[1024];
		
		OutputStream os = oResponse.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			os.write(bytes, 0, read);
		}
		
		os.flush();
		os.close();
	}

}
