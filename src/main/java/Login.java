import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		
		p.println("<html><body><form>Enter email:<input type='text'>"
				+ "Enter password:<input type='password'>"
				+ "<input type = 'submit'></form><body></html>");
	}

}
