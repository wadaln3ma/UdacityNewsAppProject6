package com.android.udacitynewsapp;

public class Story {
    private String mStoryTitle;
    private String mStoryAuthor;
    private String mStoryDate;
    private String mUrl;

    public Story(String mStoryTitle, String mStoryAuthor, String mStoryDate, String mURL) {
        this.mStoryTitle = mStoryTitle;
        this.mStoryAuthor = mStoryAuthor;
        this.mStoryDate = mStoryDate;
        this.mUrl = mURL;
    }

    public String getmStoryTitle() {
        return mStoryTitle;
    }

    public String getmStoryAuthor() {
        return mStoryAuthor;
    }

    public String getmStoryDate() {
        return mStoryDate;
    }

    public String getmUrl() {
        return mUrl;
    }
}
