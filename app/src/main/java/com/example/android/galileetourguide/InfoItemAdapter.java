package com.example.android.galileetourguide;


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
 * {@link InfoItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link InfoItem} objects.
 */
public class InfoItemAdapter extends ArrayAdapter <InfoItem> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link InfoItemAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param infoItems       is the list of {@link InfoItem}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public InfoItemAdapter(Context context , ArrayList <InfoItem> infoItems , int colorResourceId) {
        super ( context , 0 , infoItems );
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item , parent , false );
        }

        // Get the {@link InfoItem} object located at this position in the list
        InfoItem currentItem = getItem ( position );

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById ( R.id.title_text_view );
        // Get the infoItem title from the currentItem object and set this text on
        // the  TextView.
        titleTextView.setText ( currentItem.getItemTitleId () );
        int textColor = ContextCompat.getColor ( getContext () , R.color.main_text_color );
        titleTextView.setTextColor ( textColor );


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById ( R.id.image );

        // Display the provided image based on the resource ID
        imageView.setImageResource ( currentItem.getSmallImageResourceId () );


        // Set the theme color for the list item
        View itemContainer = listItemView.findViewById ( R.id.item_container );
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor ( getContext () , mColorResourceId );
        // Set the background color of the text container View
        itemContainer.setBackgroundColor ( color );

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}