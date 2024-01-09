package com.gausscode.competitiveanalysis.tools;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;


public class GenerateCode {
    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //项目路径
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        gc.setOutputDir(projectPath + "/src/main/java");
        // 设置用户名
        gc.setAuthor("lx");
        gc.setOpen(true);
        //Date类型只使用java.util.date代替（还有两种类型可以更换）
        gc.setDateType(DateType.ONLY_DATE);
        // service 命名方式
        gc.setServiceName("%sService");
        // service impl 命名方式
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        // 自定义文件命名
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(false);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/competitive_app_final?serverTimezone=UTC");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName(scanner("模块名"));
        pc.setParent("com.gausscode.competitiveanalysis");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("business");
        mpg.setPackageInfo(pc);

        // 自定义需要填充的字段
        List<TableFill> tableFillList = new ArrayList<>();

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称,mapper层的文件必须不同数据库就不同文件夹，不然不好识别
                return projectPath + "/src/main/resources/mapper"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        // 设置逻辑删除键（这个是逻辑删除的操作）
        strategy.setLogicDeleteFieldName("status");
        // 指定生成的bean的数据库表名（如果全部生成，这里要注释掉）
//        strategy.setInclude("message");
        //strategy.setSuperEntityColumns("id");
        // 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        // 选择 freemarker 引擎需要指定如下加，注意 pom 依赖必须有！
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}

