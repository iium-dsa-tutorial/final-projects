
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame{
	
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	private JLabel pic1;
	
	
	public GUI () {
		super ("Magic Wand");
		panel = new JPanel ();
		panel.setBackground(color);
		

       
		b = new JButton("Choose a color");
		b.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "Pick your color", color);
						if(color==null)	
							color=(Color.WHITE);
						
						panel.setBackground(color);
					}
				}
		);	
		add (panel, BorderLayout.CENTER );
		add (b, BorderLayout.SOUTH);
		setSize (425,150);
		setVisible(true);
	}
	

	}

