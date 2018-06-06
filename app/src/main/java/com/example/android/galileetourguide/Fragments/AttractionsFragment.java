package com.example.android.galileetourguide.Fragments;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.galileetourguide.InfoItem;
import com.example.android.galileetourguide.InfoItemAdapter;
import com.example.android.galileetourguide.R;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of info items.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.infoitem_list, container, false);


        // Create a list of infoItems
        final ArrayList<InfoItem> infoItems = new ArrayList<InfoItem>();

        infoItems.add(new InfoItem(R.string.attraction_one_title,
                R.string.attraction_one_description, R.string.attraction_one_www,
                R.string.attraction_one_street_address, R.string.attraction_one_location,
                R.drawable.attonesmall, R.drawable.attone));

        infoItems.add(new InfoItem(R.string.attraction_two_title,
                R.string.attraction_two_description, R.string.attraction_two_www,
                R.string.attraction_two_street_address, R.string.attraction_two_location,
                R.drawable.atttwosmall, R.drawable.atttwo));

        infoItems.add(new InfoItem(R.string.attraction_three_title,
                R.string.attraction_three_description, R.string.attraction_three_www,
                R.string.attraction_three_street_address, R.string.attraction_three_location,
                R.drawable.attthreesmall, R.drawable.attthree));

        infoItems.add(new InfoItem(R.string.attraction_four_title,
                R.string.attraction_four_description, R.string.attraction_four_www,
                R.string.attraction_four_street_address, R.string.attraction_four_location,
                R.drawable.attfoursmall, R.drawable.attfour));

        infoItems.add(new InfoItem(R.string.attraction_five_title,
                R.string.attraction_five_description, R.string.attraction_five_www,
                R.string.attraction_five_street_address, R.string.attraction_five_location,
                R.drawable.attfivesmall, R.drawable.attfive));

        infoItems.add(new InfoItem(R.string.attraction_six_title,
                R.string.attraction_six_description, R.string.attraction_six_www,
                R.string.attraction_six_street_address, R.string.attraction_six_location,
                R.drawable.attsixsmall, R.drawable.attsix));

        infoItems.add(new InfoItem(R.string.attraction_seven_title,
                R.string.attraction_seven_description, R.string.attraction_seven_www,
                R.string.attraction_seven_street_address, R.string.attraction_seven_location,
                R.drawable.attsevensmall, R.drawable.attseven));

        infoItems.add(new InfoItem(R.string.attraction_eight_title,
                R.string.attraction_eight_description, R.string.attraction_eight_www,
                R.string.attraction_eight_street_address, R.string.attraction_eight_location,
                R.drawable.atteightsmall, R.drawable.atteight));

        infoItems.add(new InfoItem(R.string.attraction_nine_title,
                R.string.attraction_nine_description, R.string.attraction_nine_www,
                R.string.attraction_nine_street_address, R.string.attraction_nine_location,
                R.drawable.attninesmall, R.drawable.attnine));

        infoItems.add(new InfoItem(R.string.attraction_ten_title,
                R.string.attraction_one_description, R.string.attraction_ten_www,
                R.string.attraction_ten_street_address, R.string.attraction_ten_location,
                R.drawable.atttensmall, R.drawable.attten));


        // Create an {@link InfoItemAdapter}, whose data source is a list of {@link InfoItem}s. The
        // adapter knows how to create list items for each item in the list.
        InfoItemAdapter adapter = new InfoItemAdapter(getActivity(), infoItems,
                R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // infoitem_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InfoItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link InfoItem} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to open additional information when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                openTheDetailedView (position, infoItems);

            }
        });

        return rootView;
    }

    private void openTheDetailedView(int itemPosition, final ArrayList <InfoItem> infoItems) {

// custom dialog
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.detailed_view);

        final InfoItem item = infoItems.get (itemPosition);
        // set the custom dialog components - text, image and button
        TextView textItemDescription =  dialog.findViewById(R.id.item_description);
        textItemDescription.setText (item.getDescriptionId());

        ImageView itemLargeImage =  dialog.findViewById(R.id.item_large_image);
        itemLargeImage.setImageResource (item.getLargeImageResourceId ());

        TextView textItemStreetAddress =  dialog.findViewById(R.id.item_address);
        textItemStreetAddress.setText (item.getStreetAddressId ());

        TextView textItemWebAddress =  dialog.findViewById(R.id.item_web_address);
        textItemWebAddress.setText (item.getWebAddressId ());

        Button dialogButton = (Button) dialog.findViewById(R.id.close_button);
        // if button is clicked, close the custom dialog

        dialogButton.setOnClickListener(new android.view.View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ImageView locationIcon=  dialog.findViewById (R.id.location_icon);
        locationIcon.setOnClickListener(new android.view.View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent (Intent.ACTION_VIEW,
                        Uri.parse(getString (item.getLocationId ())));
                startActivity (browser);
            }
        });

        textItemStreetAddress.setOnClickListener(new android.view.View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent (Intent.ACTION_VIEW,
                        Uri.parse(getString (item.getLocationId ())));
                startActivity (browser);
            }
        });

        dialog.show();
    }





}

