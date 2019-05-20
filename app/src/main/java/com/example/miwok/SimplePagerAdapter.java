package com.example.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimplePagerAdapter extends FragmentPagerAdapter {

    SimplePagerAdapter (FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int i) {
        if (i==0)
            return new NumberFragment();
        else if (i==1)
            return new FamilyFragment();
        else if (i==2)
            return new ColorsFragment();
        else
            return new PhrasesFragment();
    }
}
