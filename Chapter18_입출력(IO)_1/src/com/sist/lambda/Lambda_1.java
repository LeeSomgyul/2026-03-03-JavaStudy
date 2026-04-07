package com.sist.lambda;

import java.util.*;

public class Lambda_1 {

	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//		numbers.stream()
//			.filter(n->n%2==0)
//			.forEach(n->System.out.println(n));

		Optional<String> name = Optional.ofNullable(null);
		System.out.println(name.orElse("이름 없음"));
		
		Optional<String> userName = Optional.of("홍길동");
		userName.ifPresent(n -> System.out.println("이름: " + n));
		
		Optional<String> opt = Optional.of("hello");
		Optional<Integer> len = opt.map(s -> s.length());
		System.out.println(len.get());
		
		
	}

}
