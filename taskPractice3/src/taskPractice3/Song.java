package taskPractice3;

import java.util.Objects;

public class Song {
	private String name;
	private String genre;
	private String singer;
	
	public Song() {;}

	public Song(String name, String genre, String singer) {
		super();
		this.name = name;
		this.genre = genre;
		this.singer = singer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "name=" + name + ", genre=" + genre + ", singer=" + singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return name.equals(other.name);
	}
}
