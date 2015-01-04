import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;

public class RandomGenerator {
	LightSwitch ls;
	JButton b;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	JButton b17;
	JButton b18;
	JButton b19;
	JButton b20;
	JButton b21;
	JButton b22;
	JButton b23;
	JButton b24;
	JButton b25;
	int level;

	public RandomGenerator(LightSwitch ls) {
		this.ls = ls;
		level = ls.getLevel();
		b = ls.getB();
		b2 = ls.getB2();
		b3 = ls.getB3();
		b4 = ls.getB4();
		b5 = ls.getB5();
		b6 = ls.getB6();
		b7 = ls.getB7();
		b8 = ls.getB8();
		b9 = ls.getB9();
		b10 = ls.getB10();
		b11 = ls.getB11();
		b12 = ls.getB12();
		b13 = ls.getB13();
		b14 = ls.getB14();
		b15 = ls.getB15();
		b16 = ls.getB16();
		b17 = ls.getB17();
		b18 = ls.getB18();
		b19 = ls.getB19();
		b20 = ls.getB20();
		b21 = ls.getB21();
		b22 = ls.getB22();
		b23 = ls.getB23();
		b24 = ls.getB24();
		b25 = ls.getB25();
	}

	public void generate0() {
		System.out.println("" + ls.getLevel());
		if (ls.getLevel() == 0) {
			int x = new Random().nextInt(25) + 1;
			if (x == 1) {
				corner(b, b2, b6);
			}
			if (x == 2) {
				endOfARow(b2, b, b3, b7);
			}
			if (x == 3) {
				endOfARow(b3, b2, b4, b8);
			}
			if (x == 4) {
				endOfARow(b4, b3, b5, b9);
			}
			if (x == 5) {
				corner(b5, b4, b10);
			}
			if (x == 6) {
				endOfARow(b6, b7, b, b11);
			}
			if (x == 7) {
				changeColor(b7, b6, b8, b2, b12);
			}
			if (x == 8) {
				changeColor(b8, b9, b7, b3, b13);
			}
			if (x == 9) {
				changeColor(b9, b8, b10, b4, b14);
			}
			if (x == 10) {
				endOfARow(b10, b9, b5, b15);
			}
			if (x == 11) {
				endOfARow(b11, b12, b6, b16);
			}
			if (x == 12) {
				changeColor(b12, b13, b11, b7, b17);
			}
			if (x == 13) {
				changeColor(b13, b14, b12, b8, b18);
			}
			if (x == 14) {
				changeColor(b14, b15, b13, b9, b19);
			}
			if (x == 15) {
				endOfARow(b15, b14, b10, b20);
			}
			if (x == 16) {
				endOfARow(b16, b17, b11, b21);
			}
			if (x == 17) {
				changeColor(b17, b16, b18, b12, b22);
			}
			if (x == 18) {
				changeColor(b18, b19, b17, b13, b23);
			}
			if (x == 19) {
				changeColor(b20, b19, b18, b14, b24);
			}
			if (x == 20) {
				endOfARow(b20, b19, b25, b15);
			}
			if (x == 21) {
				corner(b21, b22, b16);
			}
			if (x == 22) {
				endOfARow(b22, b21, b23, b17);
			}
			if (x == 23) {
				endOfARow(b23, b22, b24, b18);
			}
			if (x == 24) {
				endOfARow(b24, b23, b25, b19);
			}
			if (x == 25) {
				corner(b25, b24, b20);
			}
		} else if (ls.getLevel() == 1) {
			int y = new Random().nextInt(3);
			if (y == 0) {
				y = 8;
			} else if (y == 1) {
				y = 13;
			} else {
				y = 18;
			}
			if (y == 8) {
				changeColor2(b2, b3, b4, b6, b10, b12, b13, b14, b8);
			} else if (y == 13) {
				changeColor2(b7, b8, b9, b11, b15, b17, b18, b19, b13);
			} else {
				changeColor2(b12, b13, b14, b16, b20, b22, b23, b24, b18);
			}
		} else if (ls.getLevel() == 2) {
			level2(b2, b4, b6, b7, b9, b10, b16, b17, b19, b20, b22, b24);
		} else if (ls.getLevel() == 3) {
			int generator = new Random().nextInt(6);
			if (generator < 3) {
				level3Selection1(b, b2, b3, b4, b5, b7, b8, b9, b12, b14);
			} else if (generator > 2) {
				level3Selection2(b12, b14, b17, b18, b19, b21, b22, b23, b24,
						b25);
			}
		} else if (ls.getLevel() == 4) {
			level4(b2, b3, b4, b6, b10, b11, b13, b15, b16, b20, b22, b23, b24);
		} else if (ls.getLevel() == 5) {
			level5(b, b4, b5, b7, b8, b10, b12, b14, b16, b18, b19, b21, b22,
					b25);
		} else if (ls.getLevel() == 6) {
			level6(b6, b7, b9, b10, b12, b14, b16, b20, b21, b25);
		} else if (ls.getLevel() == 7) {
			level7(b2, b4, b6, b8, b10, b12, b13, b14, b16, b18, b20, b22, b24);
		} else if (ls.getLevel() == 8) {
			level8(b, b3, b5, b21, b23, b25);
		} else if (ls.getLevel() == 9) {
			level9(b, b2, b3, b4, b5, b7, b9, b12, b13, b14, b17, b19, b21,
					b22, b23, b24, b25);
		} else if (ls.getLevel() == 10) {
			finalLevel(b, b5, b7, b8, b9, b12, b13, b14, b16, b20, b21, b22, b23,
					b24, b25);
		}
	}

