import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField sizeField_1;
	private JTextField sizeField_2;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SinglyLinkedList() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(273, 49, 267, 18);
		contentPane.add(lblNewLabel);
		
		JLabel element_1 = new JLabel("ENTER THE ELEMENT");
		element_1.setForeground(new Color(255, 0, 0));
		element_1.setFont(new Font("Constantia", Font.BOLD, 13));
		element_1.setBounds(152, 141, 140, 17);
		contentPane.add(element_1);
		
		JLabel element_2 = new JLabel("ENTER THE ELEMENT");
		element_2.setForeground(Color.RED);
		element_2.setFont(new Font("Constantia", Font.BOLD, 13));
		element_2.setBounds(152, 181, 140, 17);
		contentPane.add(element_2);
		
		sizeField_1 = new JTextField();
		sizeField_1.setBounds(336, 137, 152, 20);
		contentPane.add(sizeField_1);
		sizeField_1.setColumns(10);
		
		sizeField_2 = new JTextField();
		sizeField_2.setColumns(10);
		sizeField_2.setBounds(336, 177, 152, 20);
		contentPane.add(sizeField_2);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(617, 136, 119, 25);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(617, 194, 129, 25);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(336, 252, 121, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(336, 316, 133, 25);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.setFont(new Font("Constantia", Font.BOLD, 13));
		display.setBounds(338, 385, 89, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(152, 453, 584, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
