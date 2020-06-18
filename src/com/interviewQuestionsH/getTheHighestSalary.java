package com.interviewQuestionsH;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class getTheHighestSalary {

	public static void main(String[] args) {
		
		Map<String, Double> map=new LinkedHashMap<>();
		
		map.put("Rafia", 1200000.0);
		map.put("hafiz", 1500000.0);
		map.put("Elvira", 3000000.0);
		map.put("Vital", 300000.0);
		
		double maxSalary=0;
//		System.out.println(map);
//	double maxSalary=Collections.max(map.values());
		Collection<Double> salaries= map.values();
	
		for( double salary:salaries) {
			if(salary>maxSalary) {
				maxSalary = salary;
				
			}
			
		}System.out.println(maxSalary);
	
//	Set<Entry<String, Double>> entry=map.entrySet();
//	
//	for(Entry<String, Double> salary:entry) {
//		if(salary.getValue()==maxSalary) {
//			System.out.println(maxSalary);
//		}
		
	
	
		
		
		
		
		
	}
}
