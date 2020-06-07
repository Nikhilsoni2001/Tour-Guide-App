package com.example.projecttour;

public class Data {

//    Here we'll be holding the data

    private String mPlaceName;
    private String mPlacedetails;
    private int mPlaceImageId = DEFAULT_ID;
    private static final int DEFAULT_ID = -1;

    public Data(String placeName, String placeDetails, int placeImageId) {
        mPlaceName = placeName;
        mPlacedetails = placeDetails;
        mPlaceImageId = placeImageId;
    }

    public Data(String placeName, String placeDetails) {
        mPlaceName = placeName;
        mPlacedetails = placeDetails;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlacedetails() {
        return mPlacedetails;
    }

    public int getmPlaceImageId() {
        return mPlaceImageId;
    }

    public boolean hasImage() {
        return mPlaceImageId != DEFAULT_ID;
    }
}
