package pl.coderslab.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter1", value = "/*")
public class Filter implements javax.servlet.Filter {

    private String charset ="utf-8";
    private String content ="text/html";
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding(charset);
        resp.setCharacterEncoding(charset);
        resp.setContentType(content);

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
