import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Frame extends JFrame{
	private JButton die1, die2, die3, die4, die5;
	private JButton playButton;
	private JPanel paneliZarave;
	private JPanel paneliKategorive;
	private JPanel paneliTabeles;
	private JPanel paneliMesazheve;
	private ImageIcon die1Image, die2Image, die3Image, die4Image, die5Image, die6Image;
	private ImageIcon die1ImageInverted, die2ImageInverted, die3ImageInverted, die4ImageInverted, die5ImageInverted, die6ImageInverted;
	private JRadioButton rdbKategoria1, rdbKategoria2, rdbKategoria3, rdbKategoria4, rdbKategoria5, rdbKategoria6, rdbKategoria7, rdbKategoria8; 
	private JRadioButton rdbKategoria9, rdbKategoria10, rdbKategoria11, rdbKategoria12, rdbKategoria13;
	private String Players[] = {"Brian", "Tom", "Jack", "Thor"}; 
	private JLabel bottomLabel;
	private JTable table;
	private int DiceValue[] = new int[5];
	private JButton btnLlogarit;
	private int playersNumber;
	
	Frame() {
		Container cp = getContentPane();
		//cp.setLayout(new FlowLayout());
		
		// inicializimi i figurave
		die1Image = new ImageIcon(this.getClass().getResource("/die_1.png"));
		die2Image = new ImageIcon(this.getClass().getResource("/die_2.png"));
		die3Image = new ImageIcon(this.getClass().getResource("/die_3.png"));
		die4Image = new ImageIcon(this.getClass().getResource("/die_4.png"));
		die5Image = new ImageIcon(this.getClass().getResource("/die_5.png"));
		die6Image = new ImageIcon(this.getClass().getResource("/die_6.png"));
	
		die1ImageInverted = new ImageIcon(this.getClass().getResource("/die_1Inverted.png"));
		die2ImageInverted = new ImageIcon(this.getClass().getResource("/die_2Inverted.png"));
		die3ImageInverted = new ImageIcon(this.getClass().getResource("/die_3Inverted.png"));
		die4ImageInverted = new ImageIcon(this.getClass().getResource("/die_4Inverted.png"));
		die5ImageInverted = new ImageIcon(this.getClass().getResource("/die_5Inverted.png"));
		die6ImageInverted = new ImageIcon(this.getClass().getResource("/die_6Inverted.png"));

		//inicializimi i panelit te zarave
		paneliZarave = new JPanel();
		paneliZarave.setLayout(new FlowLayout());
		paneliZarave.setBackground(Color.RED);
		paneliZarave.setBounds(0, 0, 300, 500);
				//butoni hidh zarat
		playButton = new JButton("                              Hidh zarat                       ");
		paneliZarave.add(playButton);
				
		
		//shtimi i zarave ne panelin e zarave
		die1 = new JButton();
		die1.setIcon(die1Image);
		die1.addActionListener(new ChangeColor());
		die1.setBorderPainted(false);
		die1.setBorder(null);
		die1.setMargin(new Insets(0, 0, 0, 0));
		die1.setContentAreaFilled(false);

		paneliZarave.add(die1);
		
		die2 = new JButton();
		die2.setIcon(die2Image);
		die2.addActionListener(new ChangeColor());
		die2.setBorderPainted(false);
		die2.setBorder(null);
		die2.setMargin(new Insets(0, 0, 0, 0));
		die2.setContentAreaFilled(false);
		paneliZarave.add(die2);

		die3 = new JButton();
		die3.setIcon(die3Image);
		die3.addActionListener(new ChangeColor());
		die3.setBorderPainted(false);
		die3.setBorder(null);
		die3.setMargin(new Insets(0, 0, 0, 0));
		die3.setContentAreaFilled(false);
		paneliZarave.add(die3);
		
		die4 = new JButton();
		die4.setIcon(die4Image);
		die4.addActionListener(new ChangeColor());
		die4.setBorderPainted(false);
		die4.setBorder(null);
		die4.setMargin(new Insets(0, 0, 0, 0));
		die4.setContentAreaFilled(false);
		paneliZarave.add(die4);
		
		die5 = new JButton();
		die5.setIcon(die5Image);
		die5.addActionListener(new ChangeColor());
		die5.setBorderPainted(false);
		die5.setBorder(null);
		die5.setMargin(new Insets(0, 0, 0, 0));
		die5.setContentAreaFilled(false);
		paneliZarave.add(die5);
		
		cp.add(paneliZarave);
		
		//inicializimi i panelit te tabeles
		paneliTabeles = new JPanel();
		paneliTabeles.setBackground(Color.YELLOW);
		paneliTabeles.setBounds(300, 0, 415, 500);
		cp.add(paneliTabeles);
		paneliTabeles.setLayout(null);
		
		//inicializimi i tabeles
		table = new JTable();
		table.setBounds(10, 27, 400, 391);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setRowHeight(23);
		table.setPreferredSize(new Dimension(400, 380));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		paneliTabeles.add(table);
		
		
		//inicializimi i panelit te mesazheve ne fund te programit
		paneliMesazheve = new JPanel();
		paneliMesazheve.setBackground(Color.WHITE);
		paneliMesazheve.setBounds(0, 500, 900, 600);
		bottomLabel = new JLabel("Messages");
		bottomLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		bottomLabel.setSize(500, 50);
		bottomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		paneliMesazheve.add(bottomLabel);	
		
		cp.add(paneliMesazheve);
		 
		//paneli i kategorive
		paneliKategorive = new JPanel();
		paneliKategorive.setBounds(720, 26, 164, 474);
		getContentPane().add(paneliKategorive);
		paneliKategorive.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		paneliKategorive.setAlignmentX(Component.LEFT_ALIGNMENT);
		paneliKategorive.setBackground(Color.GREEN);
		paneliKategorive.setLayout (new BoxLayout(paneliKategorive, BoxLayout.Y_AXIS));
		
		
		//Krijimi i grupit te butonave
		ButtonGroup group = new ButtonGroup();
				
		//Inicializimi i kategorive radioButton
		rdbKategoria1 = new JRadioButton("Njësha");
		rdbKategoria1.setBackground(Color.GREEN);
		rdbKategoria1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria2 = new JRadioButton("Dysha");
		rdbKategoria2.setBackground(Color.GREEN);
		rdbKategoria2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria3 = new JRadioButton("Tresha");
		rdbKategoria3.setBackground(Color.GREEN);
		rdbKategoria3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria4 = new JRadioButton("Katra");
		rdbKategoria4.setBackground(Color.GREEN);
		rdbKategoria4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria5 = new JRadioButton("Pesa");
		rdbKategoria5.setBackground(Color.GREEN);
		rdbKategoria5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria6 = new JRadioButton("Gjashta");
		rdbKategoria6.setBackground(Color.GREEN);
		rdbKategoria6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria7 = new JRadioButton("Tre me nje vlerë");
		rdbKategoria7.setBackground(Color.GREEN);
		rdbKategoria7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria8 = new JRadioButton("Katër me një vlerë");
		rdbKategoria8.setBackground(Color.GREEN);
		rdbKategoria8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria9 = new JRadioButton("Tre dhe dy");
		rdbKategoria9.setBackground(Color.GREEN);
		rdbKategoria9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria10 = new JRadioButton("Katër të njëpasnjëshme");
		rdbKategoria10.setBackground(Color.GREEN);
		rdbKategoria10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria11 = new JRadioButton("Pesë të njëpasnjëshme");
		rdbKategoria11.setBackground(Color.GREEN);
		rdbKategoria11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria12 = new JRadioButton("E njëjta vlerë");
		rdbKategoria12.setBackground(Color.GREEN);
		rdbKategoria12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbKategoria13 = new JRadioButton("Çdo rast");
		rdbKategoria13.setBackground(Color.GREEN);
		rdbKategoria13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		//shtimi i jradiobutton tek groupButton
		group.add(rdbKategoria1);
		group.add(rdbKategoria2);
		group.add(rdbKategoria3);
		group.add(rdbKategoria4);
		group.add(rdbKategoria5);
		group.add(rdbKategoria6);
		group.add(rdbKategoria7);
		group.add(rdbKategoria8);
		group.add(rdbKategoria9);
		group.add(rdbKategoria10);
		group.add(rdbKategoria11);
		group.add(rdbKategoria12);
		group.add(rdbKategoria13);
		paneliKategorive.add(rdbKategoria1);
		paneliKategorive.add(rdbKategoria2);
		paneliKategorive.add(rdbKategoria3);
		paneliKategorive.add(rdbKategoria4);
		paneliKategorive.add(rdbKategoria5);
		paneliKategorive.add(rdbKategoria6);
		JRadioButton radioButton = new JRadioButton("Pikët e sipërme");
		radioButton.setBackground(Color.GREEN);
		radioButton.setForeground(Color.BLACK);
		radioButton.setEnabled(false);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paneliKategorive.add(radioButton);
		JRadioButton radioButton_1 = new JRadioButton("Pikët bonus");
		radioButton_1.setBackground(Color.GREEN);
		radioButton_1.setForeground(Color.BLACK);
		radioButton_1.setEnabled(false);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paneliKategorive.add(radioButton_1);
		paneliKategorive.add(rdbKategoria7);
		paneliKategorive.add(rdbKategoria8);
		paneliKategorive.add(rdbKategoria9);
		paneliKategorive.add(rdbKategoria10);
		paneliKategorive.add(rdbKategoria11);
		paneliKategorive.add(rdbKategoria12);
		paneliKategorive.add(rdbKategoria13);
		JRadioButton radioButton_2 = new JRadioButton("Pikët e poshtme");
		radioButton_2.setBackground(Color.GREEN);
		radioButton_2.setForeground(Color.BLACK);
		radioButton_2.setEnabled(false);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paneliKategorive.add(radioButton_2);
		JRadioButton radioButton_3 = new JRadioButton("Totali");
		radioButton_3.setForeground(Color.BLACK);
		radioButton_3.setEnabled(false);
		radioButton_3.setBackground(Color.GREEN);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		paneliKategorive.add(radioButton_3);
			
		
		//perdoret per ti dhene nje vlere figurave
		die1Image.setDescription("1");
		die2Image.setDescription("2");
		die3Image.setDescription("3");
		die4Image.setDescription("4");
		die5Image.setDescription("5");
		die5Image.setDescription("6");
				
		//butoni llogarit
		btnLlogarit = new JButton("Llogarit");
		btnLlogarit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playersNumber = FirstFrame.numberOfPlayers;//get number of players from FirstFrame class
				DiceValue[0] = Integer.parseInt(((ImageIcon)die1.getIcon()).getDescription());//merret konfigurimi i zarave
				DiceValue[1] = Integer.parseInt(((ImageIcon)die2.getIcon()).getDescription());
				DiceValue[2] = Integer.parseInt(((ImageIcon)die3.getIcon()).getDescription());
				DiceValue[3] = Integer.parseInt(((ImageIcon)die4.getIcon()).getDescription());
				DiceValue[4] = Integer.parseInt(((ImageIcon)die5.getIcon()).getDescription());
						
				bottomLabel.setText("Messages");
			
				if(group.getSelection() != null) {
					group.getSelection().setEnabled(false);
					group.clearSelection();}
				else
					bottomLabel.setText("Ju lutem zgjidhni nje kategori!");
				}
			});

		paneliKategorive.add(btnLlogarit);
		
		//frame properties
		setTitle("Die Mania");
		setResizable(false);
		cp.setLayout(null);
		setBounds(200, 100, 900, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end of constructor
	
	
	private class ChangeColor implements ActionListener{
		@Override 
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == die1) {
				if(die1.getIcon() == die1Image)
					die1.setIcon(die1ImageInverted);
				else 
					die1.setIcon(die1Image);
			}
			else if(e.getSource() == die2) {
				if(die2.getIcon() == die2Image)
					die2.setIcon(die2ImageInverted);
				else 
					die2.setIcon(die2Image);
			}
			else if(e.getSource() == die3) {
				if(die3.getIcon() == die3Image)
					die3.setIcon(die3ImageInverted);
				else 
					die3.setIcon(die3Image);
			}
			else if(e.getSource() == die4) {
				if(die4.getIcon() == die4Image)
					die4.setIcon(die4ImageInverted);
				else 
					die4.setIcon(die4Image);
			}
			else if(e.getSource() == die5) {	
				if(die5.getIcon() == die5Image)
					die5.setIcon(die5ImageInverted);
				else 
					die5.setIcon(die5Image);
			}
				
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new FirstFrame();
					}
					catch(Exception e) {}
			}
		});
	}
}
