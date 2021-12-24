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

public class UserProfile extends AppCompatActivity {
    RelativeLayout menu_btn;
    ImageView profile_img;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.homered));
        setContentView(R.layout.activity_user_profile);

        menu_btn = findViewById(R.id.home_menu_btn);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        profile_img = findViewById(R.id.profile_image);
        profile_img.setClipToOutline(true);

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

                    case R.id.aboutus:
                        Intent intent1 = new Intent(getApplicationContext(),AboutUsActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.settings:
                        Intent intent2 = new Intent(getApplicationContext(),Settings.class);
                        startActivity(intent2);
                        break;

                    case R.id.home:
                        Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent3);
                        break;

                }
                return false;
            }
        });
    }
}