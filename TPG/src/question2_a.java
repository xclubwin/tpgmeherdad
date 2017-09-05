import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class question2_a {

	public static void main(String[] args) {
		
		question2 student1 = new question2(33, "Tina", 3.68);
		question2 student2 = new question2(85, "Louis", 3.85);
		question2 student3 = new question2(56, "Samil", 3.75);
		question2 student4 = new question2(19, "Samar", 3.75);
		question2 student5 = new question2(22, "Lorry", 3.76);
		question2 student6 = new question2(32, "Samil", 3.75);
		
		List<question2> studentsBeforeSort = new ArrayList<question2>();
		
		studentsBeforeSort.add(student1);
		studentsBeforeSort.add(student6);
		studentsBeforeSort.add(student5);
		studentsBeforeSort.add(student3);
		studentsBeforeSort.add(student2);
		studentsBeforeSort.add(student4);
		
		Collections.sort(studentsBeforeSort);
		
		System.out.println("Sorted : ");
		for (question2 student : studentsBeforeSort) {
			System.out.println("name="+student.getName());
		}
	}

}

//final commit