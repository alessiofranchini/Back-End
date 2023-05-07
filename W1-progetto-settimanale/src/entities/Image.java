package entities;

public class Image extends Multimedia implements Brightness {

	private int brightness;

	public Image(String title) {
		super(title, 0);
		// Luminosità da 0 a 10. Default: 5
		brightness = 5;

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

	public void show() {
		System.out.print(title + " ");
		for (int i = 0; i < brightness; i++) {
			System.out.print("*");
		}

	}

}
