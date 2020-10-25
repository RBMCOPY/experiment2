# experiment2
# 计192 2019310194 任博淼

# JAVA实验二
# 阅读程序
## 实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；   
2.掌握面向对象的类设计方法（属性、方法）；    
3.掌握类的继承用法，通过构造方法实例化对象；    
4.学会使用super()，用于实例化子类；    
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。    
  
## 实验过程
1.定义4个普通类和1个主类。
2.普通类分别定义人员，教师，学生，课程。
3.每个类别分别添加ID，姓名，性别，学号，课程等属性。
4.在主类里调用4个普通类，根据各属性输出值。

## 核心方法
（1）  
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
以上类似于上次实验所用方法。  
（2）  
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
  循环
（3）  
    public static void printTeacherAll() {  
		System.out.println("<教师信息>");  
		System.out.println("编号   姓名   性别   学号   授课");  
		System.out.println("选课人数  "+cou0.getStuNum()+" "+"选课数  "+stu0.getCourses());  
		System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherSex()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());  
		System.out.println("选课人数  "+cou1.getStuNum()+" "+"选课数  "+stu1.getCourses());  
		System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherSex()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());  
	}  
  打印信息

## 实验结果
![1](https://github.com/RBMCOPY/experiment1/blob/main/4f4eabddd7e4d4ad07ed4716e1ee77f.png)
## 实验感想
  在这一次的实验中，我基本掌握了Java的编程规则、知识要点和一些小技巧，特别是对面向对象的编程思想和风格有了进一步的认识和体会。同时，因正确的编出程序而带来的成就感让我对编程更加感兴趣。我感受到一个小的细节，都能决定程序运行的成功与否，所以我应该更加细心。
