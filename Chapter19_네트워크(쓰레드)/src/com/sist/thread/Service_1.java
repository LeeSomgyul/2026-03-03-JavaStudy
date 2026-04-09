package com.sist.thread;

import java.util.concurrent.*;

public class Service_1 {

	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ex.submit(() -> System.out.println("실행1"));
		ex.submit(() -> System.out.println("실행2"));
		ex.submit(() -> System.out.println("실행3"));
		ex.shutdown();
	}

}
