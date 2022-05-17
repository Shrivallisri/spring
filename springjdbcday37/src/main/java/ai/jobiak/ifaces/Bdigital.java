package ai.jobiak.ifaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bdigital {
	Printable printable;
	PackingIface packing;
	
	@PostConstruct
	public void doInit() {
		System.out.println("from init()....");
	}
	@PreDestroy
	public void doDestroy() {
		System.out.println("from destory()....");
	}
	
	public Bdigital(PackingIface packing) {
		this.packing = packing;
	}

	public Printable getPrintable() {
		return printable;
	}

	public void setPrintable(Printable printable) {
		this.printable = printable;
	}
	public void publish() {
		System.out.println("Initiated packing...");
	}
}                     

