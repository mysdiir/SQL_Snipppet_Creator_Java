package Controller;


import View.MainView;

public class MainController {

    public MainView mainView;

    // use constructor to cast an mainview object with all elemn to display
    public MainController(MainView mainView) {
        this.mainView = mainView;
    }

    public static void main(String[] args) {
       new MainController(new MainView());


    }



}
