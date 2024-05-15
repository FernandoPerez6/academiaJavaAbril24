package sim0514.predicate;

import java.util.*;

class Data {
	int value;

	public Data(int x) {
		value = x;
	}

	public String toString() {
		return "" + value;
	}
}

public class TestClass {
	public static void filterData(ArrayList<Data> dataList, 
			                        java.util.function.Predicate<Data> f) {
		Iterator<Data> i = dataList.iterator();
		while (i.hasNext()) {
			if (f.test(i.next())) {
				i.remove();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Version Lambda");
		ArrayList<Data> al = new ArrayList<Data>();
		Data d = new Data(1);
		al.add(d);
		d = new Data(2);
		al.add(d);
		d = new Data(0);
		al.add(d);
		d = new Data(3);
		al.add(d);
		d = new Data(0);
		al.add(d);
		filterData(al, dato -> dato.value == 0);
		System.out.println(al); //1,2,3
	}
}
