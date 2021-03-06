package com.android.udacitynewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StoryAdapter extends ArrayAdapter<Story> {
    public StoryAdapter(Context context, ArrayList<Story> stories) {
        super(context, 0, stories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Story currentStory = getItem(position);

        TextView titleView = convertView.findViewById(R.id.title_text_view);
        titleView.setText(currentStory.getmStoryTitle());

        TextView authorTextView = convertView.findViewById(R.id.author_text_view);
        authorTextView.setText(currentStory.getmStoryAuthor());

        TextView sectionView = convertView.findViewById(R.id.section_text_view);
        sectionView.setText(getContext().getString(R.string.section) + " " + currentStory.getmStorySection());

        TextView dateView = convertView.findViewById(R.id.date_text_view);
        dateView.setText(getContext().getString(R.string.published) + " " + formattedDate(currentStory.getmStoryDate()));

        return convertView;
    }

    private String formattedDate(String date) {
        return date.split("T")[0];
    }

}
