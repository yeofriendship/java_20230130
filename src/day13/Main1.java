package day13;

import java.text.DecimalFormat;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		ItemDB iDB = new ItemDBImpl();
		
//		long no[] = {1003, 1005, 1007, 1009, 1016};
//		int result = iDB.deleteItemMany(no);
//		System.out.println(result);

//		int result = iDB.deleteItemOne(1012L);
//		System.out.println(result);
		
//		Item item = new Item();
//		item.setNo(1015L);
//		item.setName("귤");
//		item.setContent("물품내용");
//		item.setPrice(600);
//		item.setQuantity(5);
//		int result = iDB.updateItemOne(item);
//		System.out.println(result);
		
		List<Item> list = iDB.selectItemList();
//		for (Item item : list) {
//			System.out.println("물품번호 => " + item.getNo());
//			System.out.println("물품명 => " + item.getName());
//			System.out.println("물품내용 => " + item.getContent());
//			System.out.println("가격 => " + item.getPrice());
//			System.out.println("수량 => " + item.getQuantity());
//			System.out.println("등록일자 => " + item.getDate());
//			System.out.println("--------------------------------------");
//		}
		
		// 문제 1) 가격대별 수량 구하기
		// 1~999, 1000~9999, 10000~99999
//		int[] priceCount = new int[4];
//		for (Item item : list) {
//			if (item.getPrice() < 1000) {
//				priceCount[0]++;
//			}
//			else if (item.getPrice() < 10000) {
//				priceCount[1]++;
//			}
//			else if (item.getPrice() < 100000) {
//				priceCount[2]++;
//			}
//			else {
//				priceCount[3]++;
//			}
//		}
//		
//		System.out.println("1~999 => " + priceCount[0] + "개");
//		System.out.println("1000~9999 => " + priceCount[1] + "개");
//		System.out.println("10000~99999 => " + priceCount[2] + "개");
//		System.out.println("100000원 이상 => " + priceCount[3] + "개");
		
		
		// 문제 2) 시간대별 재고수량 합계 (Date to String으로 변환)
		// 0시 ~ 23시
//		int[] sum1 = new int[24]; // 방법 1
//		int[] sum2 = new int[24]; // 방법 2
//		
//		for (Item item : list) {
//			// 방법 1
//			for (int i=0; i<sum1.length; i++) {
//				String str = item.getDate().toString().substring(11, 13);
//				
//				if (Integer.toString(i).equals(str)) {
//					sum1[i]++;
//				}
//			}
//			
//			// 방법 2
//			int a = Integer.parseInt(item.getDate().toString().substring(11, 13));
//			sum2[a]++;
//		}
//		
//		for (int j=0; j<sum1.length; j++) {
//			System.out.print(j + "시 => ");
//			System.out.println(sum1[j] + "개");
//		}

		
		// 문제 3) 재고수량이 1000이상인 것만 가져와서 
		// 		 3자리마다 콤마 추가 후 출력
		// ex) 물품번호, 이름, 가격, 재고수량
		//		1001, 가나다, 300, 12,345
//		System.out.println("물품번호 / 이름 / 가격 / 재고수량");
//		for (Item item : list) {
//			//  문자 변경 전 포멧
//			DecimalFormat df = new DecimalFormat("###,###");
//			String str = df.format(item.getQuantity());
//			
//			if (item.getQuantity() >= 1000) {
//				System.out.print(item.getNo() + " / ");
//				System.out.print(item.getName() + " / ");
//				System.out.print(item.getPrice() + " / ");
//				System.out.println(str);
//			}
//		}
	}

}
