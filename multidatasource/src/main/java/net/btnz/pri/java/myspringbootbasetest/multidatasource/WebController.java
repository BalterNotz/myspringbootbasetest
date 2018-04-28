package net.btnz.pri.java.myspringbootbasetest.multidatasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
@RequestMapping("/multidatasource")
public class WebController {
    Logger logger = LoggerFactory.getLogger(WebController.class);

    @Resource
    private DataSource druidDataSource;

    @Resource
    private DataSource c3p0DataSource;

    @Resource
    private DataSource dhcp2DataSource;

    @RequestMapping("/temp")
    @ResponseBody
    public String tempDataSource() throws SQLException {

        Connection druidConn = druidDataSource.getConnection();
        Connection c3p0Conn = c3p0DataSource.getConnection();
        Connection dhcp2Conn = dhcp2DataSource.getConnection();

        Statement druidStatement = druidConn.createStatement();
        Statement c3p0Statement = c3p0Conn.createStatement();
        Statement dhcp2Statement = dhcp2Conn.createStatement();

//        String tableName = "temp_" + (long) (Math.random() * 1000000) + "_table";
//        StringBuilder sb = new StringBuilder();
//        sb.append("drop table if exists ").append(tableName).append("; ");
//        sb.append("create temporary table ").append(tableName).append(" (id int); ");
//        sb.append("insert into ").append(tableName).append(" (id) ").append("values(1); ");
//        sb.append("select count(1) from ").append(tableName).append("; ");
//        boolean druidRet = druidStatement.execute("create TEMPORARY TABLE temp_" + (long) Math.random() + "_table (id int);");
//        boolean c3p0Ret = c3p0Statement.execute("create TEMPORARY TABLE temp_" + (long) Math.random() + "_table (id int);");
//        boolean dhcp2Ret = dhcp2Statement.execute("create TEMPORARY TABLE temp_" + (long) Math.random() + "_table (id int);");
//        String sql = sb.toString();
//        logger.info("sql: {}", sql);
        String sql = "select count(1) from temp";
        boolean druidRet = druidStatement.execute(sql);
        boolean c3p0Ret = c3p0Statement.execute(sql);
        boolean dhcp2Ret = dhcp2Statement.execute(sql);

        logger.info("druid ret: {}", druidRet);
        logger.info("c3p0 ret: {}", c3p0Ret);
        logger.info("dhcp2 ret: {}", dhcp2Ret);

        druidConn.close();
        c3p0Conn.close();
        dhcp2Conn.close();

        if (druidRet && c3p0Ret && dhcp2Ret) return "success";
        return "fail";
    }
}
