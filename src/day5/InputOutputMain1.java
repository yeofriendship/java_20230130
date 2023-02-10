package day5;

import day10.Member;

// 메인은 테스트용, 입력(X) 출력(X), 특정 클래스
public class InputOutputMain1 {

	public static void main(String[] args) {
		// 콘솔에서 입력한 항목을 기반으로 Member 타입으로 반환
		Member member = Input.inputData();
		
		// Input이 잘 실행되는지 확인만 하고 
		// 출력은 Output에서 진행하기 때문에 주석 처리
		// System.out.println(member.toString());
		
		// Output 클래스(Static 이기 때문에 객체 생성 X)
		Output.printMember(member);
	}

}
