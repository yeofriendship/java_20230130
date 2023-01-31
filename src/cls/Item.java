package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// 클래스
public class Item {
	private long no = 0L; // 물품번호
	private String name = null; // 물품명
	private String content = null; // 물품내용
	private int price = 0; // 가격
	private long quantity = 0L; // 수량
	private Date date = null; // 등록일자
	
	// 메소드(함수) : 특정한 기능 구현
	// (1) 20% 할인한 금액으로 자동계산하는 메소드
	public void disCountPrice(float per) {
		// 현재 가격에서 per만큼 할인
		this.price = (int)(this.price - this.price*per);
	}
	
	// (2) 재고수량이 100개 미만이면 1000개로 변경시키는 메소드
	public void checkQuantity(int num) {
		if (this.quantity < num) {
			this.quantity = 1000;
		}
	}
}
