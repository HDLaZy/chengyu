package service.impl;

import DAO.ChengyuDAO.ChengYuDao;
import DAO.impl.ChengYuDAOImpl;
import Pojo.ChengYu;
import service.ChengYuService;

import java.util.List;
import java.util.Random;

/**
 * @author liaoke
 * @create 2021-11-01-12:13
 */
public class ChengYuServiceImpl implements ChengYuService {

    private  ChengYuDao chengYuDao=new ChengYuDAOImpl();

    @Override
    public void addChengYu(ChengYu chengYu) {
        chengYuDao.addChengyu(chengYu);
    }

    @Override
    public ChengYu queryChengYuByName(String name) {
       return chengYuDao.queryChengyuByName(name);
    }

    @Override
    public String nextChengYu(String name) {
        ChengYu chengYu = chengYuDao.queryChengyuByName(name);
        if(chengYu !=null){
            String pinyin = chengYu.getPinyin();
            int i = pinyin.lastIndexOf(" ");
            String substring = pinyin.substring(i + 1);
            List<ChengYu> chengYus = chengYuDao.queryChengyu(substring+" %");
            if(chengYus.isEmpty()){
                return ("没接上！");
            }else{
                return chengYus.get(new Random().nextInt(chengYus.size())).getName();
            }
        }else {
            return ("它可能不是个成语!");
        }
    }
}
