package com.example.manson.listviewtest;

/**
 * Created by Administrator on 2015/11/10.
 */
public class ListViewItem{
    private int imgId;
    private String text;

    public ListViewItem(int imgId,String text){
        this.imgId = imgId;
        this.text = text;
    }

    public int getImgId(){
        return imgId;
    }

    public String getText(){
        return text;
    }
}
