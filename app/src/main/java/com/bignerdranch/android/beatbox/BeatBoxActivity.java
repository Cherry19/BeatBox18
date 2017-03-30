package com.bignerdranch.android.beatbox;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.beatbox.BeatBoxFragment;
import com.bignerdranch.android.beatbox.SingleFragmentActivity;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return BeatBoxFragment.newInstance();
    }
}
