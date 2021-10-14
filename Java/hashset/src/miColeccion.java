import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class miColeccion{

	private Set<Estudiante> cE;

	public miColeccion(){
		cE = new HashSet<Estudiante>();
	}

	public void anexarRegistro(Estudiante student){
		cE.add(student);
	}

	public void mostrarContenido(){
		System.out.println(cE);
	}

	public void print(){
		System.out.println(cE.size());

		for (Estudiante est : cE){
			System.out.println(est.getId()+" "+est.getLastname()+" "+est.getName());
		}
	}

	public void print2(){
		Iterator<Estudiante> iterator = cE.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	public boolean evalua(){
		if(cE.isEmpty()){
			return true;
		}
		return false;
	}

	public void delete(String id){
		Predicate<Estudiante> personPredicate = cE -> cE.getId() == id;
		cE.removeIf(personPredicate);
	}

	public void rm(){
		cE.clear();
	}

	public void search(String name){
		for(Estudiante est : cE){
			if(name.equals(est.getName())){
				System.out.println(est.getId()+" "+est.getLastname()+" "+est.getName());
				break;
			}
		}
	}

}


