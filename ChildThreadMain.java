package com.github.chandan665.multithreading
class ChildThread extends Thread { 
static Thread mt;
public void run() {
	try {
		mt.join();
	}
	catch(InterruptedException e) {
		System.out.println(e.getMessage());
	}
	for(int i=0;i<=3;i++) {
	System.out.println("child Thread");
	}
}
}
class ChildThreadMain {
	public static void main(String[]args) {
		ChildThread.mt=Thread.currentThread();
		ChildThread t1=new ChildThread();
		t1.start();
		for(int i=0;i<=3;i++) {
			System.out.println("Main thread");
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
