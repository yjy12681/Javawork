package day01;

public class Bye {
	
	public static void main(String[] args) {
		
		// main이라 쓰고 ctrl + space를 누르면 실행함수가 만들어집니다.
		/*
		 * ctrl + s 저장
		 * ctrl + f11 실행
		 * sysout이라 쓰고 ctrl+ space를 누르면 출력문이 만들어집니다.
		 * tap 들여쓰기    // shift tap 내어쓰기
		 * 
		 * 코드이동: alt + 방향키
		 * 코드복사: ctrl + alt + 방향키
		 * 되돌리기: ctrl + z
		 * 전체선택: ctrl + a  // 전체선택 + 정렬: ctrl + a, ctrl + i
		 * 한줄삭제: ctrl + d
		 */
		System.out.println("출력문 자동완성");
		System.out.println(1);
		System.out.println("1");
		System.out.println("안녕하세요");
		
		//자바의 출력문의 종류 - 3가지 제공
		//개행문자 \n 이 없는 출력문 print
		System.out.print("hi");
		System.out.print("hi");
		System.out.print("hi\n");
		
		//개행문자를 마지막에 포함해주는 println 출력문
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		
		//형식 지정 출력문 printf
		//내가 출력하고 싶은 문자열에 구멍을 뚫어넣고 사용하는 방식
		/*
		 * %d - 정수를 대입할 수 있음
		 * %f - 실수를 대입할 수 있음
		 * %s - 문자열을 대입할 수 있음
		 *  
		 *  \t - 8칸 공백을 잡고 정렬
		 */
		
		System.out.printf("제 이름은 %s 입니다\n", "홍길동");
		System.out.printf("원주율은 %.2f\n", 3.14); //소수점 갯수 정하는방법 %.xf
		System.out.printf("오늘은 %d일 입니다\n", 7);
		
		
		//제 생일은 xxxx년 xx월 xx일 입니다 - 출력하기
		
		System.out.printf("\t제 생일은 %d년 %d월 %d일 입니다\n", 1997, 10, 8);
		
		
		
		

	}

}
