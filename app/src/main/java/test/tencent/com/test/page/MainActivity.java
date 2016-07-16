package test.tencent.com.test.page;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import test.tencent.com.test.fragment.MainActivityFragment;
import test.tencent.com.test.R;
import test.tencent.com.test.fragment.SecondActivityFragment;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called with: " + "");
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new MainActivityFragment()).commitAllowingStateLoss();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called with: " + "");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called with: " + "");
        super.onDestroy();

    }

    @Override
    protected void onPause() {

        Log.d(TAG, "onPause() called with: " + "");

        super.onPause();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "onCreateOptionsMenu() called with: " + "menu = [" + menu + "]");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action1:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new MainActivityFragment()).commitAllowingStateLoss();
                break;
            case R.id.action2:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new SecondActivityFragment()).commitAllowingStateLoss();
                break;
            case R.id.action3:
                startActivity(new Intent(this,SecondActivity.class));
                break;
            case R.id.action4:
                startActivity(new Intent(this,SurfaceViewActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
