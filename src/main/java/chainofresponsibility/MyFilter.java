package chainofresponsibility;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Hello filter");
        chain.doFilter(request, response);
        System.out.println("good bye filter");
    }
}
