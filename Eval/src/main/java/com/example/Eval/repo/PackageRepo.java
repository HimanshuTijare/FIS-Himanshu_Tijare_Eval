package com.example.Eval.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Eval.model.Pack;

public interface PackageRepo extends JpaRepository<Pack,Integer>{
	
	

}
