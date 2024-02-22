package com.stackdemo;
class MyStack{
	
	int size;
	int top;
	int[] stk;
	
	public MyStack() {
		this(10);
	}
	
	public MyStack(int size) {
		this.size=size;
		top=-1;
		stk=new int[this.size];
	}
	boolean push(int data) {
		if(top<size-1) {
			top++;
			stk[top]=data;
			return true;
		}else
			return false;
	}
	void pop() {
		if(top!=-1) {
			System.out.println("Element deleted:"+stk[top]);
			top--;
		}
		else
			System.out.println("Stack is empty");
	}
	
	void display() {
		if(top!=-1) {
			System.out.println();
			System.out.print("[");
			for(int i=0;i<=top;i++) {
				System.out.print(stk[i]+",");
			}
			System.out.println("]");
			System.out.println();
		}
		else
			System.out.println("Stack is empty");
	}
}
public class StackAsArray {
	public static void main(String[] args) {
		MyStack s1=new MyStack(3);
		s1.display();
		System.out.println(s1.push(10));
		System.out.println(s1.push(20));
		System.out.println(s1.push(30));
		
		s1.display();
		System.out.println(s1.push(40));
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
	}
}
