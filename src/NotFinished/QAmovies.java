package NotFinished;

public class QAmovies {
	
	String Name,Under;
	public void  Movies ( String Title, String Child) {
		Name = Title;
		Under = Child;
		if (Name .equals("Murder") && Under.equals("0")) {
			
			System.out.println(" Murder");
		}
		if (Name .equals("Murder") && !Under.equals("0")) {
			
			System.out.println(" No Childern Allow ");
		}
		 
		if (Name .equals("Minions") ) {
			
			System.out.println(" Minions ");
		}
		
	}
}
