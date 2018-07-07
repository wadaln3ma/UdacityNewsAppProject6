package com.android.udacitynewsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class StoryLoader extends AsyncTaskLoader {
    private String mUrl;

    public StoryLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Story> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.fetchStoryData(mUrl);
    }
}
