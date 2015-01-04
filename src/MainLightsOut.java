import javax.swing.JOptionPane;

public class MainLightsOut {
	public static void main(String[] args) {
		LightSwitch ls = new LightSwitch();
		JOptionPane
				.showMessageDialog(
						null,
						"The objective of this game is simple: turn all the squares black.\nWhenever you click on a square, " +
						"it and all the squares surrounding it will turn white if they are black, and black if they are white." +
						"\nOnce you beat all the levels, you get a special surprise!", "Instructions", JOptionPane.INFORMATION_MESSAGE);
	}
}
