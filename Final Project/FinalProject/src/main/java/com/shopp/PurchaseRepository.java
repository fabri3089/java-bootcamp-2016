package com.shopp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



@Transactional
public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
List<Purchase> findByPurchasenumber(int purchasenumber);
	
	List<Purchase> findByUserAndProductAndPurchasenumber( Long user, Long product, int purchasenumber );

}
