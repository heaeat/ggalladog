package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import character.Player;
import character.Unit1;
import character.Unit2;
import character.Unit3;
import character.Unit4;
import character.Unit5;
import character.Unit6;
import character.UnitControl;

public class AdminPanel extends JPanel {

	Font font = new Font("맑은 고딕", Font.BOLD, 30);
	Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
	Font font3 = new Font("맑은 고딕", Font.PLAIN, 15);
	Font font4 = new Font("맑은 고딕", Font.PLAIN, 20);

	private JLabel playerlb;
	private JPanel playerbgd;
	private JLabel unitlb;
	private JPanel unitbgd;
	private JLabel moneylb;
	private JButton unit1bt;
	private JButton unit2bt;
	private JButton unit3bt;
	private JButton unit4bt;
	private JButton unit5bt;
	private JButton unit6bt;
	private JButton hpbt;
	private JButton skillbt;
	private JButton mprcvbt;
	private JButton mpbt;
	private JButton backbt;
	private JButton homebt;
	private JButton upgradebt;
	private JTextField moneyfd;
	private JTextArea text;
	private JScrollPane scroll;
	private JPanel fieldbgd;

	private Controller F;
	private Manage m = new Manage();
	private int check;

	UnitControl uc = null;
	private Unit1 unit1 = new Unit1();
	private Unit2 unit2 = new Unit2();
	private Unit3 unit3 = new Unit3();
	private Unit4 unit4 = new Unit4();
	private Unit5 unit5 = new Unit5();
	private Unit6 unit6 = new Unit6();

