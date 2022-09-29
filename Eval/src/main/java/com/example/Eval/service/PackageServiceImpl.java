package com.example.Eval.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Eval.model.Pack;
import com.example.Eval.repo.PackageRepo;


@Service
public class PackageServiceImpl {
	
	public double package_cost;
	public double GST=0.12;
	public double discount; 
	
	@Autowired
	PackageRepo repo;

	
	
	
	
	public List<Pack> findall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Pack additem(Pack item) {
		// TODO Auto-generated method stub
		return repo.save(item);
	}

	public double Pack_cost(int package_id,int nob) {
		// TODO Auto-generated method stub
		if(nob<=5) {
			discount=0;
		}
		else if(nob>5 && nob<=8) {
			discount=3;
			
		}
		else if(nob>8 && nob<=10) {
			discount=5;
			
		}
		else if(nob>10) {
			discount=7;
			
		}
		Pack pack = get(package_id);
		double basic_fare = pack.getBasic_fare();
		discount=(basic_fare*nob)*(discount/100);
		package_cost = ((basic_fare*nob)-discount);
		double gs = package_cost*(0.12);
		package_cost = package_cost+gs;
		return package_cost;
	}


	public Pack get(int package_id) {
		// TODO Auto-generated method stub
		return repo.findById(package_id).get();
	}

}
