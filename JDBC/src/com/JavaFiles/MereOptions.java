package com.JavaFiles;

import java.util.Scanner;

public class MereOptions {

	public static void main(String[] args) {
		
		
		System.out.println("Please select below Option \n "
				+ "1: execute selection query \n "
				+ "2: execute insertion query \n "
				+ "3: execute deletion query \n ");
		Scanner scanner= new Scanner(System.in);
		int choose=scanner.nextInt();
		switch(choose)
		{
		case 1: new Fetch().fetchData();
		break;
		
		case 2: new Insertion().insertData();
		break;
		
		case 3: new deletion().deleteData();
		}
	}
}


