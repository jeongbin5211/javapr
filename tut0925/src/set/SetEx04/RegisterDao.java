package set.SetEx04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RegisterDao {
	Set<Register> set = null;
	
	public RegisterDao() {
		set = new HashSet<Register>();
	}
	
	public void addRegister(Register r) {
		set.add(r);
	}
	
//	public void removeRegister(int id) {
//		
//		Iterator<Register> ir = set.iterator();
//		while(ir.hasNext()) {
//			int tmp = ir.next().getId();
//			if(tmp == id) {
//				ir.remove();
//			}
//		}	
//	}
	
	// 2. List index 번호로 구분 : get(i)
	// Set 값(객체)로 구분 
	// Map key 구분
	
//	public boolean removeRegister(int id) {
//		
//		for (Register r : set) {
//			if (id == r.getId()) {
//				set.remove(r);
//				return true;
//			}
//		}
//		
//		return false;
//	}
	
	public boolean removeRegister(int id) {
		
		Iterator<Register> ir = set.iterator();
		while(ir.hasNext()) {
			Register reg = ir.next();
			int tmp = reg.getId();
			
			if (tmp == id) {
				set.remove(reg);
				return true;
			}
		}
		
		return false;
	}
	
	public void showInfo() {
		for(Register reg : set) {
			reg.disp();
		}
	}
	
}
