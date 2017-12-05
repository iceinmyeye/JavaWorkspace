import java.util.*;

public class ListPractice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List numList = new LinkedList();
		for (int i=1;i<101;++i){
			numList.add(i);
		}
		numList.remove(10);
		for (int j=0;j<numList.size();++j){
			System.out.println(numList.get(j));
		}
		
		//在Set和List集合中添加字母
		List lettList = new ArrayList();
		Set lettSet = new HashSet();
		
		lettList.add("A");
		lettList.add("a");
		lettList.add("c");
		lettList.add("C");
		lettList.add("a");
		
		lettSet.add("A");
		lettSet.add("a");
		lettSet.add("c");
		lettSet.add("C");
		lettSet.add("a");
		
		//遍历List中的元素
		for (int i=0;i<lettList.size();++i){
			System.out.println(lettList.get(i));
		}
		
		//遍历Set中的元素
		Iterator it = lettSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Map empMap = new HashMap();
		empMap.put(1, "LiMing");
		empMap.put(2, "DongXiaojing");
		empMap.put(3, "dangaimei");
		empMap.put(4, "Fengpengying");
		empMap.put(5, "Luanyewei");
		if(empMap.containsKey(5)){
			empMap.remove(5);
		}
		Set empSet = empMap.keySet();
		Iterator it_key = empSet.iterator();
		Collection coll = empMap.values();
		Iterator it_value = coll.iterator();
		while(it_key.hasNext()){
			System.out.println(it_key.next());
		}
		while(it_value.hasNext()){
			System.out.println(it_value.next());
		}
	}
}
