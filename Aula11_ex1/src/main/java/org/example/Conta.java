package org.example;

public class Conta implements Comparable<Conta>{

    String dono;
    int saldo;

    public Conta(String dono, int saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    /*
    @Override
    public int compareTo(Conta o) {
        return Integer.compare(this.saldo, o.saldo);
    }

   */

    @Override
    public int compareTo(Conta o) {
        return dono.compareTo(o.dono);
    }
}
