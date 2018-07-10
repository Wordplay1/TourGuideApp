package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new PlayFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    /**method returns name strings for tabs
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.tabOne);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.tabTwo);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.tabThree);
        } else {
            return mContext.getResources().getString(R.string.tabFour);
        }
    }
}

