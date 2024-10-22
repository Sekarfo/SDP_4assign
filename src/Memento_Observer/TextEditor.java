package Memento_Observer;

import Memento_Observer.Memento;
public class TextEditor {
    private StringBuilder currentText;

    public TextEditor() {
        this.currentText = new StringBuilder();
    }


    public void type(String text) {
        currentText.append(text);
    }


    public String getText() {
        return currentText.toString();
    }


    public Memento save() {
        return new Memento(currentText.toString());
    }


    public void undo(Memento memento) {
        if (memento != null) {
            currentText = new StringBuilder(memento.getState());
        }
    }
}

