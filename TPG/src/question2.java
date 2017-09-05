public class question2 implements Comparable<question2> {
	
	private Integer id;
	private String name;
	private Double cgpa;
	
	public question2(Integer id, String name, Double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public int compareTo(question2 o) {
		if (o == null) {
            // non null always comes after null
            return 1;
        }

        final int cgpaCompare = Double.compare(o.cgpa, this.cgpa);
        
        if (cgpaCompare == 0) {
        	int nameCompare = this.name.compareTo(o.name);
        	if (nameCompare == 0) {
        		return this.id.compareTo(o.id);
        	}
        	else {
        		return nameCompare;
        	}
        }
        else {
        	return cgpaCompare;
        }

	}

}