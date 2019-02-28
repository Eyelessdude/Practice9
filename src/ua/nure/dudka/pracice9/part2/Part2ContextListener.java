package ua.nure.dudka.pracice9.part2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;
import java.util.Map;

@WebListener
public class Part2ContextListener implements ServletContextListener {
    private static final String CONTEXT_INIT_PARAM_NAME = "list";
    private static final String MAP_ATTRIBUTE_NAME = "map";
    private static final String SEPARATOR = "\\s+";
    private static final int INIT_VOTE_VALUE = 0;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String, Integer> sportMap = new HashMap<>();

        String list = sce.getServletContext().getInitParameter(CONTEXT_INIT_PARAM_NAME);

        for (String sport : list.split(SEPARATOR)) {
            sportMap.put(sport, INIT_VOTE_VALUE);
        }

        sce.getServletContext().setAttribute(MAP_ATTRIBUTE_NAME, sportMap);
        System.out.println("Context initialized");
        System.out.println("Map: " + sportMap);
    }
}
