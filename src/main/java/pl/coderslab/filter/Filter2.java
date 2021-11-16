//package pl.coderslab.filter;
//
//import javax.servlet.Filter;
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
//@WebFilter(filterName = "Filter2", value = "/*")
//public class Filter2 implements Filter {
//    public void init(FilterConfig config) throws ServletException {
//    }
//    public void destroy() {
//    }
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        System.out.println(httpServletRequest.getHeader("User-Agent"));
//        long startTime = System.currentTimeMillis();
//        chain.doFilter(request, response);
//        long stopTime = System.currentTimeMillis();
//        System.out.println(stopTime - startTime);
//    }
//}