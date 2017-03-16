package com.company.aktoriai;

public class Main {

    public static void main(String[] args) {
        papildoma objektas = new papildoma();
        objektas.Pasisveikinimas();
        while (true) {
            objektas.Paklausimas();
            objektas.Pasirinkimas();
        }


    }
}
