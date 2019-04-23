package com.locus.bank;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
@Autowired
private BankRepository bankRepository;



@GetMapping("/branch/{ifsc}")
public BankBranches findBranchDetailsByIfsc(@PathVariable String ifsc) {
	Optional<BankBranches> branch =  bankRepository.findById(ifsc);
	return branch.get();
}

@RequestMapping(path="/branch/{bank_name}/{city}", method = RequestMethod.GET)
public List<BankBranches> findBranchDetailsByNameAndCity(@PathVariable String bank_name, @PathVariable String city) {
	return bankRepository.findByBankNameAndCity(bank_name, city);
}


}
