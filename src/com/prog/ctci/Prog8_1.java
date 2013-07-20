package com.prog.ctci;

/**
 * Write a method to generate the nth Fibonacci number.
 * http://en.wikipedia.org/wiki/Fibonacci_number
 * 
 * @author ptemkar
 * @date 07/20/13
 */
public class Prog8_1 {
	public int fibonacci(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		int fibo = fibonacci(n-1)+fibonacci(n-2);
		return fibo;
	}
}
