/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moomin;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.jdo.*;
import javax.servlet.http.*;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 
 */
//@WebServlet(name = "LoginServlet", urlPatterns = {"/login.do"})
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    /*    response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        boolean found = false;
        try {
            String password = request.getParameter("password");
            String user = request.getParameter("user");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverURL = "jdbc:derby://localhost:1527/shohin";
            Connection con = DriverManager.getConnection(driverURL, "db", "db");
            Statement stmt = con.createStatement();
            String sql = "select * from T_USER where USER_NAME=? and PASSWORD=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                found = true;
            }
            String nextJsp;
            if(!found) {
                session.invalidate();
                nextJsp = "/loginFailed.jsp";
                RequestDispatcher dispatcher = request.getRequestDispatcher(nextJsp);
                dispatcher.forward(request,response);
            }else {
                session.setAttribute("user",user);
                sql = "select * from T_SHOHIN";
                rs = stmt.executeQuery(sql);
                List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
                while(rs.next()) {
                    Map<String,Object> record = new HashMap<String,Object>();
                    record.put("id",new Integer(rs.getInt("SHOHIN_ID")));
                    record.put("name", rs.getString("SHOHIN_NAME"));
                    record.put("price",new Integer(rs.getInt("PRICE")));
                    list.add(record);
                }
                rs.close();
                stmt.close();
                con.close();
                request.setAttribute("data",list);
                //RequestDispatcher rd = request.getRequestDispatcher("/loginSuccess.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("/itemListFromDB.jsp");
                rd.forward(request,response);
            }
        } catch(Exception e) {
            throw new ServletException(e);
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     //   processRequest(request, response);
    	PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        String param1 = request.getParameter("id");
        PrintWriter out = response.getWriter();
        List<LinkDataLogin> list = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + LinkDataLogin.class.getName();
            try {
                list = (List<LinkDataLogin>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
        } else {
            try {
                LinkDataLogin data = (LinkDataLogin)manager.getObjectById(LinkDataLogin.class,Long.parseLong(param1));
                list = new ArrayList();
                list.add(data);
            } catch(JDOObjectNotFoundException e){}
        }
        String res = "[";
        if (list != null){
            for(LinkDataLogin data:list){
                res += "{id:'" + data.getUserId() + "',Pass:'" + data.getPass() + "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }
    

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    	
    	response.setContentType("text/html");
        request.setCharacterEncoding("utf8");
        response.setCharacterEncoding("utf8");
        String user = request.getParameter("user");
        String password = request.getParameter("password");
    /*    PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        LinkData data = (LinkData)manager.getObjectById(LinkData.class,user);
        data.setUserId(user);
        data.setPass(password);
        manager.close();*/
        //response.sendRedirect("itemListFromDB.jsp");
        //String param = request.getParameter("text1");
        ServletContext application = this.getServletContext();
        ArrayList<String> datas = (ArrayList<String>)application.getAttribute("datas");
        if (datas == null){
            datas = new ArrayList<String>();
        }
        datas.add(user);
        application.setAttribute("datas", datas);
        response.sendRedirect("itemListFromDB.jsp");
        //こっち        response.sendRedirect("/itemListFromDB.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
