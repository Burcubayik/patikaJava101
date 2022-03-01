package studentInformationSystem;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int scoreSoz;
	int scoreYaz;
	
	public Course( String name, String code, String prefix) {
		
		
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.scoreSoz=0;
		this.scoreYaz=0;
	}
	
	public void addTeacher(Teacher teacher) {
		if(this.prefix.equals(teacher.branch)){
			this.teacher=teacher;
			System.out.println("��lem ba�ar�l�!"); 
		}
		else {
			System.out.println(teacher.firstName+ " "+ teacher.lastName+ " �simli akademisyen "+ this.name+ " dersini vermeye uygun de�ildir."); 
		}
		
	}
	public void printTeacher() {
		if(this.teacher!=null) {
			System.out.println(this.name+ " dersinin akademisyeni: "+ this.teacher.firstName+" "+ this.teacher.lastName);
			
		}
		else {
			System.out.println(this.name+ " dersine akademisyen atamas� yap�lmam��t�r.");
		}
	}

}
