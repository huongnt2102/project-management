package com.hg.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.hg.pma.entities.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long>{
	
}
