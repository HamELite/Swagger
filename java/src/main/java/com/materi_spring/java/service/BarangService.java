package com.materi_spring.java.service;


import com.materi_spring.java.Repository.BarangRepository;
import com.materi_spring.java.exception.NotFoundException;
import com.materi_spring.java.model.Barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BarangService {
    @Autowired
    BarangRepository barangRepository;

    public Barang add(Barang barang) {
        return barangRepository.save(barang);
    }


    public Barang get(Long id) {
        return barangRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found"));
    }

    public List<Barang> getAll() {
        return barangRepository.findAll();
    }

    public Barang edit(Long id, Barang user) {
        Barang update = barangRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found"));
        update.setNamaBarang(user.getNamaBarang());
        update.setStokBarang(user.getStokBarang());
        update.setDeskripsiBarang(user.getDeskripsiBarang());
        update.setJenisBarang(user.getJenisBarang());
        update.setTanggalKadaluarsa(user.getTanggalKadaluarsa());
        update.setHargaBarang(user.getHargaBarang());
        return barangRepository.save(update);
    }
    public Map<String, Boolean> delete(Long id) {
        try {
            barangRepository.deleteById(id);
            Map<String, Boolean> res = new HashMap<>();
            res.put("Deleted", Boolean.TRUE);
            return res;
        } catch (Exception e) {
            return null;
        }
    }
}