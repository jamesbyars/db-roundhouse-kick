package com.ernesttech.roundhousekick.config;

import javax.sql.DataSource;

@Configuration
public class DbConfiguration {

    @Autowired
    private ApplicationProperties applicationProperties;


    @Bean(destroyMethod = "close", name = "dataSource")
    @Primary
    public DataSource dataSource() {
        BoneCPDataSource dataSource = new BoneCPDataSource();

        dataSource.setDriverClass(applicationProperties.getDbDriver());
        dataSource.setJdbcUrl(applicationProperties.getDbUrl());
        dataSource.setUsername(applicationProperties.getDbUsername());
        dataSource.setPassword(applicationProperties.getDbPassword());

        return dataSource;
    }

    @Bean(name = "defConfiguration")
    public DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();

        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(SQLDialect.POSTGRES);

        return jooqConfiguration;
    }

    @Bean(name = "lazyConnDataSource")
    public LazyConnectionDataSourceProxy lazyConnectionDataSource() {
        return new LazyConnectionDataSourceProxy(dataSource());
    }

    @Bean(name = "transAwareDataSource")
    public TransactionAwareDataSourceProxy transactionAwareDataSource() {
        return new TransactionAwareDataSourceProxy(lazyConnectionDataSource());
    }

    @Bean(name = "transManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(lazyConnectionDataSource());
    }

    @Bean(name = "connectionProvider")
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider(transactionAwareDataSource());
    }

    @Bean(name = "defDSLContext")
    public DefaultDSLContext dsl() {
        return new DefaultDSLContext(configuration());
    }

}
