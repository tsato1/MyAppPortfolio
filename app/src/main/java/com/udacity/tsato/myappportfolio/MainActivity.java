package com.udacity.tsato.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button spotifyStreamerButton;
    private Button scoresAppButton;
    private Button libraryAppButton;
    private Button buildItBiggerButton;
    private Button xyzReaderButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamerButton = (Button) findViewById(R.id.btn_spotify_streamer);
        scoresAppButton = (Button) findViewById(R.id.btn_scores_app);
        libraryAppButton = (Button) findViewById(R.id.btn_library_app);
        buildItBiggerButton = (Button) findViewById(R.id.btn_build_it_bigger);
        xyzReaderButton = (Button) findViewById(R.id.btn_xyz_reader);
        capstoneButton = (Button) findViewById(R.id.btn_capstone);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_spotify_streamer:
                Toast.makeText(MainActivity.this, "Spotify streamer will be launched", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores_app:
                Toast.makeText(MainActivity.this, "Score App will be launched", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library_app:
                Toast.makeText(MainActivity.this, "Library App will be launched", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(MainActivity.this, "Build It Bigger will be launched", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz_reader:
                Toast.makeText(MainActivity.this, "XYZ Reader will be launched", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(MainActivity.this, "Capstone App will be launched", Toast.LENGTH_SHORT).show();
                break;
        }
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
}
