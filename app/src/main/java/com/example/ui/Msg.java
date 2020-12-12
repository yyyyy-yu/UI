package com.example.ui;

/**
 * Created by 29114 on 2020/12/11.
 */
public class Msg {
    public static final int TYPE_RECETIVED = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;
    public Msg(String content,int type ) {
        this.content = content;
        this.type = type;
    }
    public String getContent() {
        return content;
    }
    public int getType() {
        return type;
    }
}
