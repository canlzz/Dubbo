package com.lzz.rpc.api;

import com.lzz.rpc.dto.UserDTO;

/**
 *  
 *  * All rights Reserved, Designed By www.XXXX.com
 *  * @projectName dubbo
 *  * @title     UserRpcService   
 *  * @package    com.lzz.rpc.api  
 *  * @description      
 *  * @author candidcrat     
 *  * @date   2020/7/16 22:07  
 *  * @version V1.0.0
 *  * @copyright 2020 www.XXXXX.com
 *  * 注意 本内容仅限于 XXXXX科技有限公司，禁止外泄以及用于其他的商业 
 *  
 */
public interface UserRpcService {
    /**
     * 根据指定用户编号，获得用户信息
     *
     * @param id 用户编号
     * @return 用户信息
     */
    UserDTO get(Integer id);
}
