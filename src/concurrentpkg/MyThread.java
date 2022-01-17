package concurrentpkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread{
	
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public void run() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println(Thread.currentThread().getName()+"  updating list");
		l.add("delhi");
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		l.add("manai");
		l.add("pune");
		l.add("kerela");
		
		MyThread t= new MyThread();
		t.start();
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			
			String next = (String) itr.next();
			System.out.println(Thread.currentThread().getName()+" adding element in list");
			Thread.sleep(2000);
		}
		
		System.out.println(l);

	}

}
