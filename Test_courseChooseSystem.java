package Result;

import Information.Course;
import Information.Teacher;
import Information.Student;
import java.util.Scanner;
public abstract class Test_courseChooseSystem {
	
	static Student stu0 = new Student(1,"Jack","��","S19001",0);
	static Student stu1 = new Student(2,"Lily","Ů","S19002",0);
	static Teacher tea0 = new Teacher(1,"A","Ů","T1001","��ɢ��ѧ");
	static Teacher tea1 = new Teacher(2,"B","Ů","T1002","���Դ���");
	static Course cou0 = new Course(1,"��ɢ��ѧ","��105",0);
	static Course cou1 = new Course(2,"���Դ���","��104",0);
	static int courseNum;
	static int stuNum;
	static int X;
	static int Y;
	public static void main(String[] args) {
		
		c:for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);//¼���﷨
			int X =reader.nextInt();//��ȡѧ�����
			stuNum=X;//��¼ѧ�����
			judgeStu(X);//ѡ��ѧ��
			System.out.println("1.����/n2.����");
			int m=reader.nextInt();
			if(m==2)
				break c;	
		}
		printAll();
	}
	public static void judgeStu(int Num) {//ѡ��ѧ�� �ж��Ƿ��˿�
		Scanner reader = new Scanner(System.in);
		System.out.println("1.ѡ��\n2.�˿�");
		int y =reader.nextInt();
		if(Num==1)
			judgeChoose(y);
		else if(Num==2)
			judgeChoose(y);
		else System.out.println("û�и�ͬѧ��Ϣ��������1~2");
	}
	
	public static void judgeChoose(int Num) {//ȷ���˿�ѡ�Σ�ѡ��γ̱��
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int a =reader.nextInt();
		courseNum=a;//��¼�γ̱��
		if(Num==1){//ѡ��
			courseChoose(a);
		    addWork(stuNum,courseNum);
		    }
		else if(Num==2){//�˿�
			courseChoose(a);
		    reduceWork(stuNum,courseNum);
		    }
		else System.out.println("��������������1~2");
	}
	
	
	public static void courseChoose(int Num) {//ѡ��γ̲���ӡ��ʦ
		Scanner reader = new Scanner(System.in);
		if(Num==1) {
			printTeacher(1);
		    int m =reader.nextInt();
		    
		}
		else if(Num==2) {
			printTeacher(2);
			int n =reader.nextInt();

		}
		else System.out.println("û�иÿγ���Ϣ��������1~2");
		
	}
	public static void informationSure(int Num) {
		System.out.println("1.ȷ��\n2.����");
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
	public static void printTeacher(int x) {//��ӡ������ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   ѧ��   �ڿ�");
		if (x==1){
		System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		}
		else if(x==2) {
		System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		}
		
	}
    public static void printTeacherAll() {//��ӡ���н�ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   �Ա�   ѧ��   �ڿ�");
		System.out.println("ѡ������  "+cou0.getStuNum()+" "+"ѡ����  "+stu0.getCourses());
		System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherSex()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("ѡ������  "+cou1.getStuNum()+" "+"ѡ����  "+stu1.getCourses());
		System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherSex()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
	}
    public static void printStudent(int x) {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����   ѧ��   ����");
		if (x==1)
		System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		else if (x==2)
		System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+" "+stu1.getStudentId()+"   "+stu1.getCourses());		
    }
    public static void printStudentAll() {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����   �Ա�   ѧ��   ����");
		System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+"  "+stu0.getStudentSex()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+"  "+stu1.getStudentSex()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("������ѧ����ţ�");
    }
    public static void printCourse(int x) {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		if(x==1)
		System.out.println("  "+cou0.getNum()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNum());
		else if(x==2)
		System.out.println("  "+cou1.getNum()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNum());
    }
    public static void printCourseAll() {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		System.out.println("  "+cou0.getNum()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNum());
		System.out.println("  "+cou1.getNum()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNum());
		
    }
}
 