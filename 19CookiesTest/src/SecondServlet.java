import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	Cookie ck[]=request.getCookies(); //getting cookie object.
	out.print("Hello "+ck[0].getValue()); //getting cookie value.
	}
}
