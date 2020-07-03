package com.example.shift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shift.model.ShiftGroup;

@Repository
public interface ShiftGroupRepository extends JpaRepository<ShiftGroup, Integer>{

}
