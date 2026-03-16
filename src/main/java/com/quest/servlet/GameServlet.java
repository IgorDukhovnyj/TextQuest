package com.quest.servlet;

import com.quest.service.GameService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/game")
public class GameServlet extends HttpServlet {

    private GameService gameService = new GameService();

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Integer sceneId = (Integer) session.getAttribute("scene");

        if (sceneId == null) {
            sceneId = 1;
            session.setAttribute("scene", sceneId);
        }

        request.setAttribute("scene",
                gameService.getScene(sceneId));

        request.getRequestDispatcher("game.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        int scene = (Integer) session.getAttribute("scene");

        int choice = Integer.parseInt(request.getParameter("choice"));

        List<String> history =
                (List<String>) session.getAttribute("history");

        if (choice == 1) {
            history.add(gameService.getScene(scene).getOption1());
        } else {
            history.add(gameService.getScene(scene).getOption2());
        }

        int next = gameService.nextScene(scene, choice);

        session.setAttribute("scene", next);

        response.sendRedirect("game");
    }
}