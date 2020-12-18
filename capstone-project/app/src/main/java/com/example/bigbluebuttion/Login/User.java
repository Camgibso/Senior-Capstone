package com.example.bigbluebuttion.Login;



public class User {
    private String email;
    private String password;
    private String first;
    private String middle;
    private String last;
    private long mobile;

    public User() {
        //we call the default constructor of Date
        super();
        //set all provate members to default values
        first = "unknown";
        middle= "unknown";
        last = "unknown";
        mobile = 0;
        email = "unknown";
        password = "unknown";
    }
    public User (String dob, String fn,String mn, String ln, String e, long s, String p) {

        first = fn;
        last = ln;
        middle =mn;
        mobile = s;
        email = e;
        password =p;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(String mob) {
        this.mobile = (Long.parseLong(mob));
    }

    public String getfirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getlast() {
        return last;
    }

    public void setMiddle(String middle){this.middle = middle;}

    public String getMiddle(){return middle;}

    public void setLast(String last) {
        this.last = last;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
