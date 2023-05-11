import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registered extends HttpServlet {
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name").toString();
		String password = req.getParameter("password").toString();
		String email = req.getParameter("email").toString();
		
		PrintWriter p = res.getWriter();
		
		p.println("Name:"+name);
		p.println("Email:"+email);
		p.println("Registration completed");
		
		res.setContentType("text/html");
		p.println("<html><body><a href='Login'>Login</a><body></html>");
	}

}
