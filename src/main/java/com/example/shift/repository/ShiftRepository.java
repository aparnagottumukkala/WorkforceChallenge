package com.example.shift.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.shift.model.Shift;
import com.example.shift.model.ShiftGroup;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, Integer>{
	
	@Query("SELECT s FROM Shift AS s WHERE s.code= :shiftCode")
	Shift findByCode(String shiftCode);

}
