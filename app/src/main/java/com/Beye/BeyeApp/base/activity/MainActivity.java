package com.Beye.BeyeApp.base.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

import com.Beye.BeyeApp.R;
import com.Beye.BeyeApp.base.BYBaseActivity;
import com.Beye.BeyeApp.base.fragment.MainFragment;

import shared.ui.actionscontentview.ActionsContentView;

public class MainActivity extends BYBaseActivity {
    final static String tag = "beyeTag";
    private ActionsContentView viewActionsContentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewActionsContentView = (ActionsContentView) findViewById(R.id.actionsContentView);
        Fragment main;
        main = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, main).commit();



    }//

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
