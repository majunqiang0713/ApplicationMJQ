package com.example.sgxk;

class NewClass {
    private String name;
    private String passWord;
    private String userName;
    private String id;

    public NewClass(String name, String passWord, String userName, String id) {
        this.name = name;
        this.passWord = passWord;
        this.userName = userName;
        this.id = id;
    }

    public NewClass() {


    }
     public NewClass(String name, String passWord) {

      this.name = name;
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
