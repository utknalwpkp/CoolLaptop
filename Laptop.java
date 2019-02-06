import java.util.ArrayList;


public class Laptop {
	 int temperatura;
	 int ram;
	
	
	Laptop() {
		
	//	this.temperatura=temperatura;
	//	this.ram=ram;
		
	}

public int getTempI3(int temperatura) {
		
		//ArrayList<String> procesor = new ArrayList<>();
		String procesor;
		System.out.println();
		System.out.println("Posiadasz i3");
		procesor ="i3";
		if (procesor == "i3") temperatura = 61;
				
		return temperatura;
	}
	
	public int getTempI5(int temperatura) {
		
		//ArrayList<String> procesor = new ArrayList<>();
		String procesor;
		System.out.println();
		System.out.println("Posiadasz i5");
		procesor ="i5";
		if (procesor == "i5") temperatura = 47;
				
		return temperatura;
	}
	
public int getTempI7(int temperatura) {
		
		//ArrayList<String> procesor = new ArrayList<>();
		String procesor;
		System.out.println();
		System.out.println("Posiadasz i7");
		procesor ="i7";
		if (procesor == "i7") temperatura = 46;
				
		return temperatura;
	}
	
public int getTempAMD(int temperatura) {
	
	//ArrayList<String> procesor = new ArrayList<>();
	String procesor;
	System.out.println();
	System.out.println("Posiadasz AMD");
	procesor ="AMD";
	if (procesor == "AMD") temperatura = 65;
			
	return temperatura;
}

	public int getRamOffice(int ram) {
		String office;
		System.out.println("Posiadasz laptopa z nieco niższą wydajnością taki office/internet ");
		office="low";
		if (office == "low") ram=4;
				
		return ram;
	}
	
	public int getRamBusiness(int ram) {
		String business;
		System.out.println("Posiadasz laptopa biznesowego ");
		business="business";
		if (business == "business") ram=8;
				
		return ram;
	}
	
	public int getRamMiddle(int ram) {
		String middle;
		System.out.println("Posiadasz laptopa HighEnd/Middle ");
		middle="middle";
		if (middle == "middle") ram=8;
				
		return ram;
	}
	
	public int getRamHighEnd(int ram) {
		String highEnd;
		System.out.println("Posiadasz laptopa HighEnd");
		highEnd="highEnd";
		if (highEnd == "highEnd") ram=16;
				
		return ram;
	}

	public int cpuCoolerI3(int temperatura) throws InterruptedException {
		String cpuCooler;
		System.out.print("schłodzenie i3 wykonano.");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		cpuCooler="i3";
		if (cpuCooler == "i3") temperatura=56;
		
		
		return temperatura;
	}
	
	public int cpuCoolerAMD(int temperatura) throws InterruptedException{
		String procesor;
		System.out.print("skoro posiadasz AMD to trzeba je schłodzić.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		procesor="amd";
		if (procesor=="amd") temperatura = 60;
		
		return temperatura;
	}
	
}
