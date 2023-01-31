package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

// 5명의 학생의 국어 점수를 보관하고 처리할 클래스
public class KorScore {
	private String[] student = new String[5];
	private int[] score = new int[5];
	
	// getter, setter, toString 메소드가 존재함
	
	// (1) 전체 합계 구하는 메소드
	public int sumScore() {
		int i=0;
		int sum=0;
		
		for (i=0; i<this.score.length; i++) {
			sum += this.score[i];
		}
					
		return sum;
	}
	
	// (2) 평균 구하는 메소드
	public float avgScore() {
		float avg=0.0f;
		int sum = this.sumScore();
		
		avg = (float)sum / (float)this.score.length;
		
		return avg;
	}
	
	// (3) 최고 점수 구하는 메소드
	public int maxScore() {
		int max=this.score[0];
		int i=0;
		
		for (i=0; i<this.score.length; i++) {
			if (this.score[i] > max) {
				max = this.score[i];
			}
		}
		
		return max;
	}
	
	// (4) 최저 점수 구하는 메소드
	public int minScore() {
		int min=this.score[0];
		int i=0;
		
		for (i=0; i<this.score.length; i++) {
			if (this.score[i] < min) {
				min = this.score[i];
			}
		}
		
		return min;
	}
	
	// (5) 90점 이상인 사람 수 구하는 메소드
	public int score90() {
		int cnt=0;
		int i=0;
		
		for (i=0; i<this.score.length; i++) {
			if (this.score[i] >= 90) {
				cnt += 1;
			}
		}
		
		return cnt;
	}
}
