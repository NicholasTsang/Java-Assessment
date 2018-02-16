package NotFinished;

public class Tickets {
	String Stanard,Oap,Student,Child;
	public void Price(String stan, String oap, String stud, String child) {
		Stanard = stan ; Oap = oap ; Student = stud ; Child = child ;
		int Sta,O,Stu,Chi,Sum;
		int CStandard = 8;
		int COap = 6;
		int CStudent = 6;
		int CChild = 4;
		Sta = Integer.parseInt(Stanard) + 0; 
		O = Integer.parseInt(Oap) + 0;
		Stu = Integer.parseInt(Student)+ 0;
		Chi= Integer.parseInt(Child) ;
		
		Sum = (Sta*CStandard)+(O*COap)+(Stu*CStudent)+(Chi*CChild);
		
		System.out.println("Total Price: " + Sum);
	}

}
