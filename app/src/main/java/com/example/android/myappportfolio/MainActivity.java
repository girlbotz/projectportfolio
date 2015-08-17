package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Open Spotify app
     * @param view
     */
    public void openSpotify(View view){
        openToastForApp(R.string.spotify_app);
    }

    public void openScoresApp(View view){
        openToastForApp(R.string.scores_app);
    }

    public void openLibraryApp(View view){
        openToastForApp(R.string.library_app);
    }

    public void openBuildItBigger(View view){
        openToastForApp(R.string.build_it_bigger);
    }

    public void openXYZReader(View view){
        openToastForApp(R.string.xyz_reader);
    }

    public void openOwnApp(View view){
        openToastForApp(R.string.own_app);
    }

    private void openToastForApp(int appName) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will open " +
                getApplicationContext().getResources().getString(appName), Toast.LENGTH_SHORT);
        toast.show();
    }
}
