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
public class MenuFragment extends BYBaseFragment {

    private View v;

    public MenuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.menu_fragment, container, false);
        Button btn=(Button)v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseObject testObject = new ParseObject("TestObject");
                testObject.put("foo", "bar");
                testObject.saveInBackground(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            // Success!
                            Log.i("beye", "success");
                        }
                        else
                            Log.i("beye", ""+e);
                    }
                });
            }
        });
        return v;
    }
}
