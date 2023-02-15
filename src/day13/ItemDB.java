package day13;

import java.util.List;
import java.util.Map;

public interface ItemDB {
	// 물품 전체 목록
	public List<Map<String, Object>> selectItemListMap(int n);
	public List<Item> selectItemList();
	
	// 물품 등록
	public int insertItemMap(Map<String, Object> map);
	
	// 물품 1개 삭제
	public int deleteItemOne(long no);
	
	// 물품 n개 삭제
	public int deleteItemMany(long[] no);
	
	// 물품 수정 (name, content, price, quantity)
	public int updateItemOne(Item item);
}
