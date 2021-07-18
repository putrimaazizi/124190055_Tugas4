package com.example.tugas4;

import android.Manifest;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.fragment.R;


public class CallFragment extends Fragment {
    EditText txt;
    Button btnDialNumber;
    private static final int REQUEST_PHONE_CALL = 1;
    public CallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt = view.findViewById(R.id.txtNo);

        btnDialNumber = view.findViewById(R.id.btncall);
        btnDialNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtno = txt.getText().toString();
                Intent intentCall = new Intent(Intent.ACTION_CALL);
                intentCall.setData(Uri.parse("tel:" + txtno));
                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                }
                else {
                    startActivity(intentCall);
                }

            }
        });
    }


}