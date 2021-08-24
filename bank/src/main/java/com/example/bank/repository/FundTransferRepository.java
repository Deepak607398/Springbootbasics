package com.example.bank.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.bank.modeldto.FundTransfer;

@Repository
public interface FundTransferRepository extends JpaRepository<FundTransfer, String> {

	@Query(nativeQuery = true, value = "SELECT opening_amount FROM bk_credentials where cus_id=:cusid")
	public Double idData(String cusid);

	@Transactional
	@Modifying
	@Query(value = "INSERT into bk_tx_info (cus_Id,tx_id,tx_timestamp,amount,balance,beneficiary_id) VALUES (:cus_Id,:tx_id,:tx_timestamp,:amount,:balance,:beneficiary_id)", nativeQuery = true)
	void updateTransactionDetails(@Param("cus_Id") String cus_Id, @Param("tx_id") String tx_id,
			@Param("tx_timestamp") String tx_timestamp, @Param("amount") Double amount,
			@Param("balance") Double balance, @Param("beneficiary_id") String beneficiary_id);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE bk_credentials SET opening_amount=:bal where cus_id=:cusid", nativeQuery = true)
    void updateBalance(@Param("bal") Double bal,@Param("cusid") String cusid );
}
