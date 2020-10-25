package Information;


public class Teacher extends People {
	private String teacherName;
	private String teacherId;
	  ;
public Teacher(int number,String name,String sex,String id,String course){
	setNum(number);
	setTeacherName(name);
	setTeacherSex(sex);
	setTeacherId(id);
	setTeaCourse(course);
}

public int getNum(){
	return num;	
}
void setNum(int number) {
	this.num=number;	
}
public String getTeacherName(){
	return teacherName;	
}
void setTeacherName(String teacherName) {
	this.teacherName = teacherName;	
}
public String getTeacherSex(){
	return sex;	
}
void setTeacherSex(String sex) {
	this.sex=sex;	
}
public String getTeacherId(){
	return teacherId;	
}
void setTeacherId(String teacherId) {
	this.teacherId = teacherId;	
}
public void setTeaCourse(String course) {
	super.course=course;
	}
public String getTeaCourse() {
	return super.course;
	}

}
