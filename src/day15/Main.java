package day15;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Print print = new Print();
		
		// 문제 1)
		print.gugudan(3);

		// 문제 2)
		List<Long> list1 = new ArrayList<>();
		for (long a=1L; a<11L; a++) {
			list1.add(a);
		}
		System.out.println(print.sum(list1));
		
		// 문제 3)
		List<Double> list2 = new ArrayList<>();
		for (double b=1.0d; b<11.0d; b++) {
			list2.add(b);
		}
		System.out.println("합 => " + print.sumAvg(list2).get("합"));
		System.out.println("평균 => " + print.sumAvg(list2).get("평균"));
	}

}
