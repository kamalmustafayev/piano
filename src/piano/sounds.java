package piano;

import java.io.*;

import javax.sound.sampled.*;

public class sounds {

	static void clickChecker() {
		if (play.lowDo) {
			playLowDo();
			play.lowDo = false;
		} else if (play.doSharp) {
			playDoSharp();
			play.doSharp = false;
		} else if (play.re) {
			playRe();
			play.re = false;
		} else if (play.reSharp) {
			playReSharp();
			play.reSharp = false;
		} else if (play.mi) {
			playMi();
			play.mi = false;
		} else if (play.fa) {
			playFa();
			play.fa = false;
		} else if (play.faSharp) {
			playFaSharp();
			play.faSharp = false;
		} else if (play.sol) {
			playSol();
			play.sol = false;
		} else if (play.solSharp) {
			playSolSharp();
			play.solSharp = false;
		} else if (play.la) {
			playLa();
			play.la = false;
		} else if (play.laSharp) {
			playLaSharp();
			play.laSharp = false;
		} else if (play.si) {
			playSi();
			play.si = false;
		} else if (play.upDo) {
			playUpDo();
			play.upDo = false;
		}
	}

	private static void playLowDo() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/lowDo.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {}
	}

	private static void playDoSharp() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/doSharp.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {}
		
	}

	private static void playRe() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/re.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {}
		
	}

	private static void playReSharp() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/reSharp.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playMi() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/mi.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playFa() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/fa.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playFaSharp() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/faSharp.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playSol() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/sol.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playSolSharp() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/solSharp.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playLa() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/la.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playLaSharp() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/laSharp.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playSi() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/si.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

	private static void playUpDo() {
		try {
			AudioInputStream a = AudioSystem.getAudioInputStream(new File("sounds/upDo.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(a);
			clip.start();
			a.close();
		} catch (Exception e) {
		}
	}

}
