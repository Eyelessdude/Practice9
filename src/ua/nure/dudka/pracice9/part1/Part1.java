package ua.nure.dudka.pracice9.part1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class Part1 extends HttpServlet {
    private static final String OPERATION_MINUS = "minus";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstNumber = Integer.parseInt(req.getParameter("x"));
        int secondNumber = Integer.parseInt(req.getParameter("y"));
        String operation = req.getParameter("op");

        int result = OPERATION_MINUS.equals(operation) ? firstNumber - secondNumber : firstNumber + secondNumber;

        resp.getWriter().write(String.valueOf(result));
        System.out.println(result);
    }
}
