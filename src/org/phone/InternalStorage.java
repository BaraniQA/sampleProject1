package org.phone;

import java.util.ArrayList;
import java.util.List;

public class InternalStorage  {

public static void main(String[] args) {
	 ExternalStorage e = new ExternalStorage();
	 e.setEmpId(10);
	 e.setEmpName("Arun Surya");
	 e.setGender('M');
	 
	 
	 ExternalStorage e1 = new ExternalStorage();
	 e1.setEmpId(20);
	 e1.setEmpName("Mithran");
	 e1.setGender('M');
	 
	List<ExternalStorage> l= new ArrayList<>();
	 l.add(e);
	 l.add(e1);
	 System.out.println(l.get(1).getEmpName());
	 System.out.println(l.get(0).getGender());
	 
	
//	 Map<Integer, ExternalStorage>m= new HashMap<Integer, ExternalStorage>();
//	 m.put(1, e);
//	 m.put(2, e);
//	 
//	 Set<Entry<Integer, ExternalStorage>> entrySet = m.entrySet();
//	 for (Entry<Integer, ExternalStorage> a : entrySet) {
//		System.out.println(a.getKey());
//		System.out.println(a.getValue().getEmpName());
//		System.out.println(a.getValue().getGender());
	 
	 
	 System.out.println("This is writing for the step 2 push to see the conflict is coming or not");
	}
}

