package lab1;

public class Student {
	private String name;		//����
	private char sex;			//�Ա�
	
	
	class Subject{
		private String subject;		//��Ŀ����
		private String typeName;		//����
		private double attendance;		//����
		private double homework;		//��ҵ
		private double experiment;		//ʵ��
		private double endofterm;		//��ĩ
		private double total;			//�ܷ�
		public void setSubject(String subject,String typeName,double attendance,double homework,double experiment,double endofterm){
			this.subject=subject;
			this.typeName=typeName;
			this.attendance=attendance;
			this.homework=homework;
			this.experiment=experiment;
			this.endofterm=endofterm;

		}
		public String getSubject(){
			return "��Ŀ����:"+subject+",����:"+typeName+",����:"+attendance+",��ҵ:"+homework+","
					+ "ʵ��:"+experiment+",��ĩ:"+endofterm+",�ܷ�:"+total+"";
		}
		
	}
	static class subjectType{
		String typeName;			//����
		double attenRatio;			//���ڱ���
		static final double assignRatio=0.1;//��ҵ����
		static final double labRatio=0.1;//ʵ�����
		double finalRatio;//��ĩ����
		void setRatio(String typeName,double attenRatio,double finalRatio){
			this.typeName=typeName;
			this.attenRatio=attenRatio;
			this.finalRatio=finalRatio;
			
		}
			
		}
	double printInfo(String typeName,double attendance,double homework,double experiment,double endofterm){
		final double assignRatio=0.1;//��ҵ����
		final double labRatio=0.1;//ʵ�����
		double attenRatio;
		double finalRatio;
		double total;
		Student.subjectType b1=new Student.subjectType();
		Student.subjectType b2=new Student.subjectType();
		b1.setRatio("����", 0.1, 0.7);
		b2.setRatio("����", 0.2, 0.6);
		if(typeName=="����"){
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
		return "����:"+name+",�Ա�:"+sex+"";
	}
	
	void student1(){
		Student s1=new Student();
		s1.setStudnet("���",'Ů');
		Subject sb1=s1.new Subject();
		Subject sb2=s1.new Subject();
		Subject sb3=s1.new Subject();
		sb1.setSubject("Java", "����", 90, 85, 75, 80);
		sb2.setSubject("SQL", "����", 80, 90, 82, 75);
		sb3.setSubject("J2EE", "����", 78, 70, 65, 70);
		sb1.total=printInfo(sb1.typeName,sb1.attendance,sb1.homework,sb1.experiment,sb1.endofterm);
		sb2.total=printInfo(sb2.typeName,sb2.attendance,sb2.homework,sb2.experiment,sb2.endofterm);
		sb3.total=printInfo(sb3.typeName,sb3.attendance,sb3.homework,sb3.experiment,sb3.endofterm);
		System.out.println(s1.getname()+"\n"+sb1.getSubject()+"\n"+sb2.getSubject()+"\n"+sb3.getSubject());
	}
	
	void student2(){
		Student s1=new Student();
		s1.setStudnet("������",'��');
		Subject sb1=s1.new Subject();
		Subject sb2=s1.new Subject();
		Subject sb3=s1.new Subject();
		sb1.setSubject("Java", "����", 86, 67, 71, 70);
		sb2.setSubject("SQL", "����", 77, 70, 85, 66);
		sb3.setSubject("J2EE", "����", 88, 74, 68, 80);
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


