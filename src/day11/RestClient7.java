package day11;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mongodb.client.FindIterable;

import day8.Book;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClient7 {

	private final String URL = "http://1.234.5.158:23000/json/exam7.json";
	private String data = null;

	public RestClient7() {

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
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); // 데이터의 성공유무
		String ret1 = new String("y");// 실제 데이터

		System.out.println(ret);
		System.out.println(ret1);

		JSONArray jary = jobj.getJSONArray("data");
		if (ret.equals(ret1)) {
			for (int i = 0; i < jary.length(); i++) {
				JSONObject jobj1 = jary.getJSONObject(i);

				// 콘솔에 확인하기
				System.out.println(jobj1.getString("id"));
				System.out.println(jobj1.getString("name"));
				System.out.println(jobj1.getInt("age"));
				System.out.println(jobj1.getFloat("height"));
				System.out.println(jobj1.getFloat("weight"));
				System.out.println("-----------------------");
			}
//		if(ret == ret1) {
//			System.out.println("문자비교안됨 문자비교는 eq써야함");
//			
//		}

		}

	}

	public List<Member1> parseData1() {
		// 리턴할 빈 객체 생ㅓㅅㅇ
		List<Member1> list = new ArrayList<Member1>();
		
		System.out.println(this.data);
		JSONObject jobj = new JSONObject(this.data);
		String ret = jobj.getString("ret"); // y
		JSONArray jary = jobj.getJSONArray("data"); // [{0},{1},{2},{3},{4}]

		if (ret.equals("y")) {
			for (int i = 0; i < jary.length(); i++) {
				// JSONObject => Member1 로 복사
				// jobj1 => m1로 복사

				JSONObject jobj1 = jary.getJSONObject(i);
				
				Member1 m1 = new Member1();
				m1.setId(jobj1.getString("id"));
				m1.setName(jobj1.getString("name"));
				m1.setAge(jobj1.getInt("age"));
				m1.setHeight(jobj1.getFloat("height"));
				m1.setHeight(jobj1.getFloat("weight"));

				list.add(m1);

				
			}
		}
		return list;
	}
}