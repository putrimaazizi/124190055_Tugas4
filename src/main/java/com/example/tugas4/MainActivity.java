package com.example.tugas4;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.fragment.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = new ListFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(selectedFragment);
        bottomNavigationView = findViewById(R.id.main_navbar);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.ic_list:
                selectedFragment = new ListFragment();
                break;

            case R.id.ic_call:
                selectedFragment = new CallFragment();
                break;
        }

        return loadFragment(selectedFragment);
    }

    private boolean loadFragment(Fragment selectedFragment) {
        if (selectedFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_frame, selectedFragment)
                    .commit();
            return true;
        }
        return false;
    }
}