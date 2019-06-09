package com.lover.system;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

/**
 * @author shkstart
 * @create 2019-04-04 16:57
 */
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:\\mylover\\lover\\mylover\\lover-system\\src\\main\\java");
        gc.setAuthor("lhf");
        gc.setOpen(true);
        gc.setDateType(DateType.TIME_PACK);
        gc.setIdType(IdType.AUTO);
        gc.setEntityName("%sEntity");
        gc.setMapperName("%sDao");
        gc.setXmlName("%sDao");
        gc.setServiceName("MP%sService");
        gc.setServiceImplName("%sServiceDiy");
        gc.setControllerName("%sAction");
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://localhost/mp?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.lover.system");
        pc.setEntity("entity.mybatis");
        mpg.setPackageInfo(pc);

        // 配置模板
        mpg.setTemplateEngine(new VelocityTemplateEngine());
        TemplateConfig templateConfig = new TemplateConfig();
        mpg.setTemplate(templateConfig);

        // 数据库表配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setRestControllerStyle(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setInclude("student");
        mpg.setStrategy(strategy);

        mpg.execute();
    }

}
