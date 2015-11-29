package com.kadoppe.stopwatchsample;

import org.apache.commons.lang3.time.StopWatch;

public class StopWatchSample {
	public StopWatch stopWatch1 = null;
	 StopWatch stopWatch2 = null;
	
	public static void main (String argv[]) {
		StopWatchSample s = new StopWatchSample();
		s.start();
	}
	
	public StopWatchSample () {
		stopWatch1 = new StopWatch();
		stopWatch2 = new StopWatch();
	}
	
	public void start() {
		for (int i = 0; i < 10; i++) {
			this.method1();
			this.method2();
		}
		
		System.out.println("Total time (method 1): " + this.stopWatch1.getTime());		
		System.out.println("Total time (method 2): " + this.stopWatch2.getTime());
	}
	
	private void method1() {
		if (stopWatch1.isStarted()) {
			stopWatch1.resume(); 
		} else {
			stopWatch1.start();
		}
		
		try {
			Thread.sleep(500);			
		} catch (Exception e) {
			;
		}
		
		stopWatch1.suspend();
	}
	
	private void method2() {
		if (stopWatch2.isStarted()) {
			stopWatch2.resume();
		} else {
			stopWatch2.start();
		}
			
		try {
			Thread.sleep(1000);			
		} catch (Exception e) {
			;
		}
		
		stopWatch2.suspend();
	}
}
