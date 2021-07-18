package com.example.tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragment.R;

public class lihat_prev extends AppCompatActivity {
    TextView fname;
    ImageView fimage;
    TextView ftext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_prev);
        fname = findViewById(R.id.img_name);
        fimage = findViewById(R.id.img_sec);
        ftext = findViewById(R.id.long_text);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int getImg = bundle.getInt("img_url");
            String getTitle = bundle.getString("title");
            String getDetail = bundle.getString("detail");

            fname.setText(getTitle);
            ftext.setText(getDetail);
            fimage.setImageResource(getImg);
        } else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.list:
                Intent intent = new Intent(this, com.example.tugas4.MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}