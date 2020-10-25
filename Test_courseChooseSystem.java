package Result;

import Information.Course;
import Information.Teacher;
import Information.Student;
import java.util.Scanner;
public abstract class Test_courseChooseSystem {
	
	static Student stu0 = new Student(1,"Jack","男","S19001",0);
	static Student stu1 = new Student(2,"Lily","女","S19002",0);
	static Teacher tea0 = new Teacher(1,"A","女","T1001","离散数学");
	static Teacher tea1 = new Teacher(2,"B","女","T1002","线性代数");
	static Course cou0 = new Course(1,"离散数学","教105",0);
	static Course cou1 = new Course(2,"线性代数","教104",0);
	static int courseNum;
	static int stuNum;
	static int X;
	static int Y;
	public static void main(String[] args) {
		
		c:for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);//录入语法
			int X =reader.nextInt();//获取学生编号
			stuNum=X;//记录学生编号
			judgeStu(X);//选择学生
			System.out.println("1.继续/n2.结束");
			int m=reader.nextInt();
			if(m==2)
				break c;	
		}
		printAll();
	}
	public static void judgeStu(int Num) {//选择学生 判断是否退课
		Scanner reader = new Scanner(System.in);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(Num==1)
			judgeChoose(y);
		else if(Num==2)
			judgeChoose(y);
		else System.out.println("没有该同学信息，请输入1~2");
	}
	
	public static void judgeChoose(int Num) {//确认退课选课，选择课程编号
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int a =reader.nextInt();
		courseNum=a;//记录课程编号
		if(Num==1){//选课
			courseChoose(a);
		    addWork(stuNum,courseNum);
		    }
		else if(Num==2){//退课
			courseChoose(a);
		    reduceWork(stuNum,courseNum);
		    }
		else System.out.println("输入有误，请输入1~2");
	}
	
	
	public static void courseChoose(int Num) {//选择课程并打印老师
		Scanner reader = new Scanner(System.in);
		if(Num==1) {
			printTeacher(1);
		    int m =reader.nextInt();
		    
		}
		else if(Num==2) {
			printTeacher(2);
			int n =reader.nextInt();

		}
		else System.out.println("没有该课程信息，请输入1~2");
		
	}
	public static void informationSure(int Num) {
		System.out.println("1.确认\n2.返回");
		if(Num==1) {
			
		}
		else if(Num==2) {};
	}

	public static void addWork(int stuNum,int courseNum) {
		if (stuNum==1 && courseNum==1) {
		    cou0.addStuNum(cou0.getStuNum());
		    stu0.addCourses(stu0.getCourses());
		}
		else if (stuNum==1 && courseNum==2) {
			cou0.addStuNum(cou0.getStuNum());
			stu1.addCourses(stu1.getCourses());
			}
		else if (stuNum==2 && courseNum==1) {
			cou1.addStuNum(cou1.getStuNum());
			stu0.addCourses(stu0.getCourses());
			}
		else if (stuNum==2 && courseNum==2) {
			cou1.addStuNum(cou1.getStuNum());
			stu1.addCourses(stu1.getCourses());
			}
	}
	public static void reduceWork(int stuNum,int courseNum) {
		if (stuNum==1 && courseNum==1) {
		    cou0.reduceStuNum(cou0.getStuNum());
		    stu0.reduceCourses(stu0.getCourses());
		}
		else if (stuNum==1 && courseNum==2) {
			cou0.reduceStuNum(cou0.getStuNum());
			stu1.reduceCourses(stu1.getCourses());
			}
		else if (stuNum==2 && courseNum==1) {
			cou1.reduceStuNum(cou1.getStuNum());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNum==2 && courseNum==2) {
			cou1.reduceStuNum(cou1.getStuNum());
			stu1.reduceCourses(stu1.getCourses());
			}
		}

	public static void printAll() {
		printStudentAll();
		printTeacherAll();
		printCourseAll();
	}
	public static void printTeacher(int x) {//打印单条教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		if (x==1){
		System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		}
		else if(x==2) {
		System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		}
		
	}
    public static void printTeacherAll() {//打印所有教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   性别   学号   授课");
		System.out.println("选课人数  "+cou0.getStuNum()+" "+"选课数  "+stu0.getCourses());
		System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherSex()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("选课人数  "+cou1.getStuNum()+" "+"选课数  "+stu1.getCourses());
		System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherSex()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
	}
    public static void printStudent(int x) {
    	System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		if (x==1)
		System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		else if (x==2)
		System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+" "+stu1.getStudentId()+"   "+stu1.getCourses());		
    }
    public static void printStudentAll() {
    	System.out.println("<学生信息>");
		System.out.println("编号   姓名   性别   学号   课数");
		System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+"  "+stu0.getStudentSex()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+"  "+stu1.getStudentSex()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("请输入学生编号：");
    }
    public static void printCourse(int x) {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		if(x==1)
		System.out.println("  "+cou0.getNum()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNum());
		else if(x==2)
		System.out.println("  "+cou1.getNum()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNum());
    }
    public static void printCourseAll() {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		System.out.println("  "+cou0.getNum()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNum());
		System.out.println("  "+cou1.getNum()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNum());
		
    }
}
 