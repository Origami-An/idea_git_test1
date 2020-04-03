package com.mybatisxml.exercise;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {

    public static void main(String[] args) {
        // 1.代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("origami");//设置作者
        gc.setOpen(false);//是否打开资源管理器
        gc.setFileOverride(false);//是否覆盖原来生成的
        gc.setServiceName("%sService");//去掉service接口名的I前缀
        gc.setIdType(IdType.AUTO);//设置实体类id注解
        gc.setDateType(DateType.ONLY_DATE);//设置实体类时间注解
        gc.setSwagger2(true); //实体类设置swagger2配置
        mpg.setGlobalConfig(gc);

        // 3.数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/products2?characterEncoding=utf-8&useUnicode=true&serverTimezone=GMT&useSSL=false");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);//设置数据库类型
        mpg.setDataSource(dsc);

        // 4.包配置
        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("merber");//模块名 生成后为com.mptest.merber.conroller/mapper/servier/...
        pc.setParent("com.mybatisxml.exercise");
        pc.setEntity("pojo");
        pc.setMapper("mapper");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("users");//设置映射表名，一个个表名的写然后执行
        strategy.setNaming(NamingStrategy.underline_to_camel); //数据库表名 生成后的类名 下划线转驼峰命名
        strategy.setColumnNaming(NamingStrategy.underline_to_camel); //数据库字段名 生成后 下划线转驼峰命名
        strategy.setEntityLombokModel(true);//自动lombok注解
        strategy.setRestControllerStyle(true);//@controller为@restController
        strategy.setControllerMappingHyphenStyle(true);//url驼峰命名装换为_
//        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
//        strategy.setTablePrefix("xxx_");//不生成表名xxx_前缀(表名为xxx_str，生成后为str)

/*        //逻辑删除
        strategy.setLogicDeleteFieldName("逻辑删除字段名");
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);//取出逻辑删除布尔值的is_前缀

        //自动填充，一般用于时间字段（如删除时自动填充删除时间，更新时自动填充更新时间）
        TableFill t1 = new TableFill("字段名", FieldFill.INSERT);//插入时自动填充
        TableFill t2 = new TableFill("字段名", FieldFill.INSERT_UPDATE);//更新时自动填充
        List<TableFill> tableFills = new ArrayList<>();
        tableFills.add(t1);
        tableFills.add(t2);
        strategy.setTableFillList(tableFills);

        //乐观锁的列
        strategy.setVersionFieldName("version");*/

        mpg.setStrategy(strategy);

        mpg.execute();//执行
    }

}