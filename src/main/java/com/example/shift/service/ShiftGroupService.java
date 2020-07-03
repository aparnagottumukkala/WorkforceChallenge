package com.example.shift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shift.model.ShiftGroup;
import com.example.shift.repository.ShiftGroupRepository;

@Service
public class ShiftGroupService {
	
	
	@Autowired
	private ShiftGroupRepository shiftGroupRepository;
	
	public void saveShiftGroup(ShiftGroup shiftGroup) {

		shiftGroupRepository.save(shiftGroup);
	}
	
	

}
