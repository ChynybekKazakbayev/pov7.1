package com.company;

public class Warior extends Player implements SuperTeikon{

    private int superatak;

    public int getSuperatak() {
        return superatak;
    }

    public void setSuperatak(int superatak) {
        this.superatak = superatak;

    }


    @Override
    public void superTeikon() {
        System.out.println("Применено волшебство");
    }
}
