import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class firstServlet extends javax.servlet.http.HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter responseWriter = response.getWriter();
//        responseWriter.println("<html>");
//
//        responseWriter.println("<h1>Hello</h1>");
//
//        responseWriter.println("</html>");

        String name = request.getParameter("name");

        responseWriter.println("<html>");

        responseWriter.println("<h1>Hello "+name+"</h1>");

        responseWriter.println("</html>");


    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}

