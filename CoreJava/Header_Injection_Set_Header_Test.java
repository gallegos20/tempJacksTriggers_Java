package com.codiscope.jaks.triggers.java.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Header_Injection_Set_Header_Test {
    public void doWork(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("name");
        response.setHeader("name", username);
    }
}