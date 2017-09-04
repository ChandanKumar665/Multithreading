class MyThread extends Thread{
	
	public void run(){
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread priority is: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		System.out.println("new priority is: "+Thread.currentThread().getPriority());
		for (int i=0;i<3;i++){
			System.out.println("child thread");
		}
	}	
}
class MyThreadDemo {
	public static void main(String[]args) throws InterruptedException {
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		MyThread t=new MyThread();
		Thread.currentThread().setName("Github thread");
		System.out.println("priority is: "+Thread.currentThread().getPriority());
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		t.start();
		t.join();
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
	}
}