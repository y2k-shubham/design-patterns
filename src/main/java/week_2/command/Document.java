package week_2.command;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<String> document;
    private Integer cursorPosition;

    public Document() {
        this.document = new ArrayList<>();
        this.cursorPosition = 0;
    }

    public Integer getCursorPosition() {
        return cursorPosition;
    }

    public void setCursorPosition(Integer cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public String getVictimWord() {
        return this.document.get(this.getCursorPosition() - 1);
    }

    public void insertWord(String word) {
        this.document.add(this.getCursorPosition(), word);
        this.setCursorPosition(this.getCursorPosition() + 1);
    }

    public void deleteWord() {
        this.setCursorPosition(this.getCursorPosition() - 1);
        this.document.remove(this.getCursorPosition().intValue());
    }

    public void preview() {
        System.out.println("----------------------------");
        for (int i = 0; i <= this.document.size(); i++) {
            if (i == this.getCursorPosition()) {
                System.out.print("| ");
            }
            if (i < this.document.size()) {
                System.out.print(this.document.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("Cursor: " + this.getCursorPosition());
        System.out.println("Words:  " + this.document.size());
    }
}
