package net.biancheng.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard // 开启Hystrix监控功能
public class MicroServiceCloudConsumerDeptHystrixDashboard9002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDeptHystrixDashboard9002Application.class, args);
    }

}
