import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DemoComboBox extends JFrame{
	
	/* 
	 * AWT.Events
	 * |
	 * Component Events
	 * |
	 * Window Event-----Input Event-----Focus Event
	 * 					|
	 * 					Mouse Event-----Key Event
	 * */
	
	public DemoComboBox( int x , int y , String title ){
		
		this.setLayout(null);
		this.setSize( x, y );
		this.setTitle( title );
		
		JLabel label1 = new JLabel("hola");
		label1.setBounds(50, 50, 100, 100);
		
		String[] string = {"si" , "no" , "tu mama" , "D:" };
		
		JComboBox combo = new JComboBox( string );
		combo.setBounds( 100 , 100 , 200, 50 );
		
		this.add(label1);
		this.add(combo);
		
	}
	
	
	public static void main(String[] args) {
		
		DemoComboBox DCM = new DemoComboBox( 500 , 500 , "JComboBox" );
		DCM.setVisible(true);

	}

}
