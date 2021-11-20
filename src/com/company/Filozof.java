package com.company;

public class Filozof extends Thread {
    private String name;
    private Vidlicka vidlickaLeva;
    private Vidlicka vidlickaPrava;
    private int jezeni = 10;

    public Filozof(String name, Vidlicka vidlickaLeva, Vidlicka vidlickaPrava) {
        this.name = name;
        this.vidlickaLeva = vidlickaLeva;
        this.vidlickaPrava = vidlickaPrava;
    }
    @Override
    public void run(){
        while (jezeni > 0) {
            synchronized (vidlickaLeva) {
                System.out.println(name + " chytil vidlicku " + vidlickaLeva.getName() + " do leve ruky. ");
                synchronized (vidlickaPrava) {
                    System.out.println(name + " chytil vidlicku " + vidlickaPrava.getName() + " do prave ruky. ");
                    System.out.println(" Mam obe vidlicki("
                            + vidlickaLeva.getName()
                            + " a "
                            + vidlickaPrava.getName()
                            + "), muzu jist! (" + jezeni + ")");
                    jezeni--;
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
