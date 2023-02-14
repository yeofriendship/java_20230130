package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day11.Titanic;

// 출력하는 곳
public class Print {
	// for문 사용
	public void printListAll(List<Titanic> list) {
		for (Titanic t : list) {
			System.out.println(t.toString());
		}
		
//		for (int i=0; i<list.size(); i++) {
//			Titanic t = list.get(i);
//			System.out.println(t.toString());
//		}
	}
	
	// while문 사용
	public void printListAll1(List<Titanic> list) {
		// List 타입을 반복자(Iterator)로 변환하기
		Iterator<Titanic> cursor = list.iterator();
		
		while (cursor.hasNext()) {
			Titanic t1 = cursor.next();
			System.out.println(t1.toString());
		}
		
//		int i=0;
//		while (i < list.size()) {
//			Titanic t1 = list.get(i);
//			System.out.println(t1.toString());
//			i++
//		}
	}
	
	// do~while문 사용
	public void printListAll2(List<Titanic> list) {
		int i=0;
		do {
			Titanic t3 = list.get(i);
			System.out.println(t3.toString());
			i++;
		}
		while(i < list.size());
	}
	
	// 전체 목록을 받아서 생존자의 인원수 구하기(for문 사용)
	public void printSurvived(List<Titanic> list) {
		int count = 0;
		
		for (Titanic t : list) {
			if (t.getSurvived().equalsIgnoreCase("yes")) {
				count++;
			}
		}
		
		System.out.println("생존자의 수 : " + count + "명");
	}
	
	// 전체 목록을 받아서 연령대별 인원수를 구하기 (단, 0은 제외, while문 사용)
	// 0.01 ~ 9 : 어린이
	// 	10 ~ 19 : 10대 => X명
	// 	20 ~ 29 : 20대
	// 	10 ~ 39 : 30대 ...
	public void printAge(List<Titanic> list) {
		int i = 0;
		
		int[] ageCount = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while (i < list.size()) {
			Titanic t = list.get(i);
			
			if (t.getAge() > 0) {
				// 0.01~9 => 0, 10~19 => 1, 20~29 => 2
				int n = t.getAge().intValue() / 10;
				ageCount[n]++;
			}
			i++;
		}
		
		for (int k=0; k<ageCount.length; k++) {
			System.out.println((k*10) + "대 => " + ageCount[k]);
		}
				
	}
	
	// 전체 목록에서 pclass 값의 종류별 개수를 구하시오 (종류는 1, 2, 3)
	public int[] printPClass(List<Titanic> list) {
		int[] result = new int[3];

		for (Titanic t : list) {
			int n = t.getPclass();
			result[n-1]++;
		}
		
		return result;
	}
	
	// 전체 목록에서 운임요금(fare)이 30보다 큰 것만 (fare와 name 출력) (단, fare는 소수점을 올림하여 정수로 표시)
	public void printFare(List<Titanic> list) {
		// Math.ceil() : 올림
		for(Titanic t : list) {
			if (t.getFare() > 30.0f) {
				System.out.println("이름 : " + t.getName());
				System.out.println("운임 요금 : " + Math.ceil(t.getFare()));
				System.out.println("------------------------------------");
			}
		}
	}
	
	// 전체 목록에서 이름(name)의 Mr. Miss. Mrs. 를 각각 포함하는 인원수 구하기
	public void printName(List<Titanic> list) {
		int count[] = new int[3];
		
		for (Titanic t : list) {
			if (t.getName().contains("Mr.")) {
				count[0]++;
			}
			else if (t.getName().contains("Miss.")) {
				count[1]++;
			}
			else {
				count[2]++;
			}
		}
		
		System.out.println("Mr. 의 인원수 : " + count[0]);
		System.out.println("Miss. 의 인원수 : " + count[1]);
		System.out.println("Mrs. 의 인원수 : " + count[2]);
	}
	
	// 연령대별 생존자수 구하기 (전체 인원 891명, 비율은 소수점으로 표시)
	public void printAgeSurvived(List<Titanic> list) {
		int[] ageCount = new int[9]; // 연령대별 인원수
		int[] survivedCount = new int[9]; // 연령대별 생존자수
		
		for (Titanic t : list) {
			// 연령대별 인원수
			if (t.getAge()>0) {
				int n = t.getAge().intValue()/10;
				ageCount[n]++;
				
				// 연령대별 생존자수
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					survivedCount[n]++;
				}
			}
		}
		
		for (int i=0; i<ageCount.length; i++) {
			System.out.println((i*10) + "대 생존자 수 => " + survivedCount[i]);
			System.out.println((i*10) + "대 생존자 비율 => " 
							+ (float)survivedCount[i]/(float)ageCount[i]*100 + "%");
			System.out.println("------------------------");			
		}
	}
	
	// 성별 생존자수 구하기 (전체 인원 891명, 비율은 소수점으로 표시)
	public void printSexSurvived(List<Titanic> list) {
		int[] sexCount = new int[2]; // 성별 인원수
		int[] survivedCount = new int[2]; // 성별 생존자수
		
		for (Titanic t : list) {
			if (t.getSex().equalsIgnoreCase("male")) {
				sexCount[0]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					survivedCount[0]++;
				}
			}
			else if (t.getSex().equalsIgnoreCase("female")) {
				sexCount[1]++;
				if (t.getSurvived().equalsIgnoreCase("yes")) {
					survivedCount[1]++;
				}
			}
		}
		
		System.out.println("남성 생존자 수 => " + survivedCount[0]);
		System.out.println("남성 생존자 비율 => " + (float)survivedCount[0]/(float)sexCount[0]*100 + "%");
		System.out.println("여성 생존자 수 => " + survivedCount[1]);
		System.out.println("남성 생존자 비율 => " + (float)survivedCount[1]/(float)sexCount[1]*100 + "%");
	}
	
	// 티켓 등급별 생존자수 구하기 (전체 인원 891명, 비율은 소수점으로 표시)
	public void printPClassSurvived(List<Titanic> list) {
		int[] pclassCount = new int[3]; // 티켓 등급별 인원수
		int[] survivedCount = new int[3]; // 티켓 등급별 생존자수
		
		for (Titanic t : list) {
			// 티켓 등급별 인원수
			int n = t.getPclass();
			pclassCount[n-1]++;
			
			// 티켓 등급별 생존자수
			if (t.getSurvived().equalsIgnoreCase("yes")) {
				int m = t.getPclass();
				survivedCount[m-1]++;
			}
		}

		for (int i=0; i<pclassCount.length; i++) {
			System.out.println("티켓 등급 " + (i+1) + "의 생존자 수 => " + survivedCount[i]);
			System.out.println("티켓 등급 " + (i+1) + "의 생존자 비율 => " 
							+ (float)survivedCount[i]/(float)pclassCount[i]*100 + "%");
			System.out.println("--------------------------------");
		}
	}
}
