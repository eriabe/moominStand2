package moomin;

//import java.net.URL;
//import java.util.*;
 


import java.io.IOException;



import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class BuyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
    /*	String shohin[] = req.getParameterValues("shohin");
    	String price = "";
    	if (shohin != null) {
    		for (int i = 0; i < shohin.length; i++) {
    			price += shohin[i];
    		}
    	}*/
    	//req.setAttribute("price", price);
        //req.getRequestDispatcher("confirm.jsp").forward(req, resp);
    	String namae = req.getParameter("namae");
    	resp.setContentType("text/html");
        java.io.PrintWriter out = resp.getWriter();
        out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Moomin Test</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println(namae);
		out.println("</BODY>");
		out.println("</HTML>");

    	
    	
    	/*
    	 PersistenceManagerFactory factory = PMF.get();
         PersistenceManager manager = factory.getPersistenceManager();
         resp.setCharacterEncoding("UTF-8");
         resp.setContentType("text/html");
         req.setCharacterEncoding("utf-8");
         String param1 = req.getParameter("id");
         PrintWriter out = resp.getWriter();
         List<LinkData> list = null;
         if (param1 == null || param1 ==""){
             String query = "select from " + LinkData.class.getName();
             try {
                 list = (List<LinkData>)manager.newQuery(query).execute();
             } catch(JDOObjectNotFoundException e){}
         } else {
             try {
                 LinkData data = (LinkData)manager.getObjectById(LinkData.class,Long.parseLong(param1));
                 list = new ArrayList();
                 list.add(data);
             } catch(JDOObjectNotFoundException e){}
         }
         String res = "[";
         if (list != null){
             for(LinkData data:list){
                 res += "{id:'" + data.getId() + "',food:'" + data.getFood() + "',price:'" +
                     data.getPrice() + "',img:'" + data.getImage()+ "'},";
             }
         }
         res += "]";
         out.println(res);
         manager.close();*/
    	/*HttpSession session = req.getSession();
        String[] strVals = req.getParameterValues("shohinid");
        int numChecks = 0;
        if (strVals != null) {
            numChecks = strVals.length;
        } else {
            numChecks = 0;
        }
        try {*/
        //    Class.forName("org.apache.derby.jdbc.ClientDriver");
        //    String driverURL = "jdbc:derby://localhost:1527/shohin";
        //    Connection con = DriverManager.getConnection(driverURL, "db", "db");
       //     Statement stmt = con.createStatement();
           /* List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            int total = 0;
            for (int i = 0; i < numChecks; i++) {
                int idFromCB = Integer.parseInt(strVals[i]);
                String sql = "select * from T_SHOHIN where SHOHIN_ID ="
                        + idFromCB;
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.hasNext()) {
                    Map<String, Object> record = new HashMap<String, Object>();
                    record.put("id", new Integer(rs.getInt("id")));
                    record.put("food", rs.getString("food"));
                    record.put("price", new Integer(rs.getInt("price")));
                    total = total + rs.getInt("price");
                    list.add(record);
                }
                rs.close();
            }
            stmt.close();
            con.close();
            req.setAttribute("count", numChecks);
            req.setAttribute("data", list);
            req.setAttribute("total", total);
            RequestDispatcher rd;
            if(numChecks == 0) {
                rd = req.getRequestDispatcher("/nocheck.jsp");
            }
            else {
                rd = req.getRequestDispatcher("/confirm.jsp");
            }
            rd.forward(req, resp);
        } catch (Exception e) {
            throw new ServletException(e);
        }*/
    //////////////////////////
    	/*PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        String param1 = req.getParameter("id");
        String chk[] = req.getParameterValues("chk");
        String str="";
        for(int i=0;i<chk.length;i++){
        	str= str+chk[i];
        	
        }
        req.setAttribute("cnt",str);
        */
        /*
        PrintWriter out = resp.getWriter();
        List<LinkData> list = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + LinkData.class.getName();
            try {
                list = (List<LinkData>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
        } else {
            try {
                LinkData data = (LinkData)manager.getObjectById(LinkData.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
            } catch(JDOObjectNotFoundException e){}
        }*//*
    	try{
    		String[] chk = req.getParameterValues("chk");
    		int count=96;
    		for(int i=0;i<chk.length;i++){
    			count++;
    		}
    		String cunt=String.valueOf(count);
    		req.setAttribute("cnt","fff");
    	}catch(Exception e){
    		System.out.println("e"+e);
    	}*/
        
    	/*int count=0;
    	int total=0;
    	String menu="";
    	String chk = req.getParameter("chk");
    	if(chk != null){
    		count++;
    	}*/

    	/*function CheckVakue(n){
    		  num = 0;	//ﾁｪｯｸされている項目数
    		  chkvalue = "";	//ﾁｪｯｸされている項目値
    		  if(n==1){    //checkboxのname属性がすべて同じ場合
    		    for(i=0 ; i<document.form1.ken.length ; i++){
    		      if(document.form1.ken[i].checked)	{
    		        chkvalue += "\n\t" + document.form1.ken[i].value;
    		        num++; 
    		      }
    		    }
    		  }
    		 if(num == 0)alert("どの項目もチェックされていません！");
    		 else alert(num+"項目がチェックされ、その値は"+chkvalue);
    	}*/
    	//ArrayList<String[]> table = new ArrayList<String[]>(); // 転送データ
    	
    	//resp.sendRedirect("confirm.jsp");
    }
}
