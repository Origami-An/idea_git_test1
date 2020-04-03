package com.mybatisxml.exercise.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @auther origami
 * @date 2020/3/30 18:07
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    /**
     * 张三的模型
     * @param environment
     * @return
     */
    @Bean
    public Docket zhangsanDocket(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2).groupName("张三的项目");
    }

    /**
     * origami的模型
     * @param environment
     * @return
     */
    @Bean
    public Docket origamiDocket(Environment environment){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("origami项目")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mybatisxml.exercise.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //标题
                .title("origami测试")
                //描述（相当于小标题）
                .description("用于测试mybatis的xml写法")
                //标题后面跟着一个版本
                .version("v9.9.9")
                //服务条款（比如说这个网页必须遵守什么，类似于注册什么的时候勾选我同意的服务条款）
                .termsOfServiceUrl("http://www.baidu.com")
                //联系方式( 姓名，个人网站，邮箱 )
                .contact(new Contact("张三","http://www.origami.com","1274322366@qq.com"))
                //职业
                .license("搬砖的")
                //执照网址
                .licenseUrl("http://www.4399.com")
                .build();
    }

}
