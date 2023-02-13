package day11;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClient2 {

	private final String URL = "http://1.234.5.158:23000/json/exam2.json";
	private String data = null;
	
	public RestClient2() {
		try {
			//1.클라이언트 객체 생성
			OkHttpClient client = new OkHttpClient();
			
			
			//2.요청 정보 객체 만들기
			Request request = new Request.Builder().url(URL).get().build();
			
			
			//3.1과 2를 이용한 요청 후에 결과 받기
			Response response = client.newCall(request).execute();
			
			if(response.isSuccessful() == true) {
				//실제로 받은 정보를 문자변수에 저장하기
				this.data = response.body().string().toString();
				System.out.println(this.data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//[{"ret":"y1","data":"123"},{"ret":"y2","data":"234"}]
	public void parseData() {
		//JSONArray == ArrayList
		JSONArray jary = new JSONArray(this.data);
		//2개있음 반복문 ㄱ
		for(int i=0; i<jary.length(); i++) { //2번반복
			JSONObject jobj = jary.getJSONObject(i);
			String tmp1 = jobj.getString("ret");
			int tmp2 = jobj.getInt("data");
			
			//콘솔에 확인하기
			System.out.println(tmp1);
			System.out.println(tmp2);
			System.out.println("-----------------------");
			
		}
	}
	

}
