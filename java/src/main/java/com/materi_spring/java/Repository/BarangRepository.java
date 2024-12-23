package com.materi_spring.java.Repository;

import com.materi_spring.java.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarangRepository extends JpaRepository<Barang , Long> {


}
