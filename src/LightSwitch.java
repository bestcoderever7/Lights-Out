import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LightSwitch implements ActionListener, KeyListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	JButton b12 = new JButton();
	JButton b13 = new JButton();
	JButton b14 = new JButton();
	JButton b15 = new JButton();
	JButton b16 = new JButton();
	JButton b17 = new JButton();
	JButton b18 = new JButton();
	JButton b19 = new JButton();
	JButton b20 = new JButton();
	JButton b21 = new JButton();
	JButton b22 = new JButton();
	JButton b23 = new JButton();
	JButton b24 = new JButton();
	JButton b25 = new JButton();
	JLabel l = new JLabel();
	JLabel l2 = new JLabel();
	int pointsearned = 100;
	int score = 0;
	public int level = 0;
	int debugMode = 0;
	int levelSelect = 0;
	RandomGenerator rg = new RandomGenerator(this);

	public LightSwitch() {
		debugMode = 0;
		System.out.println("Resetting debugMode");
		System.out.println("YEAH!!");
		f.setVisible(true);
		f.setTitle("Lights Out");
		f.setSize(300, 225);
		l.setText("Score: " + score);
		l2.setText("Level " + level);
		f.add(p);
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		p.add(b17);
		p.add(b18);
		p.add(b19);
		p.add(b20);
		p.add(b21);
		p.add(b22);
		p.add(b23);
		p.add(b24);
		p.add(b25);
		p.add(l2);
		p.add(l);
		b.setBackground(Color.BLACK);
		b2.setBackground(Color.BLACK);
		b3.setBackground(Color.BLACK);
		b4.setBackground(Color.BLACK);
		b5.setBackground(Color.BLACK);
		b6.setBackground(Color.BLACK);
		b7.setBackground(Color.BLACK);
		b8.setBackground(Color.BLACK);
		b9.setBackground(Color.BLACK);
		b10.setBackground(Color.BLACK);
		b11.setBackground(Color.BLACK);
		b12.setBackground(Color.BLACK);
		b13.setBackground(Color.BLACK);
		b14.setBackground(Color.BLACK);
		b15.setBackground(Color.BLACK);
		b16.setBackground(Color.BLACK);
		b17.setBackground(Color.BLACK);
		b18.setBackground(Color.BLACK);
		b19.setBackground(Color.BLACK);
		b20.setBackground(Color.BLACK);
		b21.setBackground(Color.BLACK);
		b22.setBackground(Color.BLACK);
		b23.setBackground(Color.BLACK);
		b24.setBackground(Color.BLACK);
		b25.setBackground(Color.BLACK);
		rg.generate0();
		f.addKeyListener(this);
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b.setText("    ");
		b2.setText("    ");
		b3.setText("    ");
		b4.setText("    ");
		b5.setText("    ");
		b6.setText("    ");
		b7.setText("    ");
		b8.setText("    ");
		b9.setText("    ");
		b10.setText("    ");
		b11.setText("    ");
		b12.setText("    ");
		b13.setText("    ");
		b14.setText("    ");
		b15.setText("    ");
		b16.setText("    ");
		b17.setText("    ");
		b18.setText("    ");
		b19.setText("    ");
		b20.setText("    ");
		b21.setText("    ");
		b22.setText("    ");
		b23.setText("    ");
		b24.setText("    ");
		b25.setText("    ");
	}

	public JButton getB() {
		return b;
	}

	public void setB(JButton b) {
		this.b = b;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	public JButton getB4() {
		return b4;
	}

	public void setB4(JButton b4) {
		this.b4 = b4;
	}

	public JButton getB5() {
		return b5;
	}

	public void setB5(JButton b5) {
		this.b5 = b5;
	}

	public JButton getB6() {
		return b6;
	}

	public void setB6(JButton b6) {
		this.b6 = b6;
	}

	public JButton getB7() {
		return b7;
	}

	public void setB7(JButton b7) {
		this.b7 = b7;
	}

	public JButton getB8() {
		return b8;
	}

	public void setB8(JButton b8) {
		this.b8 = b8;
	}

	public JButton getB9() {
		return b9;
	}

	public void setB9(JButton b9) {
		this.b9 = b9;
	}

	public JButton getB10() {
		return b10;
	}

	public void setB10(JButton b10) {
		this.b10 = b10;
	}

	public JButton getB11() {
		return b11;
	}

	public void setB11(JButton b11) {
		this.b11 = b11;
	}

	public JButton getB12() {
		return b12;
	}

	public void setB12(JButton b12) {
		this.b12 = b12;
	}

	public JButton getB13() {
		return b13;
	}

	public void setB13(JButton b13) {
		this.b13 = b13;
	}

	public JButton getB14() {
		return b14;
	}

	public void setB14(JButton b14) {
		this.b14 = b14;
	}

	public JButton getB15() {
		return b15;
	}

	public void setB15(JButton b15) {
		this.b15 = b15;
	}

	public JButton getB16() {
		return b16;
	}

	public void setB16(JButton b16) {
		this.b16 = b16;
	}

	public JButton getB17() {
		return b17;
	}

	public void setB17(JButton b17) {
		this.b17 = b17;
	}

	public JButton getB18() {
		return b18;
	}

	public void setB18(JButton b18) {
		this.b18 = b18;
	}

	public JButton getB19() {
		return b19;
	}

	public void setB19(JButton b19) {
		this.b19 = b19;
	}

	public JButton getB20() {
		return b20;
	}

	public void setB20(JButton b20) {
		this.b20 = b20;
	}

	public JButton getB21() {
		return b21;
	}

	public void setB21(JButton b21) {
		this.b21 = b21;
	}

	public JButton getB22() {
		return b22;
	}

	public void setB22(JButton b22) {
		this.b22 = b22;
	}

	public JButton getB23() {
		return b23;
	}

	public void setB23(JButton b23) {
		this.b23 = b23;
	}

	public JButton getB24() {
		return b24;
	}

	public void setB24(JButton b24) {
		this.b24 = b24;
	}

	public JButton getB25() {
		return b25;
	}

	public void setB25(JButton b25) {
		this.b25 = b25;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b) {
			corner(b, b2, b6);
		}
		if (e.getSource() == b2) {
			endofarow(b2, b, b3, b7);
		}
		if (e.getSource() == b3) {
			endofarow(b3, b2, b4, b8);
		}
		if (e.getSource() == b4) {
			endofarow(b4, b3, b5, b9);
		}
		if (e.getSource() == b5) {
			corner(b5, b4, b10);
		}
		if (e.getSource() == b6) {
			endofarow(b6, b7, b, b11);
		}
		if (e.getSource() == b7) {
			changecolor(b7, b6, b8, b2, b12);
		}
		if (e.getSource() == b8) {
			changecolor(b8, b9, b7, b3, b13);
		}
		if (e.getSource() == b9) {
			changecolor(b9, b8, b10, b4, b14);
		}
		if (e.getSource() == b10) {
			endofarow(b10, b9, b5, b15);
		}
		if (e.getSource() == b11) {
			endofarow(b11, b12, b6, b16);
		}
		if (e.getSource() == b12) {
			changecolor(b12, b13, b11, b7, b17);
		}
		if (e.getSource() == b13) {
			changecolor(b13, b14, b12, b8, b18);
		}
		if (e.getSource() == b14) {
			changecolor(b14, b15, b13, b9, b19);
		}
		if (e.getSource() == b15) {
			endofarow(b15, b14, b10, b20);
		}
		if (e.getSource() == b16) {
			endofarow(b16, b17, b11, b21);
		}
		if (e.getSource() == b17) {
			changecolor(b17, b16, b18, b12, b22);
		}
		if (e.getSource() == b18) {
			changecolor(b18, b19, b17, b13, b23);
		}
		if (e.getSource() == b19) {
			changecolor(b20, b19, b18, b14, b24);
		}
		if (e.getSource() == b20) {
			endofarow(b20, b19, b25, b15);
		}
		if (e.getSource() == b21) {
			corner(b21, b22, b16);
		}
		if (e.getSource() == b22) {
			endofarow(b22, b21, b23, b17);
		}
		if (e.getSource() == b23) {
			endofarow(b23, b22, b24, b18);
		}
		if (e.getSource() == b24) {
			endofarow(b24, b23, b25, b19);
		}
		if (e.getSource() == b25) {
			corner(b25, b24, b20);
		}
		score--;
		pointsearned--;
		l.setText("Score: " + score);
		if (pointsearned < 1) {
			JOptionPane.showMessageDialog(null, "GAME OVER");
		}
		check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
				b16, b17, b18, b19, b20, b21, b22, b23, b24, b25);
	}

	private void changecolor(JButton button, JButton b2, JButton b3,
			JButton b4, JButton b5) {
		if (button.getBackground() == Color.WHITE) {
			button.setBackground(Color.BLACK);
		} else {
			button.setBackground(Color.WHITE);
		}
		if (b2.getBackground() == Color.WHITE) {
			b2.setBackground(Color.BLACK);
		} else {
			b2.setBackground(Color.WHITE);
		}
		if (b3.getBackground() == Color.WHITE) {
			b3.setBackground(Color.BLACK);
		} else {
			b3.setBackground(Color.WHITE);
		}
		if (b4.getBackground() == Color.WHITE) {
			b4.setBackground(Color.BLACK);
		} else {
			b4.setBackground(Color.WHITE);
		}
		if (b5.getBackground() == Color.WHITE) {
			b5.setBackground(Color.BLACK);
		} else {
			b5.setBackground(Color.WHITE);
		}
	}

	private void endofarow(JButton button, JButton b2, JButton b3, JButton b4) {
		if (button.getBackground() == Color.WHITE) {
			button.setBackground(Color.BLACK);
		} else {
			button.setBackground(Color.WHITE);
		}
		if (b2.getBackground() == Color.WHITE) {
			b2.setBackground(Color.BLACK);
		} else {
			b2.setBackground(Color.WHITE);
		}
		if (b3.getBackground() == Color.WHITE) {
			b3.setBackground(Color.BLACK);
		} else {
			b3.setBackground(Color.WHITE);
		}
		if (b4.getBackground() == Color.WHITE) {
			b4.setBackground(Color.BLACK);
		} else {
			b4.setBackground(Color.WHITE);
		}
	}

	private void corner(JButton button, JButton b2, JButton b3) {
		if (button.getBackground() == Color.WHITE) {
			button.setBackground(Color.BLACK);
		} else {
			button.setBackground(Color.WHITE);
		}
		if (b2.getBackground() == Color.WHITE) {
			b2.setBackground(Color.BLACK);
		} else {
			b2.setBackground(Color.WHITE);
		}
		if (b3.getBackground() == Color.WHITE) {
			b3.setBackground(Color.BLACK);
		} else {
			b3.setBackground(Color.WHITE);
		}
	}

	private void check(JButton b, JButton b2, JButton b3, JButton b4,
			JButton b5, JButton b6, JButton b7, JButton b8, JButton b9,
			JButton b10, JButton b11, JButton b12, JButton b13, JButton b14,
			JButton b15, JButton b16, JButton b17, JButton b18, JButton b19,
			JButton b20, JButton b21, JButton b22, JButton b23, JButton b24,
			JButton b25) {
		if (b.getBackground() == Color.BLACK
				&& b2.getBackground() == Color.BLACK
				&& b3.getBackground() == Color.BLACK
				&& b4.getBackground() == Color.BLACK
				&& b5.getBackground() == Color.BLACK
				&& b6.getBackground() == Color.BLACK
				&& b7.getBackground() == Color.BLACK
				&& b8.getBackground() == Color.BLACK
				&& b9.getBackground() == Color.BLACK
				&& b10.getBackground() == Color.BLACK
				&& b11.getBackground() == Color.BLACK
				&& b12.getBackground() == Color.BLACK
				&& b13.getBackground() == Color.BLACK
				&& b14.getBackground() == Color.BLACK
				&& b15.getBackground() == Color.BLACK
				&& b16.getBackground() == Color.BLACK
				&& b17.getBackground() == Color.BLACK
				&& b18.getBackground() == Color.BLACK
				&& b19.getBackground() == Color.BLACK
				&& b20.getBackground() == Color.BLACK
				&& b21.getBackground() == Color.BLACK
				&& b22.getBackground() == Color.BLACK
				&& b23.getBackground() == Color.BLACK
				&& b24.getBackground() == Color.BLACK
				&& b25.getBackground() == Color.BLACK) {
			level++;
			l2.setText("Level " + level);
			score += 100;
			l.setText("Score: " + score);
			if (level == 11) {
				l2.setText("The End");
			}
			if (level == 10) {
				l2.setText("Final Level");
			}
			if (level < 11) {
				JOptionPane.showMessageDialog(null,
						"Nice Job, you passed the level!\nScore: " + score);
			}
			pointsearned = 50;
			rg.generate0();
			if (level == 11) {
				b2.setBackground(Color.BLUE);
				b4.setBackground(Color.BLUE);
				b11.setBackground(Color.YELLOW);
				b15.setBackground(Color.YELLOW);
				b16.setBackground(Color.YELLOW);
				b20.setBackground(Color.YELLOW);
				b21.setBackground(Color.YELLOW);
				b22.setBackground(Color.YELLOW);
				b23.setBackground(Color.YELLOW);
				b24.setBackground(Color.YELLOW);
				b25.setBackground(Color.YELLOW);
				JOptionPane.showMessageDialog(null, "You win!\nScore: " + score);
				l2.setText("The End");
			}
		}
	}

	int getLevel() {
		return level;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(debugMode + "");
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (debugMode == 0) {
				debugMode++;
			}
			if (debugMode == 1) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (debugMode == 2) {
				debugMode++;
			} else if (debugMode == 3) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (debugMode == 4) {
				debugMode++;
			}
			if (debugMode == 6) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (debugMode == 5) {
				debugMode++;
			}
			if (debugMode == 7) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_B) {
			if (debugMode == 8) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			if (debugMode == 9) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (debugMode == 10) {
				debugMode++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_L) {
			if (levelSelect == 0) {
				levelSelect++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			if (levelSelect == 1) {
				levelSelect++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_0) {
			if (levelSelect == 2) {
				level = -1;
				score = -100;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			if (levelSelect == 2) {
				level = 0;
				score = 0;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			if (levelSelect == 2) {
				level = 1;
				score = 100;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			if (levelSelect == 2) {
				level = 2;
				score = 200;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			if (levelSelect == 2) {
				level = 3;
				score = 300;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			if (levelSelect == 2) {
				level = 4;
				score = 400;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			if (levelSelect == 2) {
				level = 5;
				score = 500;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			if (levelSelect == 2) {
				level = 6;
				score = 600;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			if (levelSelect == 2) {
				level = 7;
				score = 700;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_9) {
			if (levelSelect == 2) {
				level = 8;
				score = 800;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_F) {
			if (levelSelect == 2) {
				level = 9;
				score = 900;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			if (levelSelect == 2) {
				level = 10;
				score = 1000;
				b.setBackground(Color.BLACK);
				b2.setBackground(Color.BLACK);
				b3.setBackground(Color.BLACK);
				b4.setBackground(Color.BLACK);
				b5.setBackground(Color.BLACK);
				b6.setBackground(Color.BLACK);
				b7.setBackground(Color.BLACK);
				b8.setBackground(Color.BLACK);
				b9.setBackground(Color.BLACK);
				b10.setBackground(Color.BLACK);
				b11.setBackground(Color.BLACK);
				b12.setBackground(Color.BLACK);
				b13.setBackground(Color.BLACK);
				b14.setBackground(Color.BLACK);
				b15.setBackground(Color.BLACK);
				b16.setBackground(Color.BLACK);
				b17.setBackground(Color.BLACK);
				b18.setBackground(Color.BLACK);
				b19.setBackground(Color.BLACK);
				b20.setBackground(Color.BLACK);
				b21.setBackground(Color.BLACK);
				b22.setBackground(Color.BLACK);
				b23.setBackground(Color.BLACK);
				b24.setBackground(Color.BLACK);
				b25.setBackground(Color.BLACK);
				check(b, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
						b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24,
						b25);
			}
		}

		if (debugMode == 11) {
			b.setBackground(Color.BLACK);
			b2.setBackground(Color.BLACK);
			b3.setBackground(Color.BLACK);
			b4.setBackground(Color.BLACK);
			b5.setBackground(Color.BLACK);
			b6.setBackground(Color.BLACK);
			b7.setBackground(Color.BLACK);
			b8.setBackground(Color.BLACK);
			b9.setBackground(Color.BLACK);
			b10.setBackground(Color.BLACK);
			b11.setBackground(Color.BLACK);
			b12.setBackground(Color.BLACK);
			b13.setBackground(Color.BLACK);
			b14.setBackground(Color.BLACK);
			b15.setBackground(Color.BLACK);
			b16.setBackground(Color.BLACK);
			b17.setBackground(Color.BLACK);
			b18.setBackground(Color.BLACK);
			b19.setBackground(Color.BLACK);
			b20.setBackground(Color.BLACK);
			b21.setBackground(Color.BLACK);
			b22.setBackground(Color.BLACK);
			b23.setBackground(Color.BLACK);
			b24.setBackground(Color.BLACK);
			b25.setBackground(Color.BLACK);
			debugMode = 0;
			l2.setText("Debug");
			l.setText("Mode");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
