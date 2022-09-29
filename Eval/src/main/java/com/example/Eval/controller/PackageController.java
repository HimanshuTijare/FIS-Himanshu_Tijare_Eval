package com.example.Eval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Eval.model.Pack;
import com.example.Eval.service.PackageServiceImpl;


@RestController
@RequestMapping("/items")
public class PackageController {

	@Autowired
	PackageServiceImpl service;
	
	@PostMapping("/add")
	public Pack additem(@RequestBody Pack item) {
		return service.additem(item);
	}
	
	@GetMapping("/all")
	public List<Pack> findall(){
		return service.findall();
	}
	
	@GetMapping("/packageCost/{package_id}/{nob}")
	public double findPackageCost(@PathVariable("package_id")int package_id,@PathVariable("nob") int nob) {
		return service.Pack_cost(package_id,nob);
	}
}
