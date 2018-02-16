package Basic;

public class MovieList {

	int Standard = 2;
	int Oap = 1;
	int Student = 1;
	int Child = 0;
	String Day = "Wednesday";
	public void BloodPit() {
		Ticketamount Tickets = new Ticketamount();
		TicketCost Price = new TicketCost();
		if (Child > 0) {
			System.out.println("This Movie is Not for Children");
		}
		else{
			Tickets.Amount();
			System.out.println(" for BloodPit");
			Price.Cost();
		}
	}
	
	public void Frozen3(){
		Ticketamount Tickets = new Ticketamount();
		TicketCost Price = new TicketCost();
		Tickets.Amount();
		System.out.println(" for Frozen3");
		Price.Cost();
	}
}
