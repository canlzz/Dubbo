package com.lzz.rpc;

import com.lzz.rpc.api.UserRpcService;
import com.lzz.rpc.dto.UserDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class ConsumerApplication {
    public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class,args);
    }
    @Component
    public  class  UserServiceRpcService implements CommandLineRunner {
        private final Logger logger = LoggerFactory.getLogger(getClass());

        @Reference
        private UserRpcService userviceRpcService;

        @Override
        public void run(String... args) throws Exception {
            UserDTO userDTO = userviceRpcService.get(1);
            logger.info("[run][发起一次 Dubbo RPC 请求，获得用户为({})",userDTO);
        }


    }
}
