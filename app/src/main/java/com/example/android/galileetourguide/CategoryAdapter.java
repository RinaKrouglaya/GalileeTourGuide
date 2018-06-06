package com.example.android.galileetourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.galileetourguide.Fragments.AboutFragment;
import com.example.android.galileetourguide.Fragments.AttractionsFragment;
import com.example.android.galileetourguide.Fragments.FoodFragment;
import com.example.android.galileetourguide.Fragments.WineFragment;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link InfoItem} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context , FragmentManager fm) {
        super ( fm );
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment ();
        } else if (position == 1) {
            return new AttractionsFragment ();
        } else if (position == 2) {
            return new FoodFragment ();
        } else {
            return new WineFragment ();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {

            return mContext.getString ( R.string.about_tab );

        } else if (position == 1) {
            return mContext.getString ( R.string.attractions_tab );
        } else if (position == 2) {
            return mContext.getString ( R.string.food_tab );
        } else {
            return mContext.getString ( R.string.wine_tab );
        }
    }
}

