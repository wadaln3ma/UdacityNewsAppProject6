package com.android.udacitynewsapp;

public class Story {
    private String mStoryTitle;
    private String mStorySection;
    private String mStoryDate;
    private String mUrl;

    public Story(String mStoryTitle, String mStorySection, String mStoryDate, String mUrl) {
        this.mStoryTitle = mStoryTitle;
        this.mStorySection = mStorySection;
        this.mStoryDate = mStoryDate;
        this.mUrl = mUrl;
    }

    public String getmStoryTitle() {
        return mStoryTitle;
    }

    public String getmStorySection() {
        return mStorySection;
    }

    public String getmStoryDate() {
        return mStoryDate;
    }

    public String getmUrl() {
        return mUrl;
    }
}
