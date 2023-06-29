package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//필요한 매개변수를 넣는 생성자
@RequiredArgsConstructor
@Getter
public class HelloLombok {
	// lombok의 @Required생성자를 사용시 생성자에 입력할 필드변수는 final을 적용
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로",5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
