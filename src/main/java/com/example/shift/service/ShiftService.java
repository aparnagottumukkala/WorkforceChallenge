package com.example.shift.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shift.model.Shift;
import com.example.shift.model.ShiftGroup;
import com.example.shift.repository.ShiftRepository;

@Service
public class ShiftService {
	
	@Autowired
	private ShiftRepository shiftRepository;
	
	public void saveShift(Shift shift) {
		shiftRepository.save(shift);
	}
	
	public Shift findShift(String shiftCode){
		System.out.println(shiftCode);
		
		return shiftRepository.findByCode(shiftCode);
		
		
	}

	public Optional<Shift> getByID(int id) {
		// TODO Auto-generated method stub
		return shiftRepository.findById(id);
	}

}
