package com.example.tugas4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.R;

import java.util.ArrayList;


public class ListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private RecyclerView rvBuku;
    private ArrayList<BukuModel> listBuku = new ArrayList<>();

    public ListFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvBuku = view.findViewById(R.id.rv_target);
        rvBuku.setHasFixedSize(true);
        listBuku.addAll(BukuData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList()  {
        rvBuku.setLayoutManager(new LinearLayoutManager(getActivity()));
        BukuAdapter BukuAdapter = new BukuAdapter(BukuData.getListData(), getActivity());
        BukuAdapter.setBukuModels(listBuku);
        rvBuku.setAdapter(BukuAdapter);
    }
}