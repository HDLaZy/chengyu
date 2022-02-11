package JDBCUtils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author liaoke
 * @create 2021-10-31-15:17
 */
public class JDBCUtils {

    private static DruidDataSource druidDataSource;

    static {


        try {
            Properties pros=new Properties();

            InputStream is=JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");

            pros.load(is);

            druidDataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    //获取连接
    public static Connection getConn(){

        Connection conn=null;
        try {
            conn = druidDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //关闭连接
    public static void closeConn(Connection conn){

        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




