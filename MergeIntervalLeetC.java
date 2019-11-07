package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalLeetC {

	public static void main(String[] args) {
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(2, 6);
		Interval i3 = new Interval(8, 10);
		Interval i4 = new Interval(15, 18);

		MergeIntervalLeetC mi = new MergeIntervalLeetC();
		List<Interval> result = mi.merge(Arrays.asList(i1, i2, i3, i4));
		System.out.println("result:  "+result);

	}
private List<Interval> merge(List<Interval> intervals) {
	 if(intervals ==null || intervals.size() <=1)
	 {
		 return intervals;
	 }
	 Collections.sort(intervals,new IntervalComparator());
	 List<Interval> result=new ArrayList<Interval>();
	 Interval last=intervals.get(0);
	 for(int i=1;i<intervals.size();i++)
	 {
		 Interval curr=intervals.get(i);
		 if(curr.start<=last.end)
		 {
			 last.end=Math.max(last.end, curr.end);
			 
		 }
		 else
		 {
			 result.add(last);
			 last=curr;
		 }
	 }
	 result.add(last);
		return result;
	}
private class IntervalComparator implements Comparator<Interval>
{
	@Override
	public int compare(Interval a, Interval b) {
		return a.start-b.start;
	}
}

	

}
