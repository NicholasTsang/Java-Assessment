package NotFinished;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;


public class QACinema {

	public static void main (String Args[]) {
		
		JFrame QA_Cinema = new JFrame("QA Cinema");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		Label L1 = new Label("Movie:");
		Label L2 = new Label("Tickets:");
		Label L3 = new Label("Standards");
		Label L4 = new Label("Oap");
		Label L5 = new Label("Student");
		Label L6 = new Label("Child");
		P1.setLayout(new GridLayout(2,2));
		P2.setLayout(new GridLayout(2,4));
		
		JMenuItem Item = new JMenuItem("Click if Wednesday" );
		
		
		
		TextField T1 = new TextField();
		TextField T2 = new TextField();
		TextField T3 = new TextField();
		TextField T4 = new TextField();
		TextField T5 = new TextField();
		
		Button B1 = new Button("Confirm");
		
		Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QAWednesday Dis = new QAWednesday();
				Dis.Discount();
				
				
		} 
			});
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QAmovies Title = new QAmovies();
				Tickets Fee = new Tickets();
				Title.Movies(T1.getText(),T5.getText());
				Fee.Price(T1.getText(),T1.getText(),T1.getText(),T1.getText());
				
				
		} 
			});
		
		P1.add(L1);
		P1.add(T1);
		P1.add(L2);
		
		P2.add(L3);
		P2.add(T2);
		P2.add(L4);
		P2.add(T3);
		P2.add(L5);
		P2.add(T4);
		P2.add(L6);
		P2.add(T5);
		
		QA_Cinema.add(P1,BorderLayout.NORTH);
		QA_Cinema.add(P2,BorderLayout.CENTER);
		QA_Cinema.add(B1,BorderLayout.SOUTH);
		
		QA_Cinema.setSize(400, 200);
		QA_Cinema.setVisible(true);
		
		QA_Cinema.addWindowListener(new WindowAdapter() { // x button
			public void windowClosing(WindowEvent we){
				QA_Cinema.dispose();
	}
			});
		
	}
}
