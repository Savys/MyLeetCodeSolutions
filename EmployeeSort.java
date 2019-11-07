package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
	List<Laps> laptop=new ArrayList<>();
	laptop.add(new Laps(1,600,"Dell"));
	laptop.add(new Laps(2,400,"HP"));
	laptop.add(new Laps(3,500,"Mac"));
	Comparator<Laps>com =new Comparator<Laps>()
	{
		public int compare(Laps l1,Laps l2)
		{
		  if(l1.getRam()>l2.getRam())
		  {
			  return 1;
		  }
		  else
			  return -1;
		}
	};
	Collections.sort(laptop,com);
	for(Laps l:laptop)
	{
		System.out.println(l);
	}
	
	}
	

}
