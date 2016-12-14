package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class GUIAddFile {
	private JButton btnSave,btnCancel,btnClear,btnSearch,btnDisplay;
	private JTextField txtManufacturer,txtModel,txtAmount,txtPrice,txtType,txtSearch, txtSearch1;
	private JTextField txtDisplay;
	private JPanel pnlManufacturer,pnlModel,pnlAmount,pnlPrice,pnlType,pnlDisplay,pnlSearch,pnlButton,pnlOuter;
	private JScrollPane scroll;
	FolderArray listP;
	FileArray listH;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAddFile window = new GUIAddFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIAddFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		listP = new FolderArray(5);
		listH = new FileArray(5);
		
		frame = new JFrame("FILE SEARCH SYSYEM");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 542, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSnow = new JLabel("FILE");
		lblSnow.setFont(new Font("Hanging Letters", Font.PLAIN, 62));
		lblSnow.setBounds(183, 0, 155, 72);
		frame.getContentPane().add(lblSnow);
		
		JLabel lblNewLabel_1 = new JLabel("SEARCHING");
		lblNewLabel_1.setFont(new Font("Orator Std", Font.PLAIN, 33));
		lblNewLabel_1.setBounds(159, 66, 200, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Find your file in the easiest way! ");
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(154, 99, 365, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JButton btnStaff = new JButton("Create");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "File is successfully created!");
				String files=txtManufacturer.getText();
				String type=txtType.getText();
				if("DSA".equalsIgnoreCase(files))
				{
					FolderArray.addCars(files,type);
				}
				else
					FileArray.addCars(files,type);
			}
		});
		btnStaff.setBounds(62, 151, 89, 23);
		frame.getContentPane().add(btnStaff);
		
		JButton btnLogOut = new JButton("Search Folder");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search=txtSearch.getText();
				if("perodua".equalsIgnoreCase(search))
				{
					txtDisplay.setText(listP.toString());
					/**int location=listP.searchModel(search);
					if(location!=-1)
					{
						txtDisplay.setText(listP.display(location));
						System.out.println(listP.display(location));
					}
					else
					{
						txtDisplay.setText("Data not found");
					}**/
				}
				else if("DSA".equalsIgnoreCase(search))
				{
					int location=listH.searchModel(search);
					if(location!=1)
					{
						txtDisplay.setText(listH.toString());
					}
					else
					{
						txtDisplay.setText("Data not found");
					}
				}
		
				else
					txtDisplay.setText("Data not found");
			}
		});
	
		btnLogOut.setBounds(201, 149, 120, 23);
		frame.getContentPane().add(btnLogOut);
		
		
		JButton btnSearch = new JButton("Search File");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search=txtSearch1.getText();
				if("perodua".equalsIgnoreCase(search))
				{
					txtDisplay.setText(listP.toString());
					/**int location=listP.searchModel(search);
					if(location!=-1)
					{
						txtDisplay.setText(listP.display(location));
						System.out.println(listP.display(location));
					}
					else
					{
						txtDisplay.setText("Data not found");
					}**/
				}
				else if("coding".equalsIgnoreCase(search))
				{
					int location=listP.searchModel(search);
					if(location!=1)
					{
						txtDisplay.setText(listP.toString());
					}
					else
					{
						txtDisplay.setText("Data not found");
					}
				}
		
				else
					txtDisplay.setText("Data not found");
			}
		});
	
		btnSearch.setBounds(350, 149, 100, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnCars = new JButton("Clear");
		btnCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtManufacturer.setText(" ");
				txtDisplay.setText("");
				txtType.setText("");
			}
		});
		btnCars.setBounds(62, 182, 89, 23);
		frame.getContentPane().add(btnCars);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(listP.toString()+ listH.toString());
			}
		});
		btnDisplay.setBounds(201, 183, 89, 23);
		frame.getContentPane().add(btnDisplay);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\kimchi\\bird-cage-birds-dream-epic-Favim.com-1823029.png"));
		lblNewLabel.setBounds(10, -228, 499, 457);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Name: ");
		lblNewLabel_4.setBounds(36, 240, 89, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtManufacturer = new JTextField();
		txtManufacturer.setBounds(119, 240, 343, 20);
		frame.getContentPane().add(txtManufacturer);
		txtManufacturer.setColumns(10);
		
		JLabel lblType = new JLabel("file / folder: ");
		lblType.setBounds(36, 265, 100
				, 14);
		frame.getContentPane().add(lblType);
		
		txtType = new JTextField();
		txtType.setBounds(119, 262, 343, 20);
		frame.getContentPane().add(txtType);
		txtType.setColumns(10);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(25, 357, 472, 173);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JLabel lblSearchByManufacturer = new JLabel("Search by Folder :");
		lblSearchByManufacturer.setBounds(36, 288, 131, 14);
		frame.getContentPane().add(lblSearchByManufacturer);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(148, 285, 315, 20);
		frame.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblSearchByManufacturer2 = new JLabel("Search by File :");
		lblSearchByManufacturer2.setBounds(36, 320, 131, 14);
		frame.getContentPane().add(lblSearchByManufacturer2);
		
		txtSearch1 = new JTextField();
		txtSearch1.setBounds(140, 315, 315, 20);
		frame.getContentPane().add(txtSearch1);
		txtSearch1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Final\\tumblr_lk8ml359bq1qfzq9ko1_500.jpg"));
		lblNewLabel_3.setBounds(10, 216, 499, 347);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
