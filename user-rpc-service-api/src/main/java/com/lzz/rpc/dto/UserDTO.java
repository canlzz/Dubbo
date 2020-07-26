package com.lzz.rpc.dto;

import java.io.Serializable;

/**
 *  
 *  * All rights Reserved, Designed By www.XXXX.com
 *  * @projectName dubbo
 *  * @title     UserDTO   
 *  * @package    com.lzz.rpc.dto  
 *  * @description      
 *  * @author candidcrat     
 *  * @date   2020/7/16 22:05  
 *  * @version V1.0.0
 *  * @copyright 2020 www.XXXXX.com
 *  * 注意 本内容仅限于 XXXXX科技有限公司，禁止外泄以及用于其他的商业 
 *  
 */

public class UserDTO implements Serializable {

    /**
     * 用户编号
     */
    private Integer id;

    public UserDTO(Integer id, String name, Integer gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;

    public UserDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
