package day15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 메인에서 실행시키며 결과를 출력하는 클래스
public class Print {
	// n이 오면 n단을 출력하는 메소드
	// ex) int n = 3
	// 3*1 = 3
	// ~
	// 3*9 = 27
	public void gugudan(int n) {
		for (int i=1; i<10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
	
	// n개의 정수형이 오면 합을 구해서 반환하는 메소드
	public long sum(List<Long> list) {
		long hap = 0L;
		
		for (Long n : list) {
			hap += n;
		}
		
		return hap;
	}
	
	// n개의 실수형이 전달되면 합과 평균을 구해서 반환하는 메소드
	public Map<String, Object> sumAvg(List<Double> list){
		double hap = 0.0d;
		double avg = 0.0d;
		
		for (Double n : list) {
			hap += n;
		}
		avg = hap / (double)list.size();
		
		Map<String, Object> result = new HashMap<>();
		result.put("합", hap);
		result.put("평균", avg);
		
		return result;
	}
}
