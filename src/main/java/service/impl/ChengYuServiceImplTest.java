package service.impl;

import Pojo.ChengYu;
import org.junit.Test;
import service.ChengYuService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liaoke
 * @create 2021-11-01-12:20
 */
public class ChengYuServiceImplTest {

    private ChengYuService chengYuService=new ChengYuServiceImpl();

    @Test
    public void TestaddChengYu() {
        ChengYu chengYu = new ChengYu();
        chengYu.setName("笑口常开");
        chengYu.setPinyin("xiào kou chang kai");
        chengYuService.addChengYu(chengYu);
    }

    @Test
    public void TestqueryChengYuByName() {
        ChengYu chengYu = chengYuService.queryChengYuByName("吹吹打打");
        System.out.println(chengYu);
    }

    @Test
    public void TestqueryChengYus() {
        System.out.println(chengYuService.nextChengYu("一卧不起"));
    }
}