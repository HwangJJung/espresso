package week6_PL;

import java.util.ArrayList;
import java.util.List;

public class NextNote {

	//제목 /본문 /생성시간 / 마지막 수정 / 폰트 
	String font = "Nanum";
	
	public List notes = new ArrayList();
	
	public void addNextNote(Note note) {
		notes.add(note);
		note.id = notes.size() - 1 ;
	}
	
	public Note findnote(int id) {
		return (Note) notes.get(id);
	}
	public void modifyfont( String font) {
		
	}
}
