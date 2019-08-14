package com.company;

public class Mental extends Player
        implements SuperTeikon {
    private int supperattak;

    public int getSupperattak() {
        return supperattak;
    }

    public void setSupperattak(int supperattak) {
        this.supperattak = supperattak;
    }


    @Override
    public void superTeikon() {
        System.out.println("Применено супер мошь");

    }
}
