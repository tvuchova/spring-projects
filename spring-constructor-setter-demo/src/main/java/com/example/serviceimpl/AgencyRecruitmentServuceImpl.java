package com.example.serviceimpl;

import java.util.Random;

import com.example.service.RecruitmentService;

public class AgencyRecruitmentServuceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " +
					random.nextInt(numberOfRecruitments) + " employees " +
					"using various hiring agencies.";
		return hiringFacts;
	}

}
