package com.huntercodexs.h2demo.repository;

import com.huntercodexs.h2demo.model.SalesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<SalesModel, Long> {
}
