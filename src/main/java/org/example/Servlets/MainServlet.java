package org.example.Servlets;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = {"/"})
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String pathFromRequest = req.getParameter("path");
        if (req.getParameter("path") == null) {
            pathFromRequest = new File(".").getCanonicalPath();
        }

        req.setAttribute("currentDir", pathFromRequest);

        String parentDirPath = new File(pathFromRequest).getParent();
        if (parentDirPath == null) {
            parentDirPath = pathFromRequest;
        }
        req.setAttribute("parentDirPath", parentDirPath);

        Date generationDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss");

        req.setAttribute("generationTime", dateFormat.format(generationDate));
        req.getRequestDispatcher("mypage.jsp").forward(req, resp);

    }

}
