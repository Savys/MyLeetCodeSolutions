package com.savitha.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.savitha.leetcode.MergeIntervalLeetC.IntervalComparator;

/*
 * LeetCode 252
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), 
 * determine if a person could attend all meetings.

Example 1:

Input: [[0,30],[5,10],[15,20]]
Output: false
Explanation : If there is overlap , he will not be able to attend.
To check if there is overlap last.end> current.end as in 30,5
 */
public class MeetingRoomsLeetC {

	public static void main(String[] args) {

		Interval i1 = new Interval(0, 30);
		Interval i2 = new Interval(5, 10);
		Interval i3 = new Interval(15, 20);
		MeetingRoomsLeetC mr = new MeetingRoomsLeetC();
		Interval[] intervalList= {i1,i2,i3};
		
		
		
	
		//Interval[] intervalarray=new Interva
		mr.canAttendMeetings(intervalList);
		//mr.canAttendMeetings(Arrays.asList(i1, i2, i3));

	}
	
	private boolean canAttendMeetings(Interval[] interval) {
		if (interval == null || interval.length <= 1) {
			return false;
		}

		Arrays.sort(interval, new IntervalCompare());
		
		Interval last = interval[0];
		for (int i = 0; i < interval.length; i++) {
			Interval curr = interval[i];
			if (curr.start < last.end) {
				return false;
			} else {
				
				return true;
			}

		}
		
	}

	private class IntervalCompare implements Comparator<Interval> {

		@Override
		public int compare(Interval a, Interval b) {
			// TODO Auto-generated method stub
			return a.start = b.start;
		}
	}
}
