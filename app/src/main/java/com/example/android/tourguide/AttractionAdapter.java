package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jam on 11.06.2017.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    private int mColorResourceId;

    public AttractionAdapter(Context context, ArrayList<Attraction> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_text_view);
        attractionName.setText(currentAttraction.getAttractionName());

        TextView attractionDescription = (TextView) listItemView.findViewById(R.id.description_text_view);
        attractionDescription.setText(currentAttraction.getAttractionDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentAttraction.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

