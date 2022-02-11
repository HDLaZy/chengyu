package DAO.impl;

import JDBCUtils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author liaoke
 * @create 2021-10-31-15:25
 */
public abstract class BaseDAO {

    private QueryRunner queryRunner=new QueryRunner();

    //插入 修改 删除
    public  int update(String sql,Object ... args){

        Connection conn= JDBCUtils.getConn();
        try {
            return   queryRunner.update(conn,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConn(conn);
        }

        return -1;
    }


    //查询
    public <T> T  query(Class<T> type,String sql,Object ...args){

        Connection conn= JDBCUtils.getConn();
        try {
            return   queryRunner.query(conn,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConn(conn);
        }
        return null;
    }



    public <T> List<T> queryList(Class<T> type, String sql, Object ...args){

        Connection conn= JDBCUtils.getConn();
        try {
            return   queryRunner.query(conn,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConn(conn);
        }

        return null;
    }

}
