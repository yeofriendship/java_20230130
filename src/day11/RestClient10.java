package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class RestClient10 {
	private final String URL = "http://1.234.5.158:23000/json/exam10.json";
	private String data = null;

	public RestClient10() {
		try {
			// 1.클라이언트 객체 생성
			OkHttpClient client = new OkHttpClient();

			// 2.요청 정보 객체 만들기
			Request request = new Request.Builder().url(URL).get().build();

			// 3.1과 2를 이용한 요청 후에 결과 받기
			Response response = client.newCall(request).execute();

			if (response.isSuccessful() == true) {
				// 실제로 받은 정보를 문자변수에 저장하기
				this.data = response.body().string().toString();
				System.out.println(this.data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void parseData() {
		// {"ret":"y","data":[{},{},{},{],{}] }
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret");

		// data 부분만 가져오기 => [{0},{1},{2},{3},{4}]
		JSONArray jary = jobj.getJSONArray("data");
		for (int i = 0; i < jary.length(); i++) {
			// data[i] 번째 => { "id": "id1","name": "가나다1", "age": 31, "score": {} }
			JSONObject jobj1 = jary.getJSONObject(i);// 1개 꺼내기
			String id = jobj1.getString("id");
			String name = jobj1.getString("name");
			int age = jobj1.getInt("age");

			// score가져오기 =>{"math":50,"eng":90,"kor":69}
			JSONObject score = jobj1.getJSONObject(ret);
			int math = score.getInt("math");
			int eng = score.getInt("eng");
			int kor = score.getInt("kor");

			System.out.println(id + "," + name + "," + age + "," + math + "," + eng + "," + kor);
		}
	}

	public List<Score1> parseData1() {
		// 반환 객체 만들기
		List<Score1> list = new ArrayList<Score1>();

		System.out.println(this.data);
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); // y
		JSONArray jary = jobj.getJSONArray("data"); // [{0},{1},{2},{3},{4}]

		
			// 실제 저장된 객체에서 Score1객체로 1개씩 복사
			for (int i = 0; i < jary.length(); i++) {
				Score1 s1 = new Score1();
				JSONObject jobj1 = jary.getJSONObject(i);

				s1.setId(jobj1.getString("id"));
				s1.setName(jobj1.getString("name"));
				s1.setAge(jobj1.getInt("age"));

				JSONObject score = jobj1.getJSONObject("score");
				s1.setMath(score.getInt("math"));
				s1.setEng(score.getInt("eng"));
				s1.setKor(score.getInt("kor"));

				// 반환할 객체에 Score1객체 추가
				list.add(s1);
			}
		
		// 반환하기
		return list;
	}

	// 국어점수 합계구하기
	public int sumKor() {
		int sum = 0 ; //합계 구할 변수 초기화
		List<Score1> list = this.parseData1();
		for(Score1 s1 : list) {
			int n = s1.getKor();
			sum+=n;
		}
		return sum;
	}
	
	//영어점수 최대값 구하기
	public int maxEng() {
		int max = 0;         //초기값을 범위값보다 작은 것으로(0~100)
		int min = 101;      //초기값을 범위값보다 큰 것으로(0~100)
		List<Score1> list = this.parseData1();
		for(Score1 s1 : list) {
			//System.out.println(s1.toString());
			int n = s1.getEng();
			if(max < n) {
				max = n;
			}
			if(min> n) {
				min = n;
			}
		}
		return max;
	}
	
	//국어, 영어, 수학 합계구하기
	public int[] sumKorMathEng() {
		
		//ret[0] => 국어 합계 ret[1]=> 영어 합계 ret[2]=> 수학 합계 
		int[] ret = new int[3];

		List<Score1> list = this.parseData1();
		for(Score1 s1 : list) {
			ret[0] = ret[0] + s1.getKor(); //ret[0]+=s1.getKor();
			ret[1] = ret[1] + s1.getEng(); //ret[0]+=s1.getEng();
			ret[2] = ret[2] + s1.getMath();//ret[0]+=s1.getMath();
			
			
		}
		return ret;
		//return sum1, sum2, sum3 ; 불가능
	}
	
	//학생별 총점 구하기
	//map에는 학생아이디, 총점정보를 포함하기
	public List<Map<String,Object>> sumStudent(){
		//점수를 가지고있음 5개
		List<Score1> list = this.parseData1();
		//Map은 클래스와 같음
		List<Map<String,Object>> retList = new ArrayList<>();
		
		for(Score1 s1 : list) {
			//1.반환타입에 포함하는 Map만들기
			Map<String, Object> map = new HashMap<>();
			map.put("id", s1.getId());
			map.put("name", s1.getName());
			map.put("total", s1.getKor()+s1.getEng()+s1.getMath());
			map.put("avg", (s1.getKor()+s1.getEng()+s1.getMath())/3.0f);
			
			//3,list에 추가한다
			retList.add(map);
			
		}
		//4.반환한다
		return retList;
	}
}
