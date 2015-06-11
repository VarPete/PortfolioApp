package com.dataunavailable.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioLanding extends AppCompatActivity {

    Toast lastToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_landing);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_landing, menu);
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

    public void runProject(View view) {
        if (view instanceof Button) {
            StringBuilder toastMessage = new StringBuilder("This button will launch my");
            switch (view.getId()) {
                case R.id.project1:
                    toastMessage.append(" Media Streamer");
                    break;
                case R.id.project2:
                    toastMessage.append(" Scores");
                    break;

                case R.id.project3:
                    toastMessage.append(" Library");
                    break;

                case R.id.project4:
                    toastMessage.append(" Gradle Project");
                    break;

                case R.id.project5:
                    toastMessage.append(" Reader");
                    break;

                case R.id.project6:
                    toastMessage.append(" capstone");
                    break;
            }

            toastMessage.append(" app");

            if (lastToast != null) {
                lastToast.cancel();
            }

            lastToast = Toast.makeText(this, toastMessage.toString(), Toast.LENGTH_SHORT);
            lastToast.show();

        }
    }
}
