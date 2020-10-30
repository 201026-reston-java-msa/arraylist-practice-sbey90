package com.revature.list;

import java.util.ArrayList;

public class MyArrayList {

	public void add(int val) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(12);
		values.add(5);
		values.add(9);
		values.add(10);
		
	}

	public void set(int index, int val) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(12);
		list.add(5);
		list.add(9);
		list.add(10);
		
		list.set(2, 22);
		

		
		
		
	}

	public void remove(int index) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(8);
		arr1.add(10);
		arr1.add(12);
		arr1.add(14);
		arr1.add(16);
		arr1.remove(4);

		
	}

	public int get(int index) {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(47);
		arr2.add(56);
		arr2.add(23);
		arr2.add(36);
		arr2.add(11);
//		return arr2.get(5);
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
