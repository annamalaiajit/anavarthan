import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
		  throws ServletException, IOException{
////lkkkk
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		
	String n=request.getParameter("userName");
	out.print("Welcome "+n);

	Cookie ck=new Cookie("uname",n);//creating cookie object
    response.addCookie(ck);//adding cookie in the response
    
    //response.sendRedirect("/01Login/login.html");
	//creating submit button
	out.print("<form action='servlet2' method='get'>");
	out.print("<input type='submit' value='go2'>");
	out.print("</form>");
  }
}

