package com.example.serviceimpl;

import java.util.Random;

import com.example.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl  implements RecruitmentService{

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitment) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired  " +
						random.nextInt(numberOfRecruitment) + " employees " +
						" which were referred to the company by employees.";
		return hiringFacts;
	}

}
