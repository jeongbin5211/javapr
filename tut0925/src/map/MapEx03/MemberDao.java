package map.MapEx03;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	Map<String, Member> map = null;
	
	public MemberDao() {
		map = new HashMap<String, Member>();
	}
	
	public void putMember(String k, Member m) {
		map.put(k, m);
	}
	
	public boolean deleteMember(String key) {
		if (map.containsKey(key)) {
			map.remove(key);
			return true;
		}
		return false;
	}
	
	public void showInfo() {
		
//		배열명.forEach((k, v) -> {
//			출력코드 = 배열명.get(키값);
//		})
		
		map.forEach((k, v) -> {
			map.get(k);
			Member m = map.get(k);
			m.disp();
		});
	}
}