	private Player player = new Player();

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public AdminPanel(Controller f) {

		setLayout(null);
		F = f;

		// find=new FindWord();

		playerlb = new JLabel("Player");
		playerlb.setFont(font);
		playerlb.setBounds(0, 80, 200, 50);
		playerlb.setHorizontalAlignment(JLabel.CENTER);
		add(playerlb);

		playerbgd = new JPanel();
		playerbgd.setBounds(20, 75, 370, 265);
		playerbgd.setBackground(Color.YELLOW);

		unitlb = new JLabel("Unit");
		unitlb.setFont(font);
		unitlb.setBounds(350, 80, 200, 50);
		unitlb.setHorizontalAlignment(JLabel.CENTER);
		add(unitlb);

		unitbgd = new JPanel();
		unitbgd.setBounds(400, 75, 370, 265);
		unitbgd.setBackground(Color.green);

		hpbt = new JButton("HP");
		hpbt.setFont(font2);
		hpbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(7);
				text.setText("<Player> \r\nHP : " + player.getPlayerHP()
						+ "\r\n$ : "
						+ m.getUpgradePrice(player.getPlayerLevel(0), check));

			}
		});
		hpbt.setBounds(50, 150, 140, 50);
		add(hpbt);

		skillbt = new JButton("Skill");
		skillbt.setFont(font2);
		skillbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(8);
				text.setText("<Player> \r\nSkillPower : "
						+ player.getSkillPower() + "\r\n" + "SkillRange : "
						+ player.getSkillRange() + "\r\n" + "SkillCool : "
						+ player.getSkillCool() + "초\r\n" + "\r\n$ : "
						+ m.getUpgradePrice(player.getPlayerLevel(1), check));

			}
		});
		skillbt.setBounds(220, 150, 140, 50);
		add(skillbt);

		mpbt = new JButton("MP");
		mpbt.setFont(font2);
		mpbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				setCheck(9);
				text.setText("<Player> \r\nMP : " + player.getPlayerMP()
						+ "\r\n$ : "
						+ m.getUpgradePrice(player.getPlayerLevel(2), check));

			}
		});
		mpbt.setBounds(50, 230, 140, 50);
		add(mpbt);

		mprcvbt = new JButton("MP 회복량");
		mprcvbt.setFont(font2);
		mprcvbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(10);
				text.setText("<Player> \r\nMP Recover : "
						+ player.getRecoverMP() + "/s" + "\r\n$ : "
						+ m.getUpgradePrice(player.getPlayerLevel(3), check));

			}
		});
		mprcvbt.setBounds(220, 230, 140, 50);
		add(mprcvbt);

		unit1bt = new JButton("Unit1");
		unit1bt.setFont(font2);
		unit1bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(1);
				uc = unit1;
				if(uc.getUnitLevel() < 4){
					text.setText("<" + uc.getUnitName() + ">\r\n" + "HP : "
							+ uc.getUnitHp() + "\r\n" + "Power : "
							+ uc.getUnitPower() + "\r\n$ : "
							+ m.getUpgradePrice(uc.getUnitLevel(), check));
				}else{
					text.setText("<" + uc.getUnitName() + "> MAX\r\n" + "HP : "
							+ uc.getUnitHp() + "\r\n" + "Power : "
							+ uc.getUnitPower());
				}
				

			}
		});
		unit1bt.setBounds(420, 150, 90, 50);
		add(unit1bt);

		unit2bt = new JButton("Unit2");
		unit2bt.setFont(font2);
		unit2bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(2);
				uc = unit2;
				text.setText("<" + uc.getUnitName() + ">\r\n" + "HP : "
						+ uc.getUnitHp() + "\r\n" + "Power : "
						+ uc.getUnitPower() + "\r\n$ : "
						+ m.getUpgradePrice(uc.getUnitLevel(), check));

			}
		});
		unit2bt.setBounds(540, 150, 90, 50);
		add(unit2bt);

		unit3bt = new JButton("Unit3");
		unit3bt.setFont(font2);
		unit3bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(3);
				uc = unit3;
				text.setText("<" + uc.getUnitName() + ">\r\n" + "HP : "
						+ uc.getUnitHp() + "\r\n" + "Power : "
						+ uc.getUnitPower() + "\r\n$ : "
						+ m.getUpgradePrice(uc.getUnitLevel(), check));

			}
		});
		unit3bt.setBounds(660, 150, 90, 50);
		add(unit3bt);

		unit4bt = new JButton("Unit4");
		unit4bt.setFont(font2);
		unit4bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(4);
				uc = unit4;
				text.setText("<" + uc.getUnitName() + ">\r\n" + "HP : "
						+ uc.getUnitHp() + "\r\n" + "Power : "
						+ uc.getUnitPower() + "\r\n$ : "
						+ m.getUpgradePrice(uc.getUnitLevel(), check));

			}
		});
		unit4bt.setBounds(420, 230, 90, 50);
		add(unit4bt);

		unit5bt = new JButton("Unit5");
		unit5bt.setFont(font2);
		unit5bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(5);
				uc = unit5;
				text.setText("<" + uc.getUnitName() + ">\r\n" + "HP : "
						+ uc.getUnitHp() + "\r\n" + "Power : "
						+ uc.getUnitPower() + "\r\n$ : "
						+ m.getUpgradePrice(uc.getUnitLevel(), check));

			}
		});
		unit5bt.setBounds(540, 230, 90, 50);
		add(unit5bt);

		unit6bt = new JButton("Unit6");
		unit6bt.setFont(font2);
		unit6bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCheck(6);
				uc = unit6;
				text.setText("<" + uc.getUnitName() + ">\r\n" + "HP : "
						+ uc.getUnitHp() + "\r\n" + "Power : "
						+ uc.getUnitPower() + "\r\n$ : "
						+ m.getUpgradePrice(uc.getUnitLevel(), check));

			}
		});
		unit6bt.setBounds(660, 230, 90, 50);
		add(unit6bt);

		this.add(playerbgd, BorderLayout.WEST);
		this.add(unitbgd, BorderLayout.WEST);

		homebt = new JButton("Home");
		homebt.setFont(font3);
		homebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				F.home();
			}
		});
		homebt.setBounds(690, 30, 80, 30);
		add(homebt);

		backbt = new JButton("Back");
		backbt.setFont(font3);
		backbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				F.back();
			}
		});
		backbt.setBounds(580, 30, 80, 30);
		add(backbt);

		upgradebt = new JButton("Upgrade");
		upgradebt.setFont(font2);
		upgradebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if ((check > 0 && check < 7 && player.getMoney() >= m.getUpgradePrice(
						uc.getUnitLevel(), check))
						|| (player.getMoney() >= m.getUpgradePrice(
								player.getPlayerLevel(check - 7), check)
								&& check < 11 && check > 6)) {

					switch (getCheck()) {
					case 1:
						if(uc.getUnitLevel() < 4){
						uc = unit1;
						uc.setUnitHp(uc.getUnitHp()
								+ m.getPlusUnitHP(uc.getUnitLevel()));
						uc.setUnitPower(uc.getUnitPower()
								+ m.getPlusUnitPower(uc.getUnitLevel()));
						text.setText("<"+ uc.getUnitName()+ ">\r\n"
								+ "HP : "+ uc.getUnitHp()+ "\r\n"
								+ "Power : "+ uc.getUnitPower()
								+ "\r\n$ : "+ m.getUpgradePrice(uc.getUnitLevel() + 1,check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(uc.getUnitLevel(), check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						uc.setUnitLevel(uc.getUnitLevel() + 1);
						}else{
							text.setText("<" + uc.getUnitName() + "> MAX\r\n" + "HP : "
									+ uc.getUnitHp() + "\r\n" + "Power : "
									+ uc.getUnitPower());
						}
						break;

					case 2:
						uc = unit2;
						uc.setUnitHp(uc.getUnitHp()
								+ m.getPlusUnitHP(uc.getUnitLevel()));
						uc.setUnitPower(uc.getUnitPower()
								+ m.getPlusUnitPower(uc.getUnitLevel()));
						text.setText("<"+ uc.getUnitName()+ ">\r\n"
								+ "HP : "+ uc.getUnitHp()+ "\r\n"
								+ "Power : "+ uc.getUnitPower()
								+ "\r\n$ : "+ m.getUpgradePrice(uc.getUnitLevel() + 1,check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(uc.getUnitLevel(), check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						uc.setUnitLevel(uc.getUnitLevel() + 1);
						break;

					case 3:
						uc = unit3;
						uc.setUnitHp(uc.getUnitHp()
								+ m.getPlusUnitHP(uc.getUnitLevel()));
						uc.setUnitPower(uc.getUnitPower()
								+ m.getPlusUnitPower(uc.getUnitLevel()));
						text.setText("<"+ uc.getUnitName()+ ">\r\n"
								+ "HP : "+ uc.getUnitHp()+ "\r\n"
								+ "Power : "+ uc.getUnitPower()
								+ "\r\n$ : "+ m.getUpgradePrice(uc.getUnitLevel() + 1,check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(uc.getUnitLevel(), check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						uc.setUnitLevel(uc.getUnitLevel() + 1);
						break;

					case 4:
						uc = unit4;
						uc.setUnitHp(uc.getUnitHp()
								+ m.getPlusUnitHP(uc.getUnitLevel()));
						uc.setUnitPower(uc.getUnitPower()
								+ m.getPlusUnitPower(uc.getUnitLevel()));
						text.setText("<"+ uc.getUnitName()+ ">\r\n"
								+ "HP : "+ uc.getUnitHp()+ "\r\n"
								+ "Power : "+ uc.getUnitPower()
								+ "\r\n$ : "+ m.getUpgradePrice(uc.getUnitLevel() + 1,check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(uc.getUnitLevel(), check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						uc.setUnitLevel(uc.getUnitLevel() + 1);
						break;

					case 5:
						uc = unit5;
						uc.setUnitHp(uc.getUnitHp()
								+ m.getPlusUnitHP(uc.getUnitLevel()));
						uc.setUnitPower(uc.getUnitPower()
								+ m.getPlusUnitPower(uc.getUnitLevel()));
						text.setText("<"+ uc.getUnitName()+ ">\r\n"
								+ "HP : "+ uc.getUnitHp()+ "\r\n"
								+ "Power : "+ uc.getUnitPower()	+ "\r\n"
								+"$ : "	+ m.getUpgradePrice(uc.getUnitLevel() + 1,check));
						player.setMoney(player.getMoney() - m.getUpgradePrice(uc.getUnitLevel(), check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						uc.setUnitLevel(uc.getUnitLevel() + 1);
						break;

					case 6:
						uc = unit6;
						uc.setUnitHp(uc.getUnitHp()
								+ m.getPlusUnitHP(uc.getUnitLevel()));
						uc.setUnitPower(uc.getUnitPower()
								+ m.getPlusUnitPower(uc.getUnitLevel()));
						text.setText("<"+ uc.getUnitName()+ ">\r\n"
								+ "HP : "+ uc.getUnitHp()+ "\r\n"
								+ "Power : "+ uc.getUnitPower()	+ "\r\n"
								+"$ : "	+ m.getUpgradePrice(uc.getUnitLevel() + 1,check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(uc.getUnitLevel(), check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						uc.setUnitLevel(uc.getUnitLevel() + 1);
						break;

					case 7:
						player.setPlayerHP(player.getPlayerHP()
								+ m.getPlusPlayerHP(player.getPlayerLevel(0)));
						text.setText("<Player> \r\nHP : "+ player.getPlayerHP()	+ "\r\n"
								+"$ : "	+ m.getUpgradePrice(player.getPlayerLevel(0) + 1, check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(player.getPlayerLevel(0),check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						player.setPlayerLevel(0, player.getPlayerLevel(0) + 1);
						break;

					case 8:
						player.setSkillCool(player.getSkillCool()
								- m.getPlusSkill(player.getPlayerLevel(1)) * 4);
						player.setSkillPower(player.getSkillPower()
								+ m.getPlusSkill(player.getPlayerLevel(1)) * 5);
						player.setSkillRange(player.getSkillRange()
								+ m.getPlusSkill(player.getPlayerLevel(1)) + 7);
						text.setText("<Player> \r\nSkillPower : "+ player.getSkillPower()+ "\r\n"
								+ "SkillRange : "	+ player.getSkillRange()+ "\r\n"+ 
								"SkillCool : "	+ player.getSkillCool()	+ "초\r\n"
								+ "\r\n$ : "+ m.getUpgradePrice(player.getPlayerLevel(1) + 1, check));
						player.setMoney(player.getMoney()
								- m.getUpgradePrice(player.getPlayerLevel(1),
										check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						player.setPlayerLevel(1, player.getPlayerLevel(1) + 1);

						break;

					case 9:
						player.setPlayerMP(player.getPlayerMP()
								+ m.getPlusPlayerMP(player.getPlayerLevel(2)));
						text.setText("<Player> \r\nMP : "+ player.getPlayerMP()
								+ "\r\n$ : "+ m.getUpgradePrice(player.getPlayerLevel(2) + 1, check));
						player.setMoney(player.getMoney()- m.getUpgradePrice(player.getPlayerLevel(2),
										check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						player.setPlayerLevel(2, player.getPlayerLevel(2) + 1);
						break;

					case 10:
						player.setRecoverMP(player.getRecoverMP()
								+ m.getPlusRecMP(player.getPlayerLevel(3)));
						text.setText("<Player> \r\nMP Recover : " + player.getRecoverMP() + "/s"
								+ "\r\n$ : "+ m.getUpgradePrice(player.getPlayerLevel(2) + 1, check));
						player.setMoney(player.getMoney()
								- m.getUpgradePrice(player.getPlayerLevel(3),
										check));
						moneyfd.setText(Integer.toString(player.getMoney()));
						player.setPlayerLevel(3, player.getPlayerLevel(3) + 1);
						break;

					default:
						text.setText("Unit 또는 Player 정보를 선택하십시오");
						break;

					}

				} else {
					text.setText("소지금이 부족함니다ㅠ_ㅠ");
				}

			}
		});
		upgradebt.setBounds(610, 480, 150, 40);
		add(upgradebt);

		moneylb = new JLabel("현재 소지금");
		moneylb.setFont(font3);
		moneylb.setBounds(610, 360, 150, 40);
		moneylb.setHorizontalAlignment(JLabel.LEFT);
		add(moneylb);

		moneyfd = new JTextField();
		moneyfd.setText(Integer.toString(player.getMoney()));
		moneyfd.setFont(font4);
		moneyfd.setBounds(610, 400, 150, 40);
		add(moneyfd);

		text = new JTextArea("", 10, 50);
		// text.setBounds(0, 0, 570, 150);
		text.setText("");

		scroll = new JScrollPane();
		scroll.setViewportView(text);

		fieldbgd = new JPanel();
		fieldbgd.setBounds(20, 350, 750, 190);
		fieldbgd.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
		fieldbgd.setBackground(Color.LIGHT_GRAY);
		fieldbgd.add(text);

		this.add(fieldbgd, BorderLayout.WEST);

		setVisible(true);
	}
}
