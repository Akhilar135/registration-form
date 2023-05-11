import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
	String name = req.getParameter("name").toString();
	String password = req.getParameter("password").toString();
	String email = req.getParameter("email").toString();
	
	
//	PrintWriter p = res.getWriter();
//	p.println("Name:"+name);

	req.setAttribute("name",name);
	req.setAttribute("password",password);
	req.setAttribute("email",email);
	
	RequestDispatcher reqd = req.getRequestDispatcher("Registered");
	reqd.forward(req, res);
	

}}
