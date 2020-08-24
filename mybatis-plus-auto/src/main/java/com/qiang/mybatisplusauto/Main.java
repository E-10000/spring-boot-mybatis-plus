package com.qiang.mybatisplusauto;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class Main {
    public static void main(String[] args) {
        //创建Generator对象
        AutoGenerator autoGenerator =new AutoGenerator();
        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);//MYSQL
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false&serverTimezone=GMT%2B8");//连接URL
        dataSourceConfig.setUsername("root");//账号
        dataSourceConfig.setPassword("root");//密码
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");//设置driver-class-name
        autoGenerator.setDataSource(dataSourceConfig);//数据源装在Generator类中

        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");//这个是设置哪个Java项目的
        globalConfig.setOpen(false);//创建好后不要自动打开这个文件夹
        globalConfig.setAuthor("小强");//作者是谁，自己写就OK
        globalConfig.setServiceName("%sService");//不写这个，生成的service层就会是IxxxService的
        autoGenerator.setGlobalConfig(globalConfig);//装载进Generator类

        //包信息
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.qiang.mybatisplusauto");//包放在哪里之下
//        packageConfig.setModuleName("generator");//还可以更进一步设置放在哪里之下
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.imp");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);

        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);//实体类添加Lombok注解
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//与下面的注解一起用的
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//开启驼峰命名法大写转_+小写
        autoGenerator.setStrategy(strategyConfig);//装载进去

        autoGenerator.execute();
    }
}
