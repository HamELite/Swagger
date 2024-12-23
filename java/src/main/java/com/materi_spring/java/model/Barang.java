package com.materi_spring.java.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Barang ")
public class Barang {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public String getDeskripsiBarang() {
        return deskripsiBarang;
    }

    public void setDeskripsiBarang(String deskripsiBarang) {
        this.deskripsiBarang = deskripsiBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public Float getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(Float hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nama_barang", nullable = false)
    private String namaBarang;

    @Column(name = "stok_barang", nullable = false)
    private int stokBarang;

    @Column(name = "deskripsi_barang")
    private String deskripsiBarang;

    @Column(name = "jenis_barang")
    private String jenisBarang;

    @Column(name = "tanggal_kadaluarsa")
    @Temporal(TemporalType.DATE)
    private Date tanggalKadaluarsa;

    @Column(name = "harga_barang", nullable = false)
    private Float hargaBarang;
}

