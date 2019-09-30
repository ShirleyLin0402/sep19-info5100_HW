import java.util.ArrayList;
import java.util.HashSet;

//It should have following members

//int[] studentIds

//Function: registerStudent(int studentId)

//There should be 3 ways to create Course Object (Hint : Use Constructor)
//courseId
//courseId, professorId
//courseId, professorId, credits

//Class should provide getters/setters for all members

//registerStudent method should store all ids in studentIds array.
public class Course {
	private int courseId;
	private int professorId;
	private int credits;
	private int maxCapacity;
	private String courseName;
	private int[] studentIds;
	private ArrayList<Integer> studentIdArr;
	
	
	public int getCourseId(){
		return this.courseId;
	}
	
	public void setCourseId(int NewId) {
		if (NewId <= 0) {
			System.out.println("Can't set the course ID to negative or 0.");
			return;
		}
		this.courseId = NewId;
	}
	
	public int getProfessorId(){
		return this.professorId;
	}
	
	public void setProfessorId(int NewProfessorId) {
		int length = Integer.toString(NewProfessorId).length();
		if (length == 6) {
			this.professorId = NewProfessorId;
		}

		else {
			System.out.println("Invalid input!");
			return;
		}
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public void setCredits(int NewCredits) {
		if(NewCredits < 0 || NewCredits >= 10) {
			System.out.println("Invalid input!");
			return;
		}
		this.credits = NewCredits;
	}
	
	public int getMaxCapacity(){
		return this.maxCapacity;
	}
	
	public void setMaxCapacity(int NewMaxCapacity) {
		if(NewMaxCapacity < 10 || NewMaxCapacity > 100) {
			System.out.println("Invalid input!");
			return;
		}
		this.maxCapacity = NewMaxCapacity;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String NewCourseName) {
		int length = NewCourseName.length();
		if(length < 10 || length > 60) {
			System.out.println("Invalid input!");
			return;
		}
		this.courseName = NewCourseName;
	}
	
	Course(int courseId){
		this.courseId = courseId;
		studentIdArr = new ArrayList<Integer>();
		
	}
	
	Course(int courseId, int professorId){
		this.courseId = courseId;
		this.professorId = professorId;
		studentIdArr = new ArrayList<Integer>();
	}
	
	Course(int courseId, int professorId, int credit){
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credit;
		studentIdArr = new ArrayList<Integer>();
	}
	
	public int[] removeDuplicates(int[] studentIds) {
		int size = studentIds.length;
		HashSet<Integer> studentHashSet = new HashSet<>();
		if (size >= this.maxCapacity) {
			ArrayList<Integer> NewStudentIds = new ArrayList<Integer>(studentIds.length);
			for(int i = 0; i < studentIds.length; i++) {
				if( studentHashSet.contains(i)) {
				}
				else {
					NewStudentIds.add(studentIds[i]);
					studentHashSet.add(studentIds[i]);
				}
			}
			int[] reversedIds = new int[NewStudentIds.size()];
			for(int i = 0; i< reversedIds.length; i++) {
				reversedIds[i] = NewStudentIds.get(i);
			}
			return reversedIds;
		}
		return studentIds;
	}
	
	public int groupsOfStudents(int[] studentIds) {
		int count  = 0;
		int size = studentIds.length;
		for (int i = 0; i< size ; i++) {
			for(int j = i+1; j < size ; j++) {
				if((studentIds[i] + studentIds[j]) % 2 ==0) {
					count++;
				}
			}
		}
		return count;

	}
	
	
	public void registerStudent(int studentId) {
		     
	    studentIdArr.add(studentId);
	    studentIds = new int[studentIdArr.size()];
	    for(int i = 0; i< studentIds.length; i++) {
	    	studentIds[i] = studentIdArr.get(i);
		}
	    
	}

}