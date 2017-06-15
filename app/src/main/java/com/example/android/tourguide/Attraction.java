package com.example.android.tourguide;

/**
 * Created by Jam on 11.06.2017.
 */

public class Attraction {

    private String mAttractionName;
    private String mAttractionDescription;
    private int mImageResourceID;


    public Attraction(String AttractionName, String AttractionDescription, int ImageResourceID) {
        mAttractionDescription = AttractionDescription;
        mAttractionName = AttractionName;
        mImageResourceID = ImageResourceID;
    }

    public String getAttractionName() {
        return mAttractionName;
    }
    public String getAttractionDescription() {
        return mAttractionDescription;
    }
    public int getImageResourceId() {
        return mImageResourceID;
    }
}
