package com.locus.bank;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankBranches,String> {
	List<BankBranches> findByBankNameAndCity(@Param("bank_name") String bank_name, @Param("city") String city);
}


