package com.sermami.atlantis.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sermami.atlantis.fragments.LoginFragment;
import com.sermami.atlantis.fragments.SignUpFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

//    @StringRes
//    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch(position){

            case 0:
                return new LoginFragment();
            case 1:
                return new SignUpFragment();
            default:
                return null;
        }

//        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
////        return mContext.getResources().getString(TAB_TITLES[position]);
//    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}