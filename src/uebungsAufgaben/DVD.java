package uebungsAufgaben;

public class DVD {
	private String title;
	private int duration;
	private String director;

	public String getDescription() {
		return "DVD: " + title + ", duration " + duration + " min, by " + director;
	}

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

	public String getDirector() {
		return director;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public DVD() {

	}

	public DVD(String title, int duration, String director) {
		this.title = title;
		this.duration = duration;
		this.director = director;
	}

}
