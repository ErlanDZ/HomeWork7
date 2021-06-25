package com.example.homework7;

public class OnDoardingModel {
    String mTitle, mDescription;
    int mImage;

    public OnDoardingModel(String mTitle, String mDescription, int mImage) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mImage = mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
