import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FirstFrame extends JFrame{
	private JPanel panelNumberOfPlayers;
	private JTextField txtPlayersNumber;
	private JTextField txtPlayer1;
	private JButton btnRregjistrohu1;
	private JTextField txtPlayer2;
	private JButton btnRregjistrohu2;
	private JTextField txtPlayer3;
	private JTextField txtPlayer4;
	private JButton btnRregjistrohu3;
	private JButton btnRregjistrohu4;
	private JButton btnVazhdo;
	public static int numberOfPlayers;//deklaruar static qe ta perdorim si variabel global
	private JPanel pnlErrorMessage;
	private JLabel lblErrorMessage;
	public String strPlayer1;// do te perdoren per te kopjuar te dhenat nga textfield per player
	public String strPlayer2;
	public String strPlayer3;
	public String strPlayer4;
	public int Player1Points;//keto variabla do marrin piket finale nga tabela e pikeve. Dmth piket totale ne fund te lojes
	public int Player2Points;//do te perdoren per te ruajtur piket perfundimtare te lojtareve ne databaze 
	public int Player3Points;
	public int Player4Points;
	//private JPanel panel[] = new JPanel[4];//panelet qe permbajne fushat e lojtareve
	private JButton btnFilloLojen;
	private JPanel panel_0, panel_1, panel_2, panel_3; 
	private JTextField txtMosha1;
	private JTextField txtMosha2;
	private JTextField txtMosha3;
	private JTextField txtMosha4;
	private JButton btnDil;
	
	/*
	 * Ceshtje per diskutim: duhet te lejohet perdoruesi te ndryshoj numrin e lojtareve ne fillim te lojes?
	 * emri programit duhet diskutuar
	 * 
	 * 
	 * Detyra per Gersin: Hidh te dhenat e fushes se emrit te lojtarit dhe moshes ne databaze.
	 * Mos lejo te shtypet butoni Luaj nqs nuk jane plotesuar te gjitha fushat e emrit dhe moshes.
	 * Kur mbaron loja shto piket finale te tabeles tek databaza.
	 * Shto te dhenat ne databaze vetem per lojtare sa variabli numberOfPlayers. Dmth mos shto gjithmone te dhena per 4 lojtare ne databaze.
	 */
	
	FirstFrame(){
		
		Container cp = getContentPane();//get content pane. Pjesa e frames qe mund te modifikohet
		
		
		panelNumberOfPlayers = new JPanel();//paneli blu ku kerkohet nr i lojtareve
		panelNumberOfPlayers.setBounds(240, 151, 437, 38);
		panelNumberOfPlayers.setBackground(Color.CYAN);
		
		cp.add(panelNumberOfPlayers);//shto panelin tek content pane
		panelNumberOfPlayers.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panelNumberOfPlayers.add(new JLabel("Shkruani numrin e lojtareve:"));
		
		txtPlayersNumber = new JTextField(null, 4);
		panelNumberOfPlayers.add(txtPlayersNumber);
		txtPlayersNumber.setColumns(5);
		
		btnVazhdo = new JButton("Vazhdo");
		btnVazhdo.addActionListener(new ActionListener() {//veprimet qe ndodhin kur shtypet butoni Vazhdo
			public void actionPerformed(ActionEvent evt) {
				//pnlErrorMessage.setVisible(false);//deklaro te gjithe panelet invisible sa here qe shtypet vazhdo.
				//for(int i = 0; i < 4; i++)// Ne varesi te inputit percakto cilet panele behen visible
				//	panel[i].setVisible(false);
				numberOfPlayers = Integer.parseInt(txtPlayersNumber.getText());
				//if(numberOfPlayers > 4 || numberOfPlayers < 1) {
				//	pnlErrorMessage.setVisible(true);
				//}
				//else
				//	for(int i = 0; i < numberOfPlayers; i++)
				//		panel[i].setVisible(true);
			}
		});
		
		panelNumberOfPlayers.add(btnVazhdo);
		panel_0 = new JPanel();
		panel_0.setBounds(240, 200, 437, 38);
		panel_0.setBackground(Color.red);
		panel_0.setVisible(true);
		cp.add(panel_0);
		panel_0.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_0.add(new JLabel("Player1"));
		
		txtPlayer1 = new JTextField();
		panel_0.add(txtPlayer1);
		txtPlayer1.setColumns(10);
		
		btnRregjistrohu1 = new JButton("Rregjistohu");
		btnRregjistrohu1.addActionListener(new ActionListener() {//veprimet qe ndodhin kur shtypet butoni Rregjistrohu per lojtarin 1
			public void actionPerformed(ActionEvent e) {
				strPlayer1 = txtPlayer1.getText();
			}
		});
		
		
		panel_0.add(new JLabel("Player1Mosha"));
		
		txtMosha1 = new JTextField();
		panel_0.add(txtMosha1);
		txtMosha1.setColumns(4);
		panel_0.add(btnRregjistrohu1);
		
		cp.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(240, 249, 437, 38);
		panel_1.setVisible(true);
		cp.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_1.add(new JLabel("Player2"));
		
		txtPlayer2 = new JTextField();
		panel_1.add(txtPlayer2);
		txtPlayer2.setColumns(10);
		
		btnRregjistrohu2 = new JButton("Rregjistohu");
		btnRregjistrohu2.addActionListener(new ActionListener() {//veprimet qe ndodhin kur shtypet butoni btnRregjistrohu2
			public void actionPerformed(ActionEvent e) {
				strPlayer2 = txtPlayer2.getText();
			}
		});
		
		panel_1.add(new JLabel("Player2Mosha"));
		
		txtMosha2 = new JTextField();
		panel_1.add(txtMosha2);
		txtMosha2.setColumns(4);
		panel_1.add(btnRregjistrohu2);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(240, 298, 437, 38);
		panel_2.setVisible(true);
		cp.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_2.add(new JLabel("Player3"));
		
		txtPlayer3 = new JTextField();
		panel_2.add(txtPlayer3);
		txtPlayer3.setColumns(10);
		
		btnRregjistrohu3 = new JButton("Rregjistohu");
		btnRregjistrohu3.addActionListener(new ActionListener() {//veprimet qe ndodhin kur shtypet butoni btnRregjistrohu3
			public void actionPerformed(ActionEvent e) {
				strPlayer3 = txtPlayer3.getText();
			}
		});
		

		panel_2.add(new JLabel("Player3Mosha"));
		
		txtMosha3 = new JTextField();
		panel_2.add(txtMosha3);
		txtMosha3.setColumns(4);
		panel_2.add(btnRregjistrohu3);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.RED);
		panel_3.setBounds(240, 347, 437, 38);
		panel_3.setVisible(true);
		cp.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_3.add(new JLabel("Player4"));
		
		txtPlayer4 = new JTextField();
		panel_3.add(txtPlayer4);
		txtPlayer4.setColumns(10);
		
		btnRregjistrohu4 = new JButton("Rregjistohu");
		btnRregjistrohu4.addActionListener(new ActionListener() {//veprimet qe ndodhin kur shtypet butoni btnRregjistrohu4
			public void actionPerformed(ActionEvent e) {
				strPlayer4 = txtPlayer4.getText();
			}
		});
		
		panel_3.add(new JLabel("Player4Mosha"));
		
		txtMosha4 = new JTextField();
		panel_3.add(txtMosha4);
		txtMosha4.setColumns(4);
		panel_3.add(btnRregjistrohu4);
		
		pnlErrorMessage = new JPanel();
		pnlErrorMessage.setAlignmentY(Component.TOP_ALIGNMENT);
		pnlErrorMessage.setAlignmentX(Component.RIGHT_ALIGNMENT);
		pnlErrorMessage.setBackground(Color.RED);
		pnlErrorMessage.setBounds(240, 109, 437, 31);
		pnlErrorMessage.setVisible(true);
		cp.add(pnlErrorMessage);
		pnlErrorMessage.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblErrorMessage = new JLabel("Kujdes! Numri i lejuar i lojtareve eshte 1 deri ne 4. Ju lutem shkruani nje numer tjeter.");
		lblErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pnlErrorMessage.add(lblErrorMessage);
		
		btnFilloLojen = new JButton("Fillo lojen");
		btnFilloLojen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame();
				dispose();
			}
		});
		
		btnFilloLojen.setBounds(348, 396, 89, 23);
		getContentPane().add(btnFilloLojen);
		
		btnDil = new JButton("Dil");
		btnDil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
		btnDil.setBounds(469, 397, 89, 23);
		getContentPane().add(btnDil);
		
		
		
		setTitle("Die Mania");
		setResizable(false);
		setBounds(200, 100, 900, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
