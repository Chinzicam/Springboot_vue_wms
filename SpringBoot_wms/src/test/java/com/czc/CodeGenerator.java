package com.czc;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql:///wms", "root", "czc123")
                .globalConfig(builder -> {
                    builder.author("czc") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\Learnfiles\\Github\\springboot_vue_wms\\SpringBoot_wms\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com") // 设置父包名
                            .moduleName("czc") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\Learnfiles\\Github\\springboot_vue_wms\\SpringBoot_wms\\src\\main\\resources\\com\\czc\\mapper" )); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("goods,goodstype,menu,record,storage,user") // 设置需要生成的表名
                            .addTablePrefix(""); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}