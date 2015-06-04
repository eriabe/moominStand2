package moomin;

import java.io.IOException;
//import java.net.URL;
//import java.util.*;
 
import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
 
public class AddLinkDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        /*req.setCharacterEncoding("UTF-8");
        String[] food = {"ミックスベリーミルク", "ストロベリーミルク", "ロイヤルミルクティ", "いちごロイヤル", "抹茶ミルク", 
        		"チョコミルク", "バナナミルク", "ココナッツミルク", "SOY!塩キャラメル", "SOY!ミックスフルーツ", "ミックスベリービネガー",
        		"ピーチティ", "100%マンゴーフリーツミックス", "100%紫やさいミックス", "100%オレンジジュース", "ブレンドふどうジュース", 
        		"ニョロニョロドーナツ ミックスベリー&ナッツ", "ニョロニョロドーナツ コーヒー&ミルク"};
        String[] price = {"380円", "380円", "350円", "380円", "380円", "380円", "380円", 
        		"380円", "380円", "380円", "380円", "380円", "350円", "350円", "280円", 
        		"280円", "210円", "210円"};
        for (int i = 0; i < 18; i++) {
        	Date date = Calendar.getInstance().getTime();
        	LinkData data = new LinkData(food[i],price[i]);
        	PersistenceManagerFactory factory = PMF.get();
        	PersistenceManager manager = factory.getPersistenceManager();
        	try {
        		manager.makePersistent(data);
        	} finally {
        		manager.close();
        	}
        }
        resp.sendRedirect("/confirm.jsp");
    }
}*/
        req.setCharacterEncoding("UTF-8");
        String food = req.getParameter("food");
        String price = req.getParameter("price");
        LinkData data = new LinkData(food,price);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }
}