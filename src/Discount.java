import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Discount",urlPatterns = "/Discount")
public class Discount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        String productDescription = request.getParameter("productDescription");
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<p>" + productDescription + "</p>");
        writer.print("<p><b>List Price</b>: " + listPrice +"</p>");
        writer.print("<p>Discount Percent: "  + discountPercent +"</p>");
        writer.print("<p>Resulf: " + listPrice*(1- discountPercent/100)+ "</p>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
