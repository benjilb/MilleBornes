
package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class Utils {
	private static Random random = new Random();

	public Utils() {
	}
	
	public static <T> T extraire(List<T> liste) {
		int k = liste.size();
		int nb = random.nextInt(k);
		T elem = liste.get(nb);
		liste.remove(nb);
		return elem;
	}

	public static <T> List<T> melanger(List<T> liste) {
		List<T> listeretour = new LinkedList<T>();
		while(!liste.isEmpty()) {
        	listeretour.add(extraire(liste));
        }
        return listeretour;
    }

	public static <T> boolean verifierMelange(List<T> lst1, List<T> lst2) {
		if (lst1.size() != lst2.size())
			return false;
		for (T element : lst1) {
			int nb_elem1 = Collections.frequency(lst1, element);
			int nb_elem2 = Collections.frequency(lst2, element);

			if (nb_elem1 != nb_elem2) {
				return false;
			}
		}
		return true;
	}

	public static <T> List<T> rassembler(List<T> liste) {
		List<T> newArray = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			T elem = liste.get(i);
			if (!newArray.contains(elem)) {
			
				int num = Collections.frequency(liste, elem);
				//System.out.println("num frequency = " + num);
				for (int j = 0; j < num; j++) {
					newArray.add(elem);
				}
			} 
		}
		return newArray;
	}
	
	public static <T> boolean searchElem(List<T> liste, T cur, int indice) {
		for(ListIterator<T> it = liste.listIterator(indice); it.hasNext();) {
			T e = it.next();
			if(e.equals(cur)) {
				return true;
			}
		}
		return false;
	}

	public static <T> boolean verifierRassemblement(List<T> liste) {
		T precedent = liste.get(0);
		T current;
		
		for(Iterator<T> it = liste.iterator() ; it.hasNext();) {
			current = it.next();
			if(!current.equals(precedent) && (searchElem(liste, precedent, liste.indexOf(current)))) {
				return false;
			}
			precedent = current;
		}
		return true;
	}

	public static void main(String args[]) {
		Utils test = new Utils();
		List<Integer> tab = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			tab.add(i);
		}
		for (int i = 10; i > 0; i--) {
			tab.add(i);
		}
		System.out.println(tab);
		List<Integer> tab2 = new ArrayList<>();
		tab2 = Utils.rassembler(tab);
		System.out.println(tab2);

		List<Integer> lst = new ArrayList<>();
		for (int k = 0; k < 10; k++) {
			if (k % 2 == 0)
				lst.add(1);
			else
				lst.add(2);

		}
		System.out.println(lst);
		lst.clear();
		lst.add(2);
		lst.add(2);
		lst.add(2);
		lst.add(2);
		System.out.println(lst);

		System.out.println(test.verifierRassemblement(lst));
		System.out.println(melanger(lst));
	}

}
