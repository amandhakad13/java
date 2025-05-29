class ThreadTest2Demo1 extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread 1 = "+i);
			try {
				Thread.currentThread().sleep(500);
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}
	}
}

class ThreadTest2Demo2 extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread 2 = "+i);
		}
		try {
			Thread.currentThread().sleep(1000);
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		ThreadTest2Demo1 t1 = new ThreadTest2Demo1();
		ThreadTest2Demo2 t2 = new ThreadTest2Demo2();
		
		t1.start();
		t2.start();
	}
}