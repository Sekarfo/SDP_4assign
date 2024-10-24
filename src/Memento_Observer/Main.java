package Memento_Observer;

import Memento_Observer.History;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();


        editor.type("Hello");
        history.save(editor.save());
        editor.type(" World!");
        System.out.println(editor.getText());

        System.out.print("Undo operation : ");
        editor.undo(history.undo());
        System.out.println(editor.getText());


        System.out.println("                     ");
        System.out.println("                     ");
        System.out.println("                     ");




        NewsAgency agency = new NewsAgency();
        NewsChannel Tengri = new NewsChannel("Tengri");
        NewsChannel KTK = new NewsChannel("KTK");

        agency.addObserver(Tengri);
        agency.addObserver(KTK);

        agency.setHeadline("New tech breakthrough!");
        agency.setHeadline("Stock market rallies!");
    }
}