	private void changeColor(JButton button, JButton b2, JButton b3,
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

	private void endOfARow(JButton button, JButton b2, JButton b3, JButton b4) {
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

	private void changeColor2(JButton k, JButton k2, JButton k3, JButton k4,
			JButton k5, JButton k6, JButton k7, JButton k8, JButton k9) {
		if (k.getBackground() == Color.WHITE) {
			k.setBackground(Color.BLACK);
		} else {
			k.setBackground(Color.WHITE);
		}
		if (k2.getBackground() == Color.WHITE) {
			k2.setBackground(Color.BLACK);
		} else {
			k2.setBackground(Color.WHITE);
		}
		if (k3.getBackground() == Color.WHITE) {
			k3.setBackground(Color.BLACK);
		} else {
			k3.setBackground(Color.WHITE);
		}
		if (k4.getBackground() == Color.WHITE) {
			k4.setBackground(Color.BLACK);
		} else {
			k4.setBackground(Color.WHITE);
		}
		if (k5.getBackground() == Color.WHITE) {
			k5.setBackground(Color.BLACK);
		} else {
			k5.setBackground(Color.WHITE);
		}
		if (k6.getBackground() == Color.WHITE) {
			k6.setBackground(Color.BLACK);
		} else {
			k6.setBackground(Color.WHITE);
		}
		if (k7.getBackground() == Color.WHITE) {
			k7.setBackground(Color.BLACK);
		} else {
			k7.setBackground(Color.WHITE);
		}
		if (k8.getBackground() == Color.WHITE) {
			k8.setBackground(Color.BLACK);
		} else {
			k8.setBackground(Color.WHITE);
		}
		if (k9.getBackground() == Color.WHITE) {
			k9.setBackground(Color.BLACK);
		} else {
			k9.setBackground(Color.WHITE);
		}
	}

	private void level2(JButton c, JButton c2, JButton c3, JButton c4,
			JButton c5, JButton c6, JButton c7, JButton c8, JButton c9,
			JButton c10, JButton c11, JButton c12) {
		c.setBackground(Color.WHITE);
		c2.setBackground(Color.WHITE);
		c3.setBackground(Color.WHITE);
		c4.setBackground(Color.WHITE);
		c5.setBackground(Color.WHITE);
		c6.setBackground(Color.WHITE);
		c7.setBackground(Color.WHITE);
		c8.setBackground(Color.WHITE);
		c10.setBackground(Color.WHITE);
		c9.setBackground(Color.WHITE);
		c11.setBackground(Color.WHITE);
		c12.setBackground(Color.WHITE);
	}

	private void level3Selection1(JButton a, JButton a2, JButton a3,
			JButton a4, JButton a5, JButton a6, JButton a7, JButton a8,
			JButton a9, JButton a10) {
		a.setBackground(Color.WHITE);
		a2.setBackground(Color.WHITE);
		a3.setBackground(Color.WHITE);
		a4.setBackground(Color.WHITE);
		a5.setBackground(Color.WHITE);
		a6.setBackground(Color.WHITE);
		a7.setBackground(Color.WHITE);
		a8.setBackground(Color.WHITE);
		a9.setBackground(Color.WHITE);
		a10.setBackground(Color.WHITE);
	}

	private void level3Selection2(JButton a, JButton a2, JButton a3,
			JButton a4, JButton a5, JButton a6, JButton a7, JButton a8,
			JButton a9, JButton a10) {
		a.setBackground(Color.WHITE);
		a2.setBackground(Color.WHITE);
		a3.setBackground(Color.WHITE);
		a4.setBackground(Color.WHITE);
		a5.setBackground(Color.WHITE);
		a6.setBackground(Color.WHITE);
		a7.setBackground(Color.WHITE);
		a8.setBackground(Color.WHITE);
		a9.setBackground(Color.WHITE);
		a10.setBackground(Color.WHITE);
	}

	private void level4(JButton y, JButton y2, JButton y3, JButton y4,
			JButton y5, JButton y6, JButton y7, JButton y8, JButton y9,
			JButton y10, JButton y11, JButton y12, JButton y13) {
		y.setBackground(Color.WHITE);
		y2.setBackground(Color.WHITE);
		y3.setBackground(Color.WHITE);
		y4.setBackground(Color.WHITE);
		y5.setBackground(Color.WHITE);
		y6.setBackground(Color.WHITE);
		y7.setBackground(Color.WHITE);
		y8.setBackground(Color.WHITE);
		y9.setBackground(Color.WHITE);
		y10.setBackground(Color.WHITE);
		y11.setBackground(Color.WHITE);
		y12.setBackground(Color.WHITE);
		y13.setBackground(Color.WHITE);
	}

	private void level5(JButton x, JButton x2, JButton x3, JButton x4,
			JButton x5, JButton x6, JButton x7, JButton x8, JButton x9,
			JButton x10, JButton x11, JButton x12, JButton x13, JButton x14) {
		x.setBackground(Color.WHITE);
		x2.setBackground(Color.WHITE);
		x3.setBackground(Color.WHITE);
		x4.setBackground(Color.WHITE);
		x5.setBackground(Color.WHITE);
		x6.setBackground(Color.WHITE);
		x7.setBackground(Color.WHITE);
		x8.setBackground(Color.WHITE);
		x9.setBackground(Color.WHITE);
		x10.setBackground(Color.WHITE);
		x11.setBackground(Color.WHITE);
		x12.setBackground(Color.WHITE);
		x13.setBackground(Color.WHITE);
		x14.setBackground(Color.WHITE);
	}

	private void level6(JButton x, JButton x2, JButton x3, JButton x4,
			JButton x5, JButton x6, JButton x7, JButton x8, JButton x9,
			JButton x10) {
		x.setBackground(Color.WHITE);
		x2.setBackground(Color.WHITE);
		x3.setBackground(Color.WHITE);
		x4.setBackground(Color.WHITE);
		x5.setBackground(Color.WHITE);
		x6.setBackground(Color.WHITE);
		x7.setBackground(Color.WHITE);
		x8.setBackground(Color.WHITE);
		x9.setBackground(Color.WHITE);
		x10.setBackground(Color.WHITE);
	}

	private void level7(JButton x, JButton x2, JButton x3, JButton x4,
			JButton x5, JButton x6, JButton x7, JButton x8, JButton x9,
			JButton x10, JButton x11, JButton x12, JButton x13) {
		x.setBackground(Color.WHITE);
		x2.setBackground(Color.WHITE);
		x3.setBackground(Color.WHITE);
		x4.setBackground(Color.WHITE);
		x5.setBackground(Color.WHITE);
		x6.setBackground(Color.WHITE);
		x7.setBackground(Color.WHITE);
		x8.setBackground(Color.WHITE);
		x9.setBackground(Color.WHITE);
		x10.setBackground(Color.WHITE);
		x11.setBackground(Color.WHITE);
		x12.setBackground(Color.WHITE);
		x13.setBackground(Color.WHITE);
	}

	private void finalLevel(JButton x, JButton x2, JButton x3, JButton x4,
			JButton x5, JButton x6, JButton x7, JButton x8, JButton x9,
			JButton x10, JButton x11, JButton x12, JButton x13, JButton x14,
			JButton x15) {
		x.setBackground(Color.WHITE);
		x2.setBackground(Color.WHITE);
		x3.setBackground(Color.WHITE);
		x4.setBackground(Color.WHITE);
		x5.setBackground(Color.WHITE);
		x6.setBackground(Color.WHITE);
		x7.setBackground(Color.WHITE);
		x8.setBackground(Color.WHITE);
		x9.setBackground(Color.WHITE);
		x10.setBackground(Color.WHITE);
		x11.setBackground(Color.WHITE);
		x12.setBackground(Color.WHITE);
		x13.setBackground(Color.WHITE);
		x14.setBackground(Color.WHITE);
		x15.setBackground(Color.WHITE);
	}

	private void level9(JButton x, JButton x2, JButton x3, JButton x4,
			JButton x5, JButton x6, JButton x7, JButton x8, JButton x9,
			JButton x10, JButton x11, JButton x12, JButton x13, JButton x14,
			JButton x15, JButton x16, JButton x17) {
		x.setBackground(Color.WHITE);
		x2.setBackground(Color.WHITE);
		x3.setBackground(Color.WHITE);
		x4.setBackground(Color.WHITE);
		x5.setBackground(Color.WHITE);
		x6.setBackground(Color.WHITE);
		x7.setBackground(Color.WHITE);
		x8.setBackground(Color.WHITE);
		x9.setBackground(Color.WHITE);
		x10.setBackground(Color.WHITE);
		x11.setBackground(Color.WHITE);
		x12.setBackground(Color.WHITE);
		x13.setBackground(Color.WHITE);
		x14.setBackground(Color.WHITE);
		x15.setBackground(Color.WHITE);
		x16.setBackground(Color.WHITE);
		x17.setBackground(Color.WHITE);
	}

	private void level8(JButton x, JButton x2, JButton x3, JButton x4,
			JButton x5, JButton x6) {
		x.setBackground(Color.WHITE);
		x2.setBackground(Color.WHITE);
		x3.setBackground(Color.WHITE);
		x4.setBackground(Color.WHITE);
		x5.setBackground(Color.WHITE);
		x6.setBackground(Color.WHITE);
	}

}
