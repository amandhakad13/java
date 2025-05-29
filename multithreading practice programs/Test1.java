class ThreadDemo1 extends Thread {
	public void run() {
		System.out.println("Thread 1 is Running");
	}
}

class ThreadDemo2 extends Thread {
	public void run() {
		System.out.println("Thread 2 is Running");
	}
}

class Test1 {
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();
		
		t1.start();
		t2.start();
	} 
}