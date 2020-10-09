package com.example.footprintproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.footprintproject.model.RegisterClient;

public interface RegisterClientRepository extends JpaRepository<RegisterClient, Long> {

}
