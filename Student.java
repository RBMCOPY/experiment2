package Information;

public class Student extends People {
	private String studentName;
	private String studentId;
		
public Student(int number,String name,String sex,String id,int course){
	setNum(number);
	setStudentName(name);
	setStudentSex(sex);
	setStudentId(id);
	setCourses(course);
	}

public int getNum(){
	return num;	
}
void setNum(int number) {
	this.num=number;	
}
public String getStudentName(){
	return studentName;	
}
void setStudentName(String studentName) {
	this.studentName = studentName;	
}
public String getStudentSex(){
	return sex;	
}
void setStudentSex(String sex) {
	this.sex=sex;	
}
public String getStudentId(){
	return studentId;	
}
void setStudentId(String studentId) {
	this.studentId = studentId;	
}

public void setCourses(int courses) {
	super.courseNumber=courses;
}
public void addCourses(int courseNumber) {
	this.courseNumber = courseNumber+1;
}
public void reduceCourses(int courseNumber) {
	this.courseNumber = courseNumber-1;
}
public int getCourses() {
	return courseNumber;
}

}

