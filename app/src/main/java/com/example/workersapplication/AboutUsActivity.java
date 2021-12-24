package com.example.workersapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.material.navigation.NavigationView;

public class AboutUsActivity extends AppCompatActivity {

    ImageView leaders_img,img1,img2;
    RelativeLayout menu_btn;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.homered));
        setContentView(R.layout.activity_about_us);

        leaders_img = findViewById(R.id.leaders_img);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        leaders_img.setClipToOutline(true);
        img1.setClipToOutline(true);
        img2.setClipToOutline(true);

        menu_btn = findViewById(R.id.home_menu_btn);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        drawerLayout.closeDrawer(Gravity.LEFT);

        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.workers:
                        Intent intent = new Intent(getApplicationContext(),WorkersActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.home:
                        Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.settings:
                        Intent intent2 = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent2);
                        break;

                    case R.id.profile:
                        Intent intent3 = new Intent(getApplicationContext(),UserProfile.class);
                        startActivity(intent3);
                        break;

                }
                return false;
            }
        });
    }
}