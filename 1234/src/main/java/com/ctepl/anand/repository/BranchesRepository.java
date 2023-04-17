·       Ability to access the sub screens like create, edit, view and download function.·       Ability to download the branches as format of .csv file.·       Proper validation of the fields like name, number, address etc.

package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.model.Branches;

@Repository
public interface BranchesRepository extends JpaRepository<Branches, Long> {
	
	Branches findByWholesalerAndName(String wholesaler, String name);
	
	Branches findByNumberAndWholesaler(String number, String wholesaler);
	
	Branches findByNameAndWholesaler(String name, String wholesaler);
	
	void deleteByNameAndWholesaler(String name, String wholesaler);
	
	void deleteByNumberAndWholesaler(String number, String wholesaler);
	
	boolean existsByNameAndWholesaler(String name, String wholesaler);
	
	boolean existsByNumberAndWholesaler(String number, String wholesaler);
	
	Branches findByName(String name);
	
	Branches findByNumber(String number);

}