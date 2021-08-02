package com.example.quakereport;

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;


    public Earthquake(double Magnitude, String Location, long TimeInMilliseconds, String Url)
    {
        mMagnitude = Magnitude;

        mLocation = Location;

        mTimeInMilliseconds = TimeInMilliseconds;

        mUrl = Url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getUrl()
    {
        return mUrl;
    }
}
