package com.lzz.rpc.service;

import com.lzz.rpc.api.UserRpcService;
import com.lzz.rpc.dto.UserDTO;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserRpcServiceImpl implements UserRpcService {
    @Override
    public UserDTO get(Integer id) {
        return new UserDTO(id,"没有昵称"+id,id%2+1);//1-男,2-女

    }
}
