package week6_PL;

import java.util.Date;

public class NextNoteTest {
	public static void main(String[] args) {

		NextNote sut = new NextNote();
	    sut.addNextNote(new Note("title", "contents", new Date(), new Date()));	
		Note result = sut.findnote(1);
		sut.modifyfont("Nanum");
	}
		
}
