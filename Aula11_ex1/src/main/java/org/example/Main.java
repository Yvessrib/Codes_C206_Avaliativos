package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList array = new ArrayList();

        Conta c1 = new Conta("ZE",100);

        array.add(10);
        array.add(c1);
        array.add("Yves");
        array.add(false);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        array.remove(0);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        array.remove(c1);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println();

        ArrayList <Integer> arrayInteiro = new ArrayList<>();

        arrayInteiro.add(10);
        arrayInteiro.add(9);
        arrayInteiro.add(160);
        arrayInteiro.add(159);

        for (int i = 0; i < arrayInteiro.size(); i++) {
            System.out.println(arrayInteiro.get(i));
        }

        Collections.sort(arrayInteiro);

        for (int i = 0; i < arrayInteiro.size(); i++) {
            System.out.println(arrayInteiro.get(i));
        }

        Collections.reverse(arrayInteiro);

        for (int i = 0; i < arrayInteiro.size(); i++) {
            System.out.println(arrayInteiro.get(i));
        }
        */

        ArrayList <Conta> arrayConta = new ArrayList<>();

        Conta c1 = new Conta("Ze",100);
        Conta c2 = new Conta("Ivana",1000);
        Conta c3 = new Conta("Joao",5);

        arrayConta.add(c1);
        arrayConta.add(c2);
        arrayConta.add(c3);

        /*
        for (int i = 0; i < arrayConta.size(); i++) {
            System.out.println(arrayConta.get(i).dono);
            System.out.println(arrayConta.get(i).saldo);
        }

        Collections.sort(arrayConta);

        for (int i = 0; i < arrayConta.size(); i++) {
            System.out.println(arrayConta.get(i).dono);
            System.out.println(arrayConta.get(i).saldo);
        }

        Collections.reverse(arrayConta);

        for (int i = 0; i < arrayConta.size(); i++) {
            System.out.println(arrayConta.get(i).dono);
            System.out.println(arrayConta.get(i).saldo);
        }
         */

        Collections.sort(arrayConta);
        for (int i = 0; i < arrayConta.size(); i++) {
            System.out.println(arrayConta.get(i).dono);
            System.out.println(arrayConta.get(i).saldo);
        }

    }
}