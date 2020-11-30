package com.xds;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: mycloud2020
 * @description: 自己的Ribbon负载均衡策略。
 * 注意：这个类不能配置在@ComponentScan扫描的当前包以及子包下面。否则我们定义的这个规则就被所有的Ribbon客户端共享。
 * 简单说，就是不能放在启动类所在的包目录下。因为主启动类@SpringBootApplication这个注解会扫描到。
 * @author: xudasheng
 * @create: 2020-11-30 23:51
 **/
@Configuration
public class Myrule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }

}
