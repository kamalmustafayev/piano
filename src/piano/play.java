package piano;

import java.awt.event.KeyEvent;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class play extends GraphicsProgram {
	private static final long serialVersionUID = 1L;

	static boolean lowDo, re, mi, fa, sol, la, si, upDo, doSharp, reSharp, faSharp, solSharp, laSharp;

	public void init() {
		addKeyListeners();
	}

	public void run() {
		GImage keys = new GImage("keys.png");
		keys.setSize(getWidth(), getHeight());
		add(keys);

		while (true) {
			sounds.clickChecker();
			pause(1);
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_S)
			lowDo = true;
		if (e.getKeyCode() == KeyEvent.VK_E)
			doSharp = true;
		if (e.getKeyCode() == KeyEvent.VK_D)
			re = true;
		if (e.getKeyCode() == KeyEvent.VK_R)
			reSharp = true;
		if (e.getKeyCode() == KeyEvent.VK_F)
			mi = true;
		if (e.getKeyCode() == KeyEvent.VK_G)
			fa = true;
		if (e.getKeyCode() == KeyEvent.VK_Y)
			faSharp = true;
		if (e.getKeyCode() == KeyEvent.VK_H)
			sol = true;
		if (e.getKeyCode() == KeyEvent.VK_U)
			solSharp = true;
		if (e.getKeyCode() == KeyEvent.VK_J)
			la = true;
		if (e.getKeyCode() == KeyEvent.VK_I)
			laSharp = true;
		if (e.getKeyCode() == KeyEvent.VK_K)
			si = true;
		if (e.getKeyCode() == KeyEvent.VK_L)
			upDo = true;

	}

	public static void main(String[] args) {
		new play().start();
	}

}
