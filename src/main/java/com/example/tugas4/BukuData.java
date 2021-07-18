package com.example.tugas4;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.fragment.R;

import java.util.ArrayList;

public class BukuData {
    private static String[] title = new String[]{"Bumi","Bulan","Matahari","Bintang","Komet","Ceros & Batozar","Komet Minor"," Selena"," Nebula"};
    private static int[] img = new int[]{R.drawable.bumi, R.drawable.bulan, R.drawable.matahari, R.drawable.bintang, R.drawable.komet, R.drawable.ceroz, R.drawable.minor, R.drawable.selena, R.drawable.nebula};
    private static String[] longtxt = new String[]{"Bumi adalah sebuah novel karya Tere Liye, novel ini juga adalah bagian pertama dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2014","Bulan adalah sebuah novel karya Tere Liye, novel ini adalah bagian kedua dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2015.","Matahari adalah sebuah novel karya Tere Liye, novel ini adalah bagian ketiga dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2016.","Bintang adalah sebuah novel karya Tere Liye, novel ini adalah bagian keempat dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2017. ","Komet adalah seri keenam dalam serial novel Bumi karya Tere Liye. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2018","Ceroz dan Batozar adalah seri kelima dalam serial novel Bumi karya Tere Liye. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2018, bersamaan dengan terbitnya novel ke 5 dalam serial sama yang berjudul Komet.","Komet Minor adalah sebuah novel karya Tere Liye, novel ini adalah bagian ketujuh dari seri Bumi(serial Dunia Paralel). Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2019","Selena adalah sebuah novel karya Tere Liye, novel ini adalah bagian kedelapan dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2020.", "Nebula adalah sebuah novel karya Tere Liye, novel ini adalah bagian kedelapan dari seri Bumi(serial Dunia Paralel). Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2020"};

    public static ArrayList<BukuModel> getListData(){
        BukuModel bukuModel = null;
        ArrayList<BukuModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            bukuModel = new BukuModel();
            bukuModel.setFotoMember(img[i]);
            bukuModel.setNamaMember(title[i]);
            bukuModel.setTeksMember(longtxt[i]);
            list.add(bukuModel);
        }
        return list;
    }
}
