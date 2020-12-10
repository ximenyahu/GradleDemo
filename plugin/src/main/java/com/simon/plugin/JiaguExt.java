package com.simon.plugin;

public class JiaguExt {
    //360用户账号
    private String userName;

    //360用户密码
    private String userPwd;

    //签名路径
    private String keyStorePath;

    //签名密码
    private String keyStorePwd;

    //签名别名
    private String keyStoreKeyAlia;

    //签名别名密码
    private String keyStoreKeyAliaPwd;

    public JiaguExt(String userName, String userPwd, String keyStorePath, String keyStorePwd, String keyStoreKeyAlia, String keyStoreKeyAliaPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.keyStorePath = keyStorePath;
        this.keyStorePwd = keyStorePwd;
        this.keyStoreKeyAlia = keyStoreKeyAlia;
        this.keyStoreKeyAliaPwd = keyStoreKeyAliaPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getKeyStorePath() {
        return keyStorePath;
    }

    public void setKeyStorePath(String keyStorePath) {
        this.keyStorePath = keyStorePath;
    }

    public String getKeyStorePwd() {
        return keyStorePwd;
    }

    public void setKeyStorePwd(String keyStorePwd) {
        this.keyStorePwd = keyStorePwd;
    }

    public String getKeyStoreKeyAlia() {
        return keyStoreKeyAlia;
    }

    public void setKeyStoreKeyAlia(String keyStoreKeyAlia) {
        this.keyStoreKeyAlia = keyStoreKeyAlia;
    }

    public String getKeyStoreKeyAliaPwd() {
        return keyStoreKeyAliaPwd;
    }

    public void setKeyStoreKeyAliaPwd(String keyStoreKeyAliaPwd) {
        this.keyStoreKeyAliaPwd = keyStoreKeyAliaPwd;
    }
}
