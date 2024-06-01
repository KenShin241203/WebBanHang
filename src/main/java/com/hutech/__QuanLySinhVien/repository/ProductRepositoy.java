package com.hutech.__QuanLySinhVien.repository;

import com.hutech.__QuanLySinhVien.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoy extends JpaRepository<Product, Long> {
}
