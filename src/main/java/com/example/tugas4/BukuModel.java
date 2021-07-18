package com.example.tugas4;

import java.io.Serializable;

public class BukuModel implements Serializable {
    private String namaMember;
    private int fotoMember;
    private String teksMember;

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public int getFotoMember() {
        return fotoMember;
    }

    public void setFotoMember(int fotoMember) {
        this.fotoMember = fotoMember;
    }

    public String getTeksMember() {
        return teksMember;
    }

    public void setTeksMember(String teksMember) {
        this.teksMember = teksMember;
    }
}
