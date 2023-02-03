package day5;

public class CalcMain {

	public static void main(String[] args) {
		// 객체 생성 => 메모리(자원) 많이 사용
		Calc calc = new Calc();
		
		int result1 = calc.sumPlus(3, 4);
		System.out.println(result1);

		float result2 = calc.sumDiv(10, 0);
		System.out.println(result2);
		
		// int result3 = calc.sumMinus(10, 5);
		// System.out.println(result3);		
		// => 에러남  
		// => 행라인 x표시 눌린 다음
		//    "Surround with try/catch" 를 누르면 알아서 예외처리됨.
		int result3;
		try {
			result3 = calc.sumMinus(10, 5);
			System.out.println(result3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// static 메소드로 만들었기 때문에 경고(노란줄) 뜸
		int result4 = calc.sumMul(3, 4);
		System.out.println(result4);
		// 프로그램이 실행될때 static메소드가 있는 클래스는 자동적으로 1개의 객체를 생성함
		// 객체를 생성할 필요없이 클래스명.메소드명()을 사용해주면 됨
		int result5 = Calc.sumMul(3, 4);
		System.out.println(result5);
	}

}
