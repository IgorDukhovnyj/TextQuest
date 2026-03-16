package com.quest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/start")
public class StartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");

        HttpSession session = request.getSession();

        session.setAttribute("player", name);
        session.setAttribute("scene", 1);

        Integer games = (Integer) session.getAttribute("games");

        if (games == null) {
            games = 0;
        }

        session.setAttribute("games", games + 1);

        session.setAttribute("history", new ArrayList<String>());

        response.sendRedirect("game");
    }
}

//@WebServlet("/start")
//public class StartServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request,
//                          HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String name = request.getParameter("name");
//
//        HttpSession session = request.getSession();
//
//        session.setAttribute("player", name);
//        session.setAttribute("scene", 1);
//
//        Integer games = (Integer) session.getAttribute("games");
//
//        if (games == null) {
//            games = 0;
//        }
//
//        session.setAttribute("games", games + 1);
//
//        response.sendRedirect("game");
//    }
//}