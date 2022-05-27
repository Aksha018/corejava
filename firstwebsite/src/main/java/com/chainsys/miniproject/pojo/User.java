package com.chainsys.miniproject.pojo;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class User {
	private String UserId;
    private String password;
    public String getUserId() {
        return UserId;
    }
    public void setUserId(String userId) {
        this.UserId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
