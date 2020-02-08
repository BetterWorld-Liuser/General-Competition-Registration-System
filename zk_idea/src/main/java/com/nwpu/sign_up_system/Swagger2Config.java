package com.nwpu.sign_up_system;

/**
 * @Author = The Great Ke
 * @description:
 * @Date: Creat in 14:12 2019/11/20
 * @modified by :
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : Aslan
 * @version : v1.0
 * @time : 2018-07-24 14:57
 * @desc : Swagger2配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2Config extends WebMvcConfigurationSupport {

    /**
     * 因为 Swagger2的资源文件都是在jar包里面，如果不在此处配置加载静态资源，
     * 会导致请求http://localhost/swagger-ui.html失败
     *  <!--swagger资源配置-->
     *  <mvc:resources location="classpath:/META-INF/resources/" mapping="swagger-ui.html"/>
     *  <mvc:resources location="classpath:/META-INF/resources/webjars/" mapping="/webjars/**"/>
     *
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nwpu.sign_up_system.controller"))
                .paths(PathSelectors.any())
                .build()
                //不需要时，或者生产环境可以在此处关闭
                .enable(true);

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("省赛报名系统后端接口文档（部分）")
                .description("后端使用springboot开发，接口文档使用Swagger2生成")
                //服务条款网址
                .termsOfServiceUrl("https://github.com/thegreatke")
                .version("1.7")
                .build();
    }



}
