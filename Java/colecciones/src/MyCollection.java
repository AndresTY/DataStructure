import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection {
	ArrayList<Integer> oneCollection;

	public MyCollection(){
		this.oneCollection = new ArrayList<Integer>();
	}

	public void insertToEnd(int valor){
		oneCollection.add(valor);
	}

	public void insertToStart(int valor){
		oneCollection.add(0,valor);
	}

	public void addToEnd(ArrayList<Integer> list){
		oneCollection.addAll(list);
	}

	public void showCollection(){
		System.out.println(oneCollection);
	}

	public void printList(){
		for(Integer datos : oneCollection){
			System.out.println(datos);
		}
	}

	public void showList(){
	        Iterator<Integer> iterator = oneCollection.iterator();
       		while(iterator.hasNext()){
	 		System.out.println(iterator.next());
		}
	}

	public void deleter(int position){
		oneCollection.remove(position);
	}

	public void setValor(int position, int valor){
		oneCollection.add(position,valor);
	}

	public int getValor(int position){
		return oneCollection.get(position);
	}

	public int getAdd(){
		int add =0;
		for (int i=0;i<oneCollection.size();i++){
			add += oneCollection.get(i);
		}
		return add;
	}

	public int countElement(){
		return oneCollection.size();
	}

	public void countreplays(int number){
		int aux = 0;
		for(int i=0;i<oneCollection.size();i++){
			if(oneCollection.get(i) == number){
				aux++;
			}
		}
	}

	public void changeValor(int old, int now){
		for(int i=0;i<oneCollection.size();i++){
			if(oneCollection.get(i)==old)
				oneCollection.set(i,now);
		}
	}

	public void changeAll(List<Integer> a){
		oneCollection.clear();
		oneCollection.addAll(a);
	}

	public ArrayList<Integer> invertir(){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i = (oneCollection.size()-1); i>=0;i--){
			list1.add(oneCollection.get(i));
		}
		return list1;
	}

	public int getMayor(){
		int mayor = oneCollection.get(0);
		for(int i=0;i<oneCollection.size();i++){
			if(oneCollection.get(i)>mayor){
				mayor = oneCollection.get(i);
			}
		}
		return mayor;
	}

	public boolean search(int number){
		boolean find = false;
		for(int i=0; i<oneCollection.size();i++){
			if(oneCollection.get(i) == number){
				find =true;
			}
		}
		return find;
	}
}

