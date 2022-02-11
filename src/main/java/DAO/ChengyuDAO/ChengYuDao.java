package DAO.ChengyuDAO;

import Pojo.ChengYu;

import java.util.List;

/**
 * @author liaoke
 * @create 2021-10-31-15:24
 */
public interface ChengYuDao {


    public int addChengyu(ChengYu chengYu);

    public ChengYu queryChengyuByName(String name);

    public List<ChengYu> queryChengyu(String py);

}
