package com.materi_spring.java.controller;

import com.materi_spring.java.exception.CommonResponse;
import com.materi_spring.java.exception.ResponseHelper;
import com.materi_spring.java.model.Barang;
import com.materi_spring.java.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/barang")
@CrossOrigin(origins = "*")
public class BarangController {
    @Autowired
 BarangService barangService;

@PostMapping
public CommonResponse<Barang> add(@RequestBody Barang barang) {
    return ResponseHelper.ok(barangService.add(barang));

}
@GetMapping("{/id}")
    public CommonResponse<Barang>get(@PathVariable("id") Long id){
    return ResponseHelper.ok(barangService.get(id));
}
    @GetMapping
    public CommonResponse<List<Barang>>getAll(){return ResponseHelper.ok(barangService.getAll());}

@PutMapping("/id")
public CommonResponse<Barang> edit(@RequestBody Barang barang , @PathVariable("id") Long id){
    return ResponseHelper.ok(barangService.edit(id , barang));
}
@DeleteMapping("/id")
public CommonResponse<?> delete(@PathVariable("id")Long id){
    return ResponseHelper.ok(barangService.delete(id));
}
}
