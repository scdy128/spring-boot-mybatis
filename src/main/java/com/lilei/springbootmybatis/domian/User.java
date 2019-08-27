package com.lilei.springbootmybatis.domian;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String username;
    private String password;
    private String mobileNum;
}
