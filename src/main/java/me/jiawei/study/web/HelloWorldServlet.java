package me.jiawei.study.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldServlet.class);

    public void init() throws ServletException {
        LOG.debug("初始化Servlet");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.debug("doGet");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        out.printf("id:%s, name:%s",id,name);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.debug("doPost");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String aaa = (String)req.getAttribute("aaa");
        PrintWriter out = resp.getWriter();
        out.printf("id:%s, name:%s, aaa:%s" ,id,name,aaa);
        out.flush();
        out.close();
    }

    public void destroy() {
        LOG.debug("销毁Servlet");
    }
}
