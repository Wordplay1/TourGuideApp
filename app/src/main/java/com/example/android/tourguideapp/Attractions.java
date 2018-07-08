package com.example.android.tourguideapp;

/**
 * Attractions class to maintain all attractions data
 *
 * @Author: Donald Mears
 * @date: 7/5/2018
 */
public class Attractions {

    private String attractName;

    private String attractAddress;

    private String attractPhoNumber;

    private String attractDescription;

    private int attractImageResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Attractions(String name, String address, String phoneNumber, String description) {
        attractName = name;
        attractAddress = address;
        attractPhoNumber = phoneNumber;
        attractDescription = description;
    }
    /**
     * 2nd Constructor
     *
     * @param name            Attraction name
     * @param address         Attraction address
     * @param phoneNumber     Attraction phone number
     * @param imageResourceId Attraction image
     */
    public Attractions(String name, String address, String phoneNumber, String description, int imageResourceId) {
        attractName = name;
        attractAddress = address;
        attractPhoNumber = phoneNumber;
        attractDescription = description;
        attractImageResourceId = imageResourceId;
    }

    /**
     * method to return attraction name
     *
     * @return attractName   Name of Attraction
     */
    public String getName() {
        return attractName;
    }

    /**
     * method to return attraction address
     *
     * @return attractAddress   Address of Attraction
     */
    public String getAddress() {
        return attractAddress;
    }

    /**
     * method to return attraction phone number
     *
     * @return attractPhoNumber   Phone Number of Attraction
     */
    public String getPhoneNumber() {
        return attractPhoNumber;
    }

    /**
     * method to return image
     *
     * @return attractImageResource   Image of Attraction
     */
    public int getImageResourceId() {
        return attractImageResourceId;
    }

    /**
     * method to check if object has image
     *
     * @return attractImageResourceId  returns true or false
     */
    public String getDescription(){
        return attractDescription;
    }
    public boolean hasImage() {
        return attractImageResourceId != NO_IMAGE_PROVIDED;
    }
}
