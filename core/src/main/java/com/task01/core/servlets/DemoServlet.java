package com.task01.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,immediate = true)
@SlingServletPaths(value = "/bin/rathi/beml/surge")
public class DemoServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException{
         

       
    response.getWriter().write("data coming from the doGet");

    }
}



    

 