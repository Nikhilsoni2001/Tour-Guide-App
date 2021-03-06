package com.example.projecttour;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AmritsarFragment();
            case 1:
                return new ChandigarhFragment();
            case 3:
                return new HaridwarFragment();
            default:
                return new GoaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.place_1);
            case 1:
                return mContext.getString(R.string.place_2);
            case 2:
                return mContext.getString(R.string.place_3);
            case 3:
                return mContext.getString(R.string.place_4);
            default:
                return null;
        }
    }
}
