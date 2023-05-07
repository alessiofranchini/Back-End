package entities;

public abstract class Multimedia {
	protected String title;
	protected int duration;

	protected Multimedia(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}

}
