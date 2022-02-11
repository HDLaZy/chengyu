package JDBCUtils;


import org.testng.annotations.Test;

import java.sql.Connection;

/**
 * @author liaoke
 * @create 2021-10-31-15:20
 */
public class JDBCUtilsTest {

    @Test
    public void testgetConn() {
        Connection conn = JDBCUtils.getConn();
        System.out.println(conn);//com.mysql.jdbc.JDBC4Connection@78186a70
        JDBCUtils.closeConn(conn);

    }
}