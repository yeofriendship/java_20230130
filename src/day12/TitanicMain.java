package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day11.Titanic;

public class TitanicMain {

	public static void main(String[] args) {
		TitanicDB titanic = new TitanicDBImpl();
		
		// selectTitanicList()
//		List<Titanic> result1 = titanic.selectTitanicList();
//		for (Titanic t : result1) {
//			System.out.println("생존 여부 : " + t.getSurvived());
//			System.out.println("티켓 등급 : " + t.getPclass());
//			System.out.println("성별 : " + t.getSex());
//			System.out.println("나이 : " + t.getAge());
//			System.out.println("탑승한 형제/자매 수 : " + t.getSibsp());
//			System.out.println("탑승한 부모/자녀 수 : " + t.getParch());
//			System.out.println("티켓 번호 : " + t.getTicket());
//			System.out.println("티켓 요금 : " + t.getFare());
//			System.out.println("객실 번호 : " + t.getCabin());
//			System.out.println("탑승한 항구 : " + t.getEmbarked());
//			System.out.println("이름 : " + t.getName());
//			System.out.println("아이디 : " + t.getPassengerId());			
//			System.out.println("---------------------------------------------");
//		}
		
		// selectTitanicListMap()
//		List<Map<String, Object>> result2 = titanic.selectTitanicListMap();
//		for (Map<String, Object> map : result2) {
//			System.out.println("생존 여부 : " + map.get("survived"));
//			System.out.println("티켓 등급 : " + map.get("pclass"));
//			System.out.println("성별 : " + map.get("sex"));
//			System.out.println("나이 : " + map.get("age"));
//			System.out.println("탑승한 형제/자매 수 : " + map.get("sibsp"));
//			System.out.println("탑승한 부모/자녀 수 : " + map.get("parch"));
//			System.out.println("티켓 번호 : " + map.get("ticket"));
//			System.out.println("티켓 요금 : " + map.get("fare"));
//			System.out.println("객실 번호 : " + map.get("cabin"));
//			System.out.println("탑승한 항구 : " + map.get("embarked"));
//			System.out.println("이름 : " + map.get("name"));
//			System.out.println("아이디 : " + map.get("passengerid"));			
//			System.out.println("---------------------------------------------");
//		}
		
		// selectTitanicAge(int n)
//		List<Titanic> list = titanic.selectTitanicAge(5);
//		for (Titanic t : list) {
//			System.out.println("생존 여부 : " + t.getSurvived());
//			System.out.println("티켓 등급 : " + t.getPclass());
//			System.out.println("성별 : " + t.getSex());
//			System.out.println("나이 : " + t.getAge());
//			System.out.println("탑승한 형제/자매 수 : " + t.getSibsp());
//			System.out.println("탑승한 부모/자녀 수 : " + t.getParch());
//			System.out.println("티켓 번호 : " + t.getTicket());
//			System.out.println("티켓 요금 : " + t.getFare());
//			System.out.println("객실 번호 : " + t.getCabin());
//			System.out.println("탑승한 항구 : " + t.getEmbarked());
//			System.out.println("이름 : " + t.getName());
//			System.out.println("아이디 : " + t.getPassengerId());			
//			System.out.println("---------------------------------------------");
//		}
		
		
		
		// Print 클래스 사용해서 출력
		Print print = new Print();
		List<Titanic> list = titanic.selectTitanicList();
//		print.printListAll(list);
//		print.printListAll1(list);
//		print.printListAll2(list);
		
//		print.printSurvived(list);
		
//		print.printAge(list);
		
//		int[] result = print.printPClass(list);
//		for(int i = 0; i<result.length; i++) {
//			System.out.println("pclass " + (i+1) + " 개수 => " + result[i]);
//		}
		
//		print.printFare(list);
		
//		print.printName(list);
		
//		print.printAgeSurvived(list);
		
//		print.printSexSurvived(list);
		
//		print.printPClassSurvived(list);
	}

}
