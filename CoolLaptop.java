//package Dyskowe;
//import java.time.Instant;
import java.util.Scanner;
import Dyskowe.Disk;


public class CoolLaptop extends Laptop { //implements CheckDisk  {

	//static Scanner skan = new Scanner(System.in);
	
	public CoolLaptop()	{
		super();
	}
	
	public static void main(String[] args) throws InterruptedException {
		String procesor,dysk;
		int temp,ram,cache;
		temp=0;cache=0;//bez nadania wartości początkowej w Javie pewnie nic się nie uda.
		Laptop laptok = new Laptop();
		Disk check = new Disk();
		Scanner skan = new Scanner(System.in);
		
		//System.out.println("Czy to też działa?"+ check.Checking(temp, cache));
		
		System.out.println("Podaj jaki masz procesor w laptopie (i3/i5/i7/amd) i ile GB pamięci RAM posiada Twój laptop");
		procesor=skan.nextLine();
		ram=skan.nextInt();
		//Instant t1= Instant.now();
			long t3= System.currentTimeMillis();
		//short t3= System.currentTimeMillis(); Type mismatch: cannot convert from long to short
		if (procesor.equals("i3") && ram ==4) {
			//System.out.println("If działa?");
			//temp=61;
			System.out.println("temp: "+laptok.getTempI3(temp)+" st C " + laptok.getRamOffice(ram)+ " GB");
			System.out.print("Schładzamy procesor.");
			//System.currentTimeMillis();
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("temp: "+laptok.cpuCoolerI3(temp)+" st C ");
			Thread.sleep(3000);
		}
		//Instant t2= Instant.now();
			long t4= System.currentTimeMillis();
			long duration = t4-t3;
		//short t4= System.currentTimeMillis();
		//short duration= t4-t3;
		//System.out.println(laptok.getTempI3(temp,ram)+" C " + ram);
		System.out.print(" if trwał "+duration+ " ms || ");
		
		if (procesor.equals("i5") && ram ==4) 
			System.out.println("temp: "+laptok.getTempI5(temp)+" st C " + laptok.getRamBusiness(ram)+ " GB");
		
			//long t5= System.currentTimeMillis();
		//duration = t5-t3;
		t4= System.currentTimeMillis();
		duration = t4-t3;
		System.out.print(" ify trwają(łącznie 2) "+duration+ " ms || ");
		
		if (procesor.equals("i7") && ram ==4) 
			System.out.println("temp: "+laptok.getTempI7(temp)+" st C " + laptok.getRamBusiness(ram)+ " GB");
			
			//long t6= System.currentTimeMillis()	;
		//duration = t6-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają(łącznie 3) "+duration+ " ms || ");
		
		if (procesor.equals("i3") && ram ==8) {
			System.out.println("temp: "+laptok.getTempI3(temp)+" st C " + laptok.getRamBusiness(ram)+" GB");
			System.out.print("Schładzamy procesor.");
			//System.currentTimeMillis();
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("temp: "+laptok.cpuCoolerI3(temp)+" st C ");
			Thread.sleep(3000);
		}
		//long t7= System.currentTimeMillis();
		//duration = t7-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 4) "+ duration+ " ms || ");
		
		if (procesor.equals("i5") && ram ==8)
			System.out.println("temp: "+laptok.getTempI5(temp)+" st C " + laptok.getRamMiddle(ram)+ " GB");
		
		//long t8= System.currentTimeMillis();
		//duration = t8-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 5) "+ duration+ " ms || ");
		
		if (procesor.equals("i7") && ram ==8)
			System.out.println("temp: "+laptok.getTempI7(temp)+" st C " + laptok.getRamMiddle(ram)+" GB");
		
		//long t9= System.currentTimeMillis();
		//duration = t9-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.println(" ify trwają (łącznie 6) "+ duration+ " ms || ");
		
		if (procesor.equals("i3") && ram==16) {
			System.out.println("temp: "+laptok.getTempI3(temp)+" st C " + laptok.getRamBusiness(ram)+" GB");
			System.out.print("Schładzamy procesor.");
			//System.currentTimeMillis();
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("temp: "+laptok.cpuCoolerI3(temp)+" st C ");
			Thread.sleep(3000);
		}
		//long t10= System.currentTimeMillis();
		//duration = t10-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 7) "+ duration+ " ms || ");
		
		if (procesor.equals("i5") && ram==16)
			System.out.println("temp: "+laptok.getTempI5(temp)+" st C " + laptok.getRamHighEnd(ram)+" GB");
		
		//long t11= System.currentTimeMillis();
		//duration = t11-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 8) "+ duration+ " ms || ");
		
		if (procesor.equals("i7") && ram==16)
			System.out.println("temp: "+laptok.getTempI7(temp)+" st C " + laptok.getRamHighEnd(ram)+" GB");
		
		//long t12= System.currentTimeMillis();
		//duration = t12-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 9) "+ duration+ " ms || ");
		
		if (procesor.equals("amd") && ram==4) {
			System.out.println("temp: "+laptok.getTempAMD(temp)+" St C (kontroluj temperaturę) " + laptok.getRamOffice(ram)+" GB");
			System.out.print("Schładzamy procesor.");
			//System.currentTimeMillis();
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("temp: "+laptok.cpuCoolerAMD(temp)+" st C ");
			Thread.sleep(3000);
			
		}
		//long t13= System.currentTimeMillis();
		//duration = t13-t3;
		t4= System.currentTimeMillis();
		duration=t4-t3;
		System.out.println(" ify trwają (łącznie 10) "+ duration+ " ms || ");
		
		if (procesor.equals("amd") && ram==8) {
			System.out.println("temp: "+laptok.getTempAMD(temp)+" St C (kontroluj temperaturę) " + laptok.getRamMiddle(ram)+" GB");
			System.out.print("Schładzamy procesor.");
			//System.currentTimeMillis();
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("temp: "+laptok.cpuCoolerAMD(temp)+" st C ");
			Thread.sleep(3000);
		}
		//long t14= System.currentTimeMillis();
		//duration = t14-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 11) "+ duration+ " ms || ");
		
		if (procesor.equals("amd") && ram==16) {
			System.out.println("temp: "+laptok.getTempAMD(temp)+" St C (kontroluj temperaturę) " + laptok.getRamHighEnd(ram)+" GB");
			System.out.print("Schładzamy procesor.");
			//System.currentTimeMillis();
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("temp: "+laptok.cpuCoolerAMD(temp)+" st C ");
			Thread.sleep(3000);
		}
		//long t15= System.currentTimeMillis();
		//duration = t15-t3;
		t4= System.currentTimeMillis();
		duration= t4-t3;
		System.out.print(" ify trwają (łącznie 12) "+ duration+ " ms || ");
		System.out.println();
		//klasa Disk rozszerzona o CheckDisk
				
		System.out.println(check.Checking(temp, cache));
		
		t4=System.currentTimeMillis();
		duration= t4-t3;
		System.out.println("Czas potrzebny na operację z klasy Disk rozszerzonej o Checkdisk zajęła: "+duration+ " ms ");
		
/*		String a= "ABC"; repeat ma wyglądać tak:String a= "ABC".repeat(int ile razy np 5);
		String repeat= a.replaceFirst(a, procesor);
		System.out.println(a+" "+repeat);
		String repeated = StringUtils.repeat(a, 3);*/// repeat w java 11 powinien działać
		skan.close();
		//System.gc();
	
		
	}	
}


