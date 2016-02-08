package com.shopp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsernameAndPassword(String username, String password);

	List<User> findByUsername(String string);
	User findById(Long id);
}
