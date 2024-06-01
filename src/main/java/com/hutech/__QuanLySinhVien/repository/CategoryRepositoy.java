package com.hutech.__QuanLySinhVien.repository;

import com.hutech.__QuanLySinhVien.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoy extends JpaRepository<Category, Long> {
}
