package com.task01.core.servlets;

import java.io.IOException;


import javax.json.Json;

import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;


@Component(service = Servlet.class,immediate = true,
         property ="sling.servlet.paths=/bin/page/wwc")
         
@SlingServletResourceTypes(resourceTypes = "task01/components/Header",
            selectors = {"add","mul"},
            extensions = {"json","html"})

public class ExampleServlet extends SlingAllMethodsServlet {

@Override
protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
        throws ServletException, IOException {
            JsonObjectBuilder job=Json.createObjectBuilder();
            job.add("surge", "soft");
            job.add("surge", "soft");
            response.getWriter().write(job.build().toString());

}
}

            
