package com.Beye.BeyeApp.base.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.Beye.BeyeApp.R;
import com.Beye.BeyeApp.base.BYBaseFragment;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends BYBaseFragment {

    private View v;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_main, container, false);

        return v;
    }
}
