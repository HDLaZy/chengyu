package DAO.impl;

import DAO.ChengyuDAO.ChengYuDao;
import Pojo.ChengYu;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author liaoke
 * @create 2021-10-31-15:25
 */
public class ChengYuDAOImpl extends BaseDAO implements ChengYuDao {


    @Override
    public int addChengyu(ChengYu chengYu) {
        String sql="INSERT INTO `chengyu` (`name`, `pinyin`, `jieshi`, `chuchu`, `startStr`, `endStr`) VALUES(?,?,?,?,?,?)";
        return update(sql,chengYu.getName(), chengYu.getPinyin(),chengYu.getJieshi(),chengYu.getChuchu(),chengYu.getStartStr(),chengYu.getEndStr());
    }



    @Override
    public ChengYu queryChengyuByName(String name) {
        String sql="SELECT `name`, `pinyin`  FROM chengyu WHERE name=?";
        return query(ChengYu.class,sql,name);
    }

    @Override
    public List<ChengYu> queryChengyu(String py) {
        String sql="SELECT `name` FROM chengyu WHERE pinyin LIKE ? ";
        return queryList(ChengYu.class,sql,py);
    }
}
