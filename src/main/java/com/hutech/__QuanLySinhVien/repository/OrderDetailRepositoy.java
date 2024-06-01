package com.hutech.__QuanLySinhVien.repository;

import com.hutech.__QuanLySinhVien.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepositoy extends JpaRepository<OrderDetail, Long> {
}
