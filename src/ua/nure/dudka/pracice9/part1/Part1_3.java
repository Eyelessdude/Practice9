package ua.nure.dudka.pracice9.part1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate")
public class Part1_3 extends HttpServlet {
    private static final String OPERATION_MINUS = "minus";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("calculate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation = null;
        int secondNumber = 0;
        int firstNumber = 0;

        if (!req.getParameter("firstValue").isEmpty() && !req.getParameter("secondValue").isEmpty()) {
            firstNumber = Integer.parseInt(req.getParameter("firstValue"));
            secondNumber = Integer.parseInt(req.getParameter("secondValue"));
            operation = req.getParameter("operation");
        }

        int result = OPERATION_MINUS.equals(operation) ? firstNumber - secondNumber : firstNumber + secondNumber;

        req.setAttribute("result", result);

        req.getRequestDispatcher("calcResult.jsp").forward(req, resp);
    }
}
