package com.example.brandon.woofly;

public class ScreenItem {

    String Title, Descriotion;
    int ScreenImg;

    public ScreenItem(String title, String descriotion, int screenImg) {
        Title = title;
        Descriotion = descriotion;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescriotion() {
        return Descriotion;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescriotion(String descriotion) {
        Descriotion = descriotion;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
