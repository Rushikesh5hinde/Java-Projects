package com.enumdemo;
enum Season{SUMMER,WINTER,MONSOON};
public class EnumDemo2 {
	public static void main(String[] args) {
		Season s=Season.SUMMER;
		
		switch(s) {
		case SUMMER: System.out.println("cotton clothes");
		break;
		case WINTER:System.out.println("Woolen clothes");
		break;
		case MONSOON:System.out.println("Raincoat");
		break;
		default:System.out.println("error");
		}
	}
}
