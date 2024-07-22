package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/additi")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int value1 = Integer.parseInt(req.getParameter("v1"));
		//String value2 = req.getParameter("v2");
		int value2 = Integer.parseInt(req.getParameter("v2"));
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		String s1=req.getParameter("s1");
		if(s1.equals("Add")) {
		int sum=value1+value2;
		pw.print("addition "+sum);
		}
		else
		{
			pw.print("invalid choice");
		}
	}

}
