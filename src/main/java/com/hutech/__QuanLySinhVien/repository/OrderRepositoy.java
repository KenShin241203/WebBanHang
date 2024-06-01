package com.hutech.__QuanLySinhVien.repository;

import com.hutech.__QuanLySinhVien.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositoy extends JpaRepository<Order, Long> {
}
