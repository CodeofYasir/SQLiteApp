package com.s.sqliteapp.RecyclerPakage;

import android.graphics.Bitmap;

public class DbModelClass {
    String imageDes;
    Bitmap ourImage;

    public String getImageDes() {
        return imageDes;
    }

    public void setImageDes(String imageDes) {
        this.imageDes = imageDes;
    }

    public Bitmap getOurImage() {
        return ourImage;
    }

    public void setOurImage(Bitmap ourImage) {
        this.ourImage = ourImage;
    }

    public DbModelClass(String imageDes, Bitmap ourImage) {
        this.imageDes = imageDes;
        this.ourImage = ourImage;
    }
}
