package com.student.fees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.fees.model.feesconcession;
import com.student.fees.repos.FeesConcessionRepo;

@RestController
@RequestMapping("/feesconcessionapi")
public class FeesConcessionRestController {

	@Autowired
	FeesConcessionRepo repo;

	@RequestMapping(value = "/feesconcession", method = RequestMethod.POST)
	public feesconcession create(@RequestBody feesconcession feesdet) {
		return repo.save(feesdet);

	}

	@RequestMapping(value = "/feesconcession/{code}", method = RequestMethod.GET)
	public feesconcession getfeesconsecession(@PathVariable("code") String code) {
		return repo.findByconCode(code);

	}
}
