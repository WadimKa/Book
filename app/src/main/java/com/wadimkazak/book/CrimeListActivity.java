package com.wadimkazak.book;

import android.support.v4.app.Fragment;

/**
 * Created by Wadim on 16.04.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
