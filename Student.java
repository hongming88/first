package lab1;

public class Student {
	private String name;		//姓名
	private char sex;			//性别
	
	
	class Subject{
		private String subject;		//科目名称
		private String typeName;		//性质
		private double attendance;		//出勤
		private double homework;		//作业
		private double experiment;		//实验
		private double endofterm;		//期末
		private double total;			//总分
		public void setSubject(String subject,String typeName,double attendance,double homework,double experiment,double endofterm){
			this.subject=subject;
			this.typeName=typeName;
			this.attendance=attendance;
			this.homework=homework;
			this.experiment=experiment;
			this.endofterm=endofterm;

		}
		public String getSubject(){
			return "科目名称:"+subject+",性质:"+typeName+",出勤:"+attendance+",作业:"+homework+","
					+ "实验:"+experiment+",期末:"+endofterm+",总分:"+total+"";
		}
		
	}
	static class subjectType{
		String typeName;			//性质
		double attenRatio;			//出勤比例
		static final double assignRatio=0.1;//作业比例
		static final double labRatio=0.1;//实验比例
		double finalRatio;//期末比例
		void setRatio(String typeName,double attenRatio,double finalRatio){
			this.typeName=typeName;
			this.attenRatio=attenRatio;
			this.finalRatio=finalRatio;
			
		}
			
		}
	double printInfo(String typeName,double attendance,double homework,double experiment,double endofterm){
		final double assignRatio=0.1;//作业比例
		final double labRatio=0.1;//实验比例
		double attenRatio;
		double finalRatio;
		double total;
		Student.subjectType b1=new Student.subjectType();
		Student.subjectType b2=new Student.subjectType();
		b1.setRatio("考试", 0.1, 0.7);
		b2.setRatio("考查", 0.2, 0.6);
		if(typeName=="考试"){
			total=attendance*b1.attenRatio+homework*b1.assignRatio+experiment*b1.labRatio+endofterm*b1.finalRatio;
		}else{
			total=attendance*b2.attenRatio+homework*b2.assignRatio+experiment*b2.labRatio+endofterm*b2.finalRatio;
		}
		total=(int)total;
		return total;
		
	}
	public void setStudnet(String name,char sex){
		this.name=name;
		this.sex=sex;
	}
	
	public String getname(){
		return "姓名:"+name+",性别:"+sex+"";
	}
	
	void student1(){
		Student s1=new Student();
		s1.setStudnet("李红",'女');
		Subject sb1=s1.new Subject();
		Subject sb2=s1.new Subject();
		Subject sb3=s1.new Subject();
		sb1.setSubject("Java", "考查", 90, 85, 75, 80);
		sb2.setSubject("SQL", "考试", 80, 90, 82, 75);
		sb3.setSubject("J2EE", "考查", 78, 70, 65, 70);
		sb1.total=printInfo(sb1.typeName,sb1.attendance,sb1.homework,sb1.experiment,sb1.endofterm);
		sb2.total=printInfo(sb2.typeName,sb2.attendance,sb2.homework,sb2.experiment,sb2.endofterm);
		sb3.total=printInfo(sb3.typeName,sb3.attendance,sb3.homework,sb3.experiment,sb3.endofterm);
		System.out.println(s1.getname()+"\n"+sb1.getSubject()+"\n"+sb2.getSubject()+"\n"+sb3.getSubject());
	}
	
	void student2(){
		Student s1=new Student();
		s1.setStudnet("王晓明",'男');
		Subject sb1=s1.new Subject();
		Subject sb2=s1.new Subject();
		Subject sb3=s1.new Subject();
		sb1.setSubject("Java", "考查", 86, 67, 71, 70);
		sb2.setSubject("SQL", "考试", 77, 70, 85, 66);
		sb3.setSubject("J2EE", "考查", 88, 74, 68, 80);
		sb1.total=printInfo(sb1.typeName,sb1.attendance,sb1.homework,sb1.experiment,sb1.endofterm);
		sb2.total=printInfo(sb2.typeName,sb2.attendance,sb2.homework,sb2.experiment,sb2.endofterm);
		sb3.total=printInfo(sb3.typeName,sb3.attendance,sb3.homework,sb3.experiment,sb3.endofterm);
		System.out.println(s1.getname()+"\n"+sb1.getSubject()+"\n"+sb2.getSubject()+"\n"+sb3.getSubject());
		
	}
	
	public static void main(String[] args){
		Student v1=new Student();
		v1.student1();
		v1.student2();
		

	}
}


