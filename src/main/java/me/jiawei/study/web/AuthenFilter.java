package me.jiawei.study.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by fangjiawei on 2017/1/9.
 */
public class AuthenFilter implements Filter {
    private static final Logger LOG = LoggerFactory.getLogger(AuthenFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.debug("创建Filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.debug("doFilter");
        servletRequest.setAttribute("aaa","bbb");
        //请求传回
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        LOG.debug("销毁Filter");
    }
}
