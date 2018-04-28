package net.btnz.pri.java.myspringbootbasetest.multidatasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfigurer {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.mysqltemp")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.postgresqltemp")
    public DataSource c3p0DataSource() {
        return new ComboPooledDataSource();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.postgresqlpostgres")
    public DataSource dhcp2DataSource() {
        return new BasicDataSource();
    }
}
