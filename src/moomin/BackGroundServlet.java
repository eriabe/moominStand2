package moomin;

import java.io.*;

import javax.servlet.http.*;
@SuppressWarnings("serial")

public class BackGroundServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {
    	req.setCharacterEncoding("UTF-8");

        String background[] = req.getParameterValues("background");
       // if(background=="みどり"){
       // 	'<body background="back.jpg">';
        	
      //  }
        
        resp.sendRedirect("itemListFromDB.jsp");
    }
}