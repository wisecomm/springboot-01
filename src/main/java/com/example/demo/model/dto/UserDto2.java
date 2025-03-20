package com.example.demo.model.dto;

public class UserDto2 {
    private String userSq;
    private String userId;
    private String userPw;
    private String userNm;

    // Getters and Setters
    public String getUserSq() {
        return userSq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }
}