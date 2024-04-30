import java.util.*;

// Originator
class TextWindow {
    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public String getText() {
        return currentText.toString();
    }

    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }
}

class TextWindowState{
    private String text;

    public TextWindowState(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}

// Caretaker
class TextEditor {
    private TextWindow textWindow;
    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

    public String print() {
        return textWindow.getText();
    }
}

class Main{

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Momento Design Pattern\n");
        textEditor.write("initial State : Welcome \n");
        textEditor.hitSave();

        textEditor.write("Add more to document...\n");
        System.out.println(textEditor.print());

        textEditor.hitUndo();
        System.out.println(textEditor.print());
    }
}