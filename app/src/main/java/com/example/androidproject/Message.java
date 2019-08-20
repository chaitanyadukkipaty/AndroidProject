package com.example.androidproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String text;
    private int type;
    private Date timestamp;

    public Message(String text, int type) {
        this.text = text;
        this.type = type;
        this.timestamp = new Date();
    }

    public String getText() {
        return text;
    }

    public int getType() {
        return type;
    }

    public String getTime() {
        SimpleDateFormat localDateFormat = new SimpleDateFormat("hh:mm a");
        return localDateFormat.format(timestamp);
    }
}
