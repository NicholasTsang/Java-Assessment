package Basic;
public class Ticketamount extends MovieList{



	public void Amount() {
		;
		
		
		System.out.print("You have order ");
		 if (Standard > 0) {
			 System.out.print(Standard + " Standard ");
			 }
		 if (Oap > 0) {
			 System.out.print(Oap + " Oap ");
			 }
		 if (Student > 0) {
			 System.out.print(Student + " Student ");
			 }
		 if (Child > 0) {
			 System.out.print(Child + " Child ");
			 }
		 else System.out.print("0");
		 System.out.print(" Tickets ");
		}
		 
	
}
