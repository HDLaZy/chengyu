package service;

import Pojo.ChengYu;

import java.util.List;

/**
 * @author liaoke
 * @create 2021-11-01-12:10
 */
public interface ChengYuService {

    public void  addChengYu(ChengYu chengYu);

    public ChengYu queryChengYuByName(String name);

    public String nextChengYu(String name);

}
