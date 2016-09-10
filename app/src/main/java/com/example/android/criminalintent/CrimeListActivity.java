package com.example.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Chris on 9/10/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
