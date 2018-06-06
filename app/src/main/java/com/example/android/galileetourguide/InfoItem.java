package com.example.android.galileetourguide;


/**
 * {@link InfoItem} represents an item of the tour guide that the user wants to explore.
 * It contains resource IDs for the picture, map coordinates, address, the description of the place.
 */
public class InfoItem {



    /** String resource ID for the title of the item */
    private int mItemTitleId;

    /** String resource ID for description of the item */
    private int mDescriptionId;

    /** String resource ID of the web address */
    private int mWebAddressId;

    /** String resource ID of the street address of the item */
    private int mStreetAddressId;

    /** String resource ID of the link to the GoogleMaps */
    private int mLocationId;

    /** Image resource ID for the small image of item */
    private int mSmallImageResourceId;

    /** Image resource ID for the large image of item */
    private int mLargeImageResourceId;

    /**
     * Create a new InfoItem object.
     *
     * @param itemTitleId is the string resource ID for the title of the item
     * @param descriptionId is the string resource ID for the description of the item
     * @param webAddressId is the string resource Id for the web  address of the item
     * @param streetAddressId is the string resource Id for the street address of the item
     * @param locationId is the resource ID for the link to the map
     * @param smallImageResourceId is the resource ID for the small image file of the item
     * @param largeImageResourceId is the resource ID for the large image file of the item
     */
    public InfoItem(int itemTitleId, int descriptionId, int webAddressId, int streetAddressId,
                    int locationId, int smallImageResourceId, int largeImageResourceId)
    {
        mItemTitleId = itemTitleId;
        mDescriptionId = descriptionId;
        mWebAddressId = webAddressId;
        mStreetAddressId = streetAddressId;
        mLocationId = locationId;
        mSmallImageResourceId = smallImageResourceId;
        mLargeImageResourceId = largeImageResourceId;
    }


    /**
     * Get the string resource ID for the title of the item.
     */
    public int getItemTitleId() {
        return  mItemTitleId;
    }


    /**
     * Get the string resource ID for the description of the item.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }


    /**
     * Get the string resource ID for the web address of the item.
     */
    public int getWebAddressId() {
        return mWebAddressId;
    }

    /**
     * Get the string resource ID for the web address of the item.
     */
    public int getStreetAddressId() {
        return mStreetAddressId;
    }

    /**
     * Get the string resource ID for the link to the map.
     */
    public int getLocationId() {
        return mLocationId;
    }


    /**
     * Return resource ID for the  small image file of the item.
     */
    public int getSmallImageResourceId() {
        return mSmallImageResourceId;
    }

    /**
     * Return resource ID for the  large image file of the item.
     */
    public int getLargeImageResourceId() {
        return mLargeImageResourceId;
    }


}