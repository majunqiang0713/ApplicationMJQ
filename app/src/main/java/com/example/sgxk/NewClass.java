package com.example.sgxk;

class NewClass {
    private String name;
    private String passWord;
    private String userName;

    public NewClass(String name, String passWord, String userName) {
        this.name = name;
        this.passWord = passWord;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
