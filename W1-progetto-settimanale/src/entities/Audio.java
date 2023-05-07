package entities;

public class Audio extends Multimedia implements Playable {

	private int volume;

	public Audio(String title, int duration) {
		super(title, duration);
		// Il volume va da 1 a 10, il valore default è 5
		this.volume = 5;
	}

	public Audio(String title) {
		super(title, 0);
		this.volume = 5;
	}

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

}
