package com.example.mind.recyclerview_demo;

/**
 * Created by mind on 30/6/17.
 */

public class User {

    public static final int TEXT_TYPE=0;
    public static final int IMAGE_TYPE=1;

    public int type;
    public int data;
    public String text;
    public String email;
    public String number;

    public User(int type, String text, int data,String email,String number)
    {
        this.type=type;
        this.data=data;
        this.text=text;
        this.email=email;
        this.number=number;
    }
}
