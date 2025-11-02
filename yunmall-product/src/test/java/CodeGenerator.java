import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://192.168.111.128:3306/yunmall_pms?useSSL=false&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("cxzcanying")        // 设置作者
                            .enableSwagger()            // 开启 swagger 模式
                            .outputDir("C:/Users/21311/Desktop/work/yunmall/yunmall-product/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.cxzcanying.yunmall") // 设置父包名
                            .moduleName("product")
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .controller("controller")// 设置父包模块名 (这里对应yunmall-product模块)
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "/path/to/your/project/yunmall/yunmall-product/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .strategyConfig(builder -> {
                    builder.addInclude(
                                    "pms_attr",
                                    "pms_attr_attrgroup_relation",
                                    "pms_attr_group",
                                    "pms_brand",
                                    "pms_category",
                                    "pms_category_brand_relation",
                                    "pms_comment_replay",
                                    "pms_product_attr_value",
                                    "pms_sku_images",
                                    "pms_sku_info",
                                    "pms_sku_sale_attr_value",
                                    "pms_spu_comment",
                                    "pms_spu_images",
                                    "pms_spu_info",
                                    "pms_spu_info_desc"
                            ) // 包含所有pms架构的表
                            .addTablePrefix("pms_")
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .versionColumnName("version")
                            .controllerBuilder()
                            .enableRestStyle()
                            .enableHyphenStyle()
                            .mapperBuilder()
                            .enableBaseResultMap()
                            .enableBaseColumnList()
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl");; // 格式化Service名称; // 设置过滤表前缀，这样生成的实体类名会去掉pms_
                })
                            .templateConfig(builder -> {
                                builder.controller("/templates/controller.java")
                                        .service("/templates/service.java")
                                        .serviceImpl("/templates/serviceImpl.java");
                            })
                .execute();
    }
}