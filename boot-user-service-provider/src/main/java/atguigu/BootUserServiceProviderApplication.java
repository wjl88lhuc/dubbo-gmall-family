package atguigu;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @EnableDubbo的作用：开启基于注解功能的dubbo功能
 *
 * 1. 导入依赖:
 *      （1） 导入 dubbo-starter
 *      （2） 导入dubbo的其他依赖
 */
@EnableDubbo
@SpringBootApplication
public class BootUserServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class,args);
    }
}
