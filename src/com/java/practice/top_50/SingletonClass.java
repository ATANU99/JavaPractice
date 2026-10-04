package com.java.practice.top_50;

public class SingletonClass {
	
	
	 // volatile ensures changes are visible across threads and prevents instruction reordering
		
		private static  volatile SingletonClass instance;
		
		private SingletonClass() {
		
		}
		
		public static synchronized SingletonClass getInstance() {
			if(instance==null) {// First check (no locking)

				
				synchronized (SingletonClass.class) {// Synchronize block
					if(instance==null) {// Second check (with locking)
						instance=new SingletonClass();
					}
				}
				
			}
			return instance;
			
		}
	

}
