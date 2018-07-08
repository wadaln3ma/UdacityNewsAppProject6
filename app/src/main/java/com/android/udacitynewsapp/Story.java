package com.android.udacitynewsapp;

public class Story {
    private String mStoryTitle;
    private String mStorySection;
    private String mStoryDate;
    private String mUrl;

    public Story(String mStoryTitle, String mStoryAuthor, String mStoryDate, String mURL) {
        this.mStoryTitle = mStoryTitle;
        this.mStorySection = mStoryAuthor;
        this.mStoryDate = mStoryDate;
        this.mUrl = mURL;
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
