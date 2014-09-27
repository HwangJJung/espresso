package week6_PL;

import java.util.Date;

public class Note {
	public String title;
	public String contents;
	public Date created;
	public Date updated;
	public int id;

	public Note(String title, String contents, Date created, Date updated) {
		this.title = title;
		this.contents = contents;
		this.created = created;
		this.updated = updated;
		this.id = 0;
	}
}