﻿package Quiz07;

public class Car {

	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}

	//1. model을 전달받아서 model에 저장하는 생성자를 생성하세요

	void accel(int speed) {
		/*
		멤버변수 speed가 150 이상이라면 "속도를 올릴 수 없습니다" 를 출력
		그렇지 않으면 매개변수를 멤버변수에 저장하세요
		 */
		if(speed>=150) {
			System.out.println("속도를 올릴 수 없습니다");
		}else if(speed<150){
			this.speed = speed;
		}

	}

	void run() {
		/*	
		0-200 까지 30씩 증가하는 for문을 생성하고, 
		for문안에서 accel()를 호출하세요
		멤버변수 speed도 출력하세요
		 */
		for(int i =0; i<=200; i+=30) {
			this.accel(i);
			System.out.println("현재 속도:" + this.speed);
			
		}
	}
}














