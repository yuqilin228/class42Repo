package demo01;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Test {
	public static void main(String[] args) {
		/*Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();*/
		
		Thread t3 = new Thread(new Runnable1());
		t3.start();
		
		System.out.println("张三提交的代码...");
		System.out.println("张三第2次提交的代码...");
		System.out.println("李四也提交了代码...");
		System.out.println("张三又提交了代码...");
	}
}
