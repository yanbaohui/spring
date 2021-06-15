package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @program: day04_eesy_07anno_tx_withoutxml
 * @description
 * @author: yanbaohui
 * @create: 2021-04-26 21:45
 * 和事务相关的配置类
 **/
public class TransactionConfig {

    /**
     * 用于创建事务管理器对象
     * @author yanbaohui
     * @date 2021/4/26 21:47
     * @param dataSource
     * @return org.springframework.transaction.PlatformTransactionManager
     */
    @Bean("transactionManager")
    public PlatformTransactionManager createTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
