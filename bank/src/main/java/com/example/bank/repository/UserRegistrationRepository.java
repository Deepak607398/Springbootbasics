package com.example.bank.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.bank.modeldto.UserInfo;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserInfo, String> {

	@Transactional
	@Modifying
	@Query(value = "INSERT into bk_credentials (username,password,account_no,cus_Id,opening_amount) VALUES (:username,:password,:account_no,:cus_id,:opening_amount)", nativeQuery = true)
	void updateCredentials(@Param("username") String username, @Param("password") String password,
			@Param("account_no") String account_no, @Param("cus_id") String cus_id, @Param("opening_amount") Double opening_amount);

	
	
}
