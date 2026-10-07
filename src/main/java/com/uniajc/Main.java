package com.uniajc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Probando nuestro sistema de cuentas bancarias...");

        Cuenta cuentaAhorros = new CuentaAhorros(15000f, 0.12f);

        cuentaAhorros.consignar(-5000f); // saldo final = 20.000
        cuentaAhorros.retirar(12000f); // saldo final = 8.000
        cuentaAhorros.imprimir();



    }
}