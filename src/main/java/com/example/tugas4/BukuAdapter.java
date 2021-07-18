package com.example.tugas4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fragment.R;

import java.util.ArrayList;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BukuModel> bukuModels;

    private static String[] title = new String[]{"Bumi","Bulan","Matahari","Bintang","Komet","Ceros & Batozar","Komet Minor"," Selena"," Nebula"};

    public BukuAdapter(ArrayList<BukuModel> listData, Context context) {
        this.context = context;
    }

    public ArrayList<BukuModel> getBukuModels() {
        return bukuModels;
    }

    public void setBukuModels(ArrayList<BukuModel> bukuModels) {
        this.bukuModels = bukuModels;
    }

    @NonNull
    @Override
    public BukuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull BukuAdapter.ViewHolder holder, int position) {

        Glide.with(context).load(getBukuModels().get(position).getFotoMember()).into(holder.fotoMember);
        holder.namaMember.setText(getBukuModels().get(position).getNamaMember());

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String namaMember = "My Favorite book is " + getBukuModels().get(position).getNamaMember();
                intent.putExtra(Intent.EXTRA_TEXT, namaMember);
                context.startActivity(Intent.createChooser(intent, "Share Using"));
            }
        });
        holder.lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, lihat_prev.class);
                intent.putExtra("img_url", getBukuModels().get(position).getFotoMember());
                intent.putExtra("title", getBukuModels().get(position).getNamaMember());
                intent.putExtra("detail", getBukuModels().get(position).getTeksMember());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getBukuModels().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView fotoMember;
        private TextView namaMember;
        private Button lihat, share;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoMember = itemView.findViewById(R.id.cetak_foto);
            namaMember = itemView.findViewById(R.id.cetak_nama);
            lihat = itemView.findViewById(R.id.btn_lihat);
            share = itemView.findViewById(R.id.btn_share);

        }
    }
}



