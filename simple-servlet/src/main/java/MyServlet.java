/**
 * Created by MR on 3/12/2017.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet{


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello Servlet Get</h1>");
        out.println("</body>");
        out.println("</html>");
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello Servlet Post</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

