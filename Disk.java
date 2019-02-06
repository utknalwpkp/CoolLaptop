//import java.util.Scanner;

public class Disk extends CheckDisk {//throws InterruptedException {
	
		public Disk() {
			super();
		}
		
		public static void main(String[] args) throws InterruptedException {
			int temp= 46;
			int cache=16;
			String dysk;
			CheckDisk check = new CheckDisk();
			
			
			
			System.out.println("Czy to też działa?"+ check.Checking(temp,cache));
			System.gc();
		}
		
	}