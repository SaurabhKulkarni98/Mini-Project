import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield_1;
	private JTextField sizeField_2;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 697);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(361, 62, 275, 18);
		contentPane.add(lblNewLabel);
		
		JLabel element_1 = new JLabel("ENTER THE ELEMENT");
		element_1.setFont(new Font("Constantia", Font.BOLD, 14));
		element_1.setBounds(72, 121, 149, 18);
		contentPane.add(element_1);
		
		JLabel element_2 = new JLabel("ENTER THE ELEMENT");
		element_2.setFont(new Font("Constantia", Font.BOLD, 14));
		element_2.setBounds(72, 172, 149, 18);
		contentPane.add(element_2);
		
		sizefield_1 = new JTextField();
		sizefield_1.setBounds(285, 118, 320, 20);
		contentPane.add(sizefield_1);
		sizefield_1.setColumns(10);
		
		sizeField_2 = new JTextField();
		sizeField_2.setColumns(10);
		sizeField_2.setBounds(285, 169, 320, 20);
		contentPane.add(sizeField_2);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(746, 127, 119, 25);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(746, 182, 129, 25);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(339, 297, 121, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(327, 373, 133, 25);
		contentPane.add(deletefront);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.setFont(new Font("Constantia", Font.BOLD, 13));
		displayforward.setBounds(241, 445, 163, 25);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 13));
		displayreverse.setBounds(468, 444, 151, 25);
		contentPane.add(displayreverse);
		
		displaybox = new JTextField();
		displaybox.setBounds(72, 555, 797, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
