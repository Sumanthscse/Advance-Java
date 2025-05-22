/* 6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure. */


package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get the input number
            int number = Integer.parseInt(request.getParameter("number"));

            // Check if the number is prime
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Generate response
            out.println("<html>");
            out.println("<head><title>Prime Number Checker</title></head>");
            out.println("<body>");
            if (isPrime) {
                out.println("<h2 style='color:green'>" + number + " is a Prime Number</h2>");
            } else {
                out.println("<h2 style='color:red'>" + number + " is Not a Prime Number</h2>");
            }
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2 style='color:red'>Please enter a valid number!</h2>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}