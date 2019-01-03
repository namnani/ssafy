package com.ssafy.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DigitTest1 {
//	public static void main(String[] args) {
//		int[] array = new int[100];
//		int[] countTenNum = new int[10]; //십의자리 숫자를 세준다.
//		
//		int array_size = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		for(; array_size!=100; array_size++){
//			int temp = sc.nextInt();
//			if(temp == 0)
//				break;
//			array[array_size] = temp;
//			
//			//십의자리 체크해서 집어넣
//			temp = array[array_size] / 10;
//			countTenNum[temp]++;
//		}
//		
//		for(int i = 0; i<10; i++){
//			System.out.println(i + " : " + countTenNum[i] + "개");
//		}
//	}
	public static List sortByValue(final Map map){
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2){
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				
				return ((Comparable) v1).compareTo(v2);
			}
		});
//		Collections.reverse(list);
		return list;
	}
	
	
	public static void main(String[] args) {
		int[] array = new int[100];
		int[] countTenNum = new int[10]; //십의자리 숫자를 세준다.
//		int[] ascOrderIndexNum = new int[10];
		
		int array_size = 0;
		Scanner sc = new Scanner(System.in);
		
		for(; array_size!=100; array_size++){
			int temp = sc.nextInt();
			if(temp == 0)
				break;
			array[array_size] = temp;
			
			//십의자리 체크해서 집어넣
			temp = array[array_size] / 10;
			countTenNum[temp]++;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//키, 밸류로 집어넣기.
		for(int i = 0;i<10; i++){
			map.put(i, countTenNum[i]);
		}
		
		//출력 부분
//		Iterator iterator = map.keySet().iterator();
//		while(iterator.hasNext()){
//			int temp = (int)iterator.next();
//			if(map.get(temp) != 0)
//			System.out.println(temp + " : " + map.get(temp) + "개");
//		}
		
		Iterator it = sortByValue(map).iterator();

//        System.out.println("------------sort 후 -------------");
        while(it.hasNext()) {
            int temp = (int) it.next();
            if(map.get(temp) != 0)
            System.out.println(temp + " : " + map.get(temp) +"개");
        }
	}
}
