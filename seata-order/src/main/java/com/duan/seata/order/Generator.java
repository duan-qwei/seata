package com.duan.seata.order;


import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * mybatis-plus 代码生成器
 *
 * @author duanqiangwei
 */
public class Generator {


    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help);
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        String tableName = scanner("表名（只支持单个）");

        //代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        //设置作者
        gc.setAuthor("duanqiangwei");
        //代码生成是不是要打开文件夹
        gc.setOpen(false);
        //实体属性 Swagger2 注解
        gc.setSwagger2(false);
        //在xml文件中生成一个基础resultmap会映射所有的字段
        gc.setBaseResultMap(true);
        //覆盖掉原先生成的同文件
        gc.setFileOverride(true);
        gc.setDateType(DateType.TIME_PACK);
        //实体类名：直接用表名，  %s=表名
        gc.setEntityName("%s");
        //mapper接口名
        gc.setMapperName("%sMapper");
        //业务逻辑接口名
        gc.setServiceName("%sService");
        //业务逻辑实现类名
        gc.setServiceImplName("%sServiceImpl");
        //将全局配置设置到AutoGenerator
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.19.131:3306/seata_storage?useUnicode=true&nullCatalogMeansCurrent=true&characterEncoding=utf-8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        //配置包
        PackageConfig pc = new PackageConfig();
        //设置生成在哪个父包下
        pc.setParent("com.duan");
        //设置实体类包名
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);


        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        //模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/"
                         + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 把已有的xml生成置空，失效
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 表名的生成策略：下划线转驼峰 pms_product -- PmsProduct
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 列名的生成策略： 下划线转驼峰 last_name -- lastName
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);

        //设置是否启用Lombok
        strategy.setEntityLombokModel(true);
        // 在controller类上是否生成RestController
        strategy.setRestControllerStyle(true);

        if (tableName.indexOf('*') > 0) {
            strategy.setLikeTable(new LikeTable(tableName.replace('*', '_')));
        } else {
            // 要生成的表名，
            strategy.setInclude(tableName);
        }

        mpg.setStrategy(strategy);
        mpg.execute();
    }
}

