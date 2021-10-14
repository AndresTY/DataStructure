public class Estudiante{
	private String id;
	private String name;
	private String lastname;

	public Estudiante(){
		this.id="";
		this.name="";
		this.lastname="";
	}

	public Estudiante(String id,String name,String lastname){
		this.id=id;
		this.name=name;
		this.lastname=lastname;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setLasname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	public int hashcode(){
		final int prime = 31;
		int result =1;
		result = prime*result +((id==null) ? 0 : id.hashCode());
		return result;
	}

	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if(id==null){
			if(other.id != null)
				return false;
		}else if(!id.equals(other.id))
				return false;
		return true;
		
	}

	public String toString(){
		return "Estudiante [id=" +id+", name="+name+", lastname="+lastname+"]";
	}

}
