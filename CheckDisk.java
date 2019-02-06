import java.util.Scanner;

public class CheckDisk {
	int temperatura;
	int cacheDisk;
	String disk;
	
	CheckDisk() {
		this.temperatura= temperatura;
		this.cacheDisk= cacheDisk;
		this.disk= disk;
		
	}
	
	public int Checking(int temperatura, int cacheDisk) throws InterruptedException {
		
		
		
		System.out.println("Sprawdzanie dysku");
		if (disk.equals("wd")) {
			System.out.println("Twój Western Digital posiada 16MB cache");
			temperatura= 34;
			cacheDisk=16;
			System.out.print("Sprawdzanie dysku "+ disk+ " . Proszę czekać.");
			Thread.sleep(3000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			
			System.out.print(".");
			
		}
		
		if (disk.equals("maxtor")) {
			temperatura= 37;
			System.out.println("Twój Maxtor posiada 8MB cache");
			cacheDisk=8;
			System.out.print("Sprawdzanie dysku "+ disk+ " . Proszę czekać.");
			Thread.sleep(3000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			
			System.out.print(".");
		}
		
		if (disk.equals("hitachi")) temperatura= 36;
		
		if (disk.equals("samsung")) temperatura= 35;
		
		if (disk.equals("seagate")) temperatura= 38;
		
		
		return temperatura;
		
	}
	
	
}
