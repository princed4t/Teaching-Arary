
public class Student {
	private int id;
	private String name;
	private String city;
	private String address;
	public Student(int id, String name, String city, String address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
	return	Integer.hashCode(id);
	}
	@Override
	public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
		if(obj==null&& getClass()!=obj.getClass()) {
			return false;
		}
	   Student s=(Student)obj;
	   return name.equals(s.name);
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	
	

}
