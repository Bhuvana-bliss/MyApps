package com.studentinfo.controller;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.studentinfo.constant.RestMappingConstant;
import com.studentinfo.dto.Discount;
import com.studentinfo.model.studentinfo;
import com.studentinfo.repos.StudentRepo;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping(RestMappingConstant.BASE_URL)
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	@Value("${feesconcession.url}")
	private String feesconcessionURL;
	
	@Autowired
	private RestTemplate restTemplate;
//	 private final RestTemplate restTemplate;
	
	
	
	 @RequestMapping(value = "/addstudent", method = RequestMethod.POST)
		public studentinfo addUser(@RequestBody studentinfo studentdet) {
		
			 Discount student = new Discount(); 
			 student = restTemplate.getForObject(feesconcessionURL + studentdet.getConCode(),Discount.class);
		    int amt = (studentdet.getFeesAmount().intValue())*(student.getConPercentage().intValue())/100;
		    int totalamount = (studentdet.getFeesAmount().intValue())-amt;
		    BigDecimal disamount = BigDecimal.valueOf(totalamount);
		    studentdet.setDiscountAmount(disamount);
			return repo.save(studentdet);
//			studentinfo addinfo = new studentinfo();
//			addinfo.setName(userdet.getName());
//			addinfo.setRegisterNo(userdet.getRegisterNo());
//			addinfo.setMail(userdet.getMail());
//			addinfo.setFeesAmount(userdet.getFees());
//			try {
//			repo.save(addinfo);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		//	return "created";

		}
	
}
