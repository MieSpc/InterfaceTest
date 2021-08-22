package com.auto.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.util.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = DataSourceInterfaceSvcConfig.PACKAGE_PATH, sqlSessionFactoryRef = DataSourceInterfaceSvcConfig.SQL_SESSION_FACTORY)
public class DataSourceInterfaceSvcConfig {

    public final static String DATA_SOURCE_NAME = "dataSourceInterfacesvc";
    public final static String PACKAGE_PATH = "com.auto.test.mapper";
    public final static String SQL_SESSION_FACTORY = "sqlSessionFactoryInterfacesvc";
    public final static String TX_MANAGER = "txManagerInterfacesvc";
    public final static List<String> XML_PATHS = Arrays.asList("classpath:com/auto/test/mapper/*.xml");

    private static final Logger logger = LoggerFactory.getLogger(DataSourceInterfaceSvcConfig.class);

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Value("${mybatis.config.path}")
    private String configPath;

    @Bean(name = DATA_SOURCE_NAME)
    public DataSource getDataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setInitialSize(10);
        datasource.setMinIdle(10);
        datasource.setMaxActive(200);
        datasource.setMaxWait(60000);
        datasource.setTimeBetweenEvictionRunsMillis(45000);
        datasource.setValidationQuery("ELECT 1 FROM DUAL");
        datasource.setTestWhileIdle(true);
        datasource.setTestOnBorrow(true);
        datasource.setTestOnReturn(false);
        datasource.setRemoveAbandonedTimeout(3600);
        try {
            datasource.setFilters("stat");
            datasource.init();
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        return datasource;
    }

    @Bean(name = TX_MANAGER)
    public DataSourceTransactionManager getTransactionManager(@Qualifier(value=DATA_SOURCE_NAME) DataSource dataSource) {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource);
        return txManager;
    }


    @Bean( name = SQL_SESSION_FACTORY)
    public SqlSessionFactory getSqlSessionFactoryData(@Qualifier(value=DATA_SOURCE_NAME) DataSource dataSource) {
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            List<Resource> resources = new ArrayList();
            Iterator var5 = XML_PATHS.iterator();

            while(var5.hasNext()) {
                String xmlPath = (String)var5.next();
                Resource[] t = (new PathMatchingResourcePatternResolver()).getResources(xmlPath);
                resources.addAll(Arrays.asList(t));
            }

            if (!resources.isEmpty()) {
                bean.setMapperLocations((Resource[])resources.toArray(new Resource[resources.size()]));
            }

            if (!StringUtils.isEmpty(configPath)) {
                bean.setConfigLocation((new PathMatchingResourcePatternResolver()).getResource(configPath));
            }

            bean.setDataSource(dataSource);
            return bean.getObject();
        } catch (Exception var8) {
            logger.error("failed to create data sql session", var8);
            throw new RuntimeException("failed to create data sql session", var8);
        }
    }
}
