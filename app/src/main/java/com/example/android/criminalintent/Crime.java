package com.example.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Chris on 9/6/2016.
 */
public class Crime {
    private String mTitle;
    private UUID mID;
    private Date mDate;
    private Boolean mSolved;

    public Crime(){
        //generate unique identifier
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }


}
