package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bank.modeldto.Beneficiaryinfo;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiaryinfo,String> {

}
