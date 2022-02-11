package Servlet; /**
 * @author liaoke
 * @create 2021-10-31-18:24
 */

import Pojo.ChengYu;
import com.google.gson.Gson;
import service.ChengYuService;
import service.impl.ChengYuServiceImpl;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class ChengYuSerclet extends BaseServlet{


    private ChengYuService chengYuService=new ChengYuServiceImpl();
    private Gson gson=new Gson();

    protected void query (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String queryChengYu = chengYuService.nextChengYu(req.getParameter("queryChengYu"));
        String msg="";
        if(req.getSession().getAttribute("cy")==null){
            msg=req.getParameter("queryChengYu")+"-->"+queryChengYu;
            req.getSession().setAttribute("cy",msg);
        }else{
            msg=req.getSession().getAttribute("cy")+"-->"+queryChengYu;
            req.getSession().setAttribute("cy",msg);
        }

        String s = gson.toJson(req.getSession().getAttribute("cy"));
        resp.getWriter().write(s);
    }


    protected void add (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ChengYu chengYu = chengYuService.queryChengYuByName(req.getParameter("addChengYu"));

        String s="";
        if(chengYu==null){
            ChengYu addChengYu=new ChengYu();
            addChengYu.setName(req.getParameter("addChengYu"));

            chengYuService.addChengYu(addChengYu);

             s= gson.toJson(addChengYu.getName()+"添加成功");


        }else{
            String mgs="该成语库中已有";
             s = gson.toJson(mgs);

        }

        resp.getWriter().write(s);

    }

/*
一无是处 黜邪崇正 整年累月 刖趾适履  鲁卫之政  正正堂堂  堂而皇之  知我罪我  握炭流汤  汤烧火热  惹火烧身  神灭形消  小本经营
鹦鹉学舌  摄威擅势  事在人为  惟精惟一  一般见识  矢口狡赖
 */
}
