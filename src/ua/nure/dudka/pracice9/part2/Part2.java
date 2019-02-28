package ua.nure.dudka.pracice9.part2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/vote")
public class Part2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("vote.jsp").forward(req, resp);
        System.out.println("#doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sport = req.getParameter("sport");
        Map<String, Integer> sportMap = (Map) getServletContext().getAttribute("map");
        int rate = sportMap.get(sport);
        sportMap.put(sport, rate + 1);

        resp.sendRedirect("voteTable.jsp");
        System.out.println("#doPost");
    }
}
