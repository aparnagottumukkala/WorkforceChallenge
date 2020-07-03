package com.example.shift.service.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shift.model.Shift;
import com.example.shift.model.ShiftGroup;
import com.example.shift.service.ShiftService;

@RestController
public class ShiftController {
	
	@Autowired
	private ShiftService shiftService;
	
	@RequestMapping("/shift/{shiftCode}")
	public boolean doesShiftBelongToGroup(@PathVariable (name="shiftCode") String shiftCode, @RequestParam (required = false) String shiftGroupCode) {
		
		System.out.println("Shift Code is "+shiftCode);

		System.out.println("Shift Group Code is "+shiftGroupCode);
		
		Shift s= shiftService.findShift(shiftCode);
		
			System.out.println(s);
		for (ShiftGroup sg : s.getShiftGroups()) {
			
			if(sg.getCode().equals(shiftGroupCode)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	@RequestMapping("/shifts/{id}")
	public String findById(@PathVariable (name="code") int id) {
		
		Shift s =shiftService.getByID(id).get();
		System.out.println("Shift by id: "+s.getCode());
		System.out.println("Shift by id: "+s.getId());
		for (ShiftGroup sg: s.getShiftGroups()) {
			System.out.println("Shift by id: "+sg.getId());
			System.out.println("Shift by id: "+sg.getCode());
		}
		System.out.println("Shift by id: "+s.getShiftGroups());
		return "Hello";
		
	}


}
