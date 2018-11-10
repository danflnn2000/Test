package concurrency;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppThread thread1 = new AppThread();
		AppThread thread2 = new AppThread();
		AppThread thread3 = new AppThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
