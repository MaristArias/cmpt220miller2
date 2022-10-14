package Module 05.homework;

import java.util.Scanner;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total seconds: ");
		long seconds = sc.nextLong();
		System.out.println("Thr hours, minutes and seconds for total seconsd " + seconds + " is " + calculateTime(seconds));
	}
	
	public static String calculateTime(long seconds) {
		int hours = (int) (seconds / 3600) ;
		hours = hours % 24 ;
		seconds = seconds % 3600 ;
		int mins = (int) (seconds / 60) ;
		int secs = (int) (seconds % 60) ;
		return String.format("%02d", hours) + ":" +  String.format("%02d", mins) + ":" +  String.format("%02d", secs);
	}

}
