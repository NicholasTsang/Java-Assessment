package Basic;
public class TicketCost extends Ticketamount{

	public void Cost() {
		int CStandard = 8;
		int COap = 6;
		int CStudent = 6;
		int CChild = 4;
		if (Day.equals("Wednesday")) {
			int DCStandard = 6;
			int DCOap = 4;
			int DCStudent = 4;
			int DCChild = 2;
			int Sum = (Standard*DCStandard)+(Oap*DCOap)+(Student*DCStudent)+(Child*DCChild);
			System.out.println("Your Total Cost of the Tickets:" + Sum + "pounds");
		}
		else
			{int Sum = (Standard*CStandard)+(Oap*COap)+(Student*CStudent)+(Child*CChild);
			System.out.println("Your Total Cost of the Tickets:" + Sum + "pounds");
			}
	}
	
}
