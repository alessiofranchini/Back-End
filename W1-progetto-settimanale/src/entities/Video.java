package entities;

public class Video extends Multimedia implements Playable, Brightness {

	private int volume;
	private int brightness;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= 0 && volume <= 10) {

			this.volume = volume;
		} else {
			System.out.println("Per favore, inserire un valore tra 0 e 10");
		}
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		if (brightness >= 0 && brightness <= 10) {

			this.brightness = brightness;
		} else {
			System.out.println("Inserire un valore tra 0 e 10");
		}
	}

	public Video(String title, int duration) {
		super(title, duration);
		// Il volume e la luminosità vanno da 1 a 10, il valore default è 5.
		this.volume = 5;
		this.brightness = 5;

	}

	@Override
	public void play() {
		for (int i = 0; i < duration; i++) {
			try {
				Thread.sleep(1000); // Aspetta un secondo (1000 millisecondi)
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.print("♪♫ " + title + " ♪♬ ");

			for (int j = 0; j < volume; j++) {
				System.out.print("!");
			}

			System.out.print(" ");

			for (int j = 0; j < brightness; j++) {
				System.out.print("*");

			}
			System.out.print("\n");
		}
	}

	@Override
	public void volumeUp() {
		if (volume < 10) {
			volume++;
		} else {
			System.out.println("Il volume è al massimo!");

		}
	}

	@Override
	public void volumeDown() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("Il volume è al minimo!");

		}
	}

	@Override
	public void brIncrease() {
		if (brightness < 10) {
			brightness++;
		} else {
			System.out.println("La luminosità è al massimo!");

		}
	}

	@Override
	public void brdecrease() {
		if (brightness > 0) {
			brightness--;
		} else {
			System.out.println("La luminosità è al minimo!");

		}
	}
}
