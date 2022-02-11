package DAO.impl;

import DAO.ChengyuDAO.ChengYuDao;
import Pojo.ChengYu;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

/**
 * @author liaoke
 * @create 2021-10-31-15:47
 */
public class ChengYuDAOImplTest {

    private ChengYuDao cy=new ChengYuDAOImpl();

    @org.junit.Test
    public void testaddChengyu() {
        ChengYu c=new ChengYu();
        c.setName("测试");
        cy.addChengyu(c);
    }

    @org.junit.Test
    public void testqueryChengyuByName() {
        ChengYu test = cy.queryChengyuByName("不明不白");
        System.out.println(test.getName());
        if(test==null){
            System.out.println("没找到");
        }else{
            System.out.println("找到");
        }
    }

    @org.junit.Test
    public void testqueryChengyu() {

        ChengYu chengYu = cy.queryChengyuByName("危言核论");
        if(chengYu!=null){
            String pinyin = chengYu.getPinyin();
            System.out.println(pinyin);
            int i = pinyin.lastIndexOf(" ");
            String substring = pinyin.substring(i + 1);
            System.out.println(substring);
            List<ChengYu> chengYus = cy.queryChengyu(substring+ "%");
            if(chengYus.isEmpty()){
                System.out.println("没有后续");
            }else{
                System.out.println(chengYus);
            }

        }else {
            System.out.println("未找到");
        }
    }
}