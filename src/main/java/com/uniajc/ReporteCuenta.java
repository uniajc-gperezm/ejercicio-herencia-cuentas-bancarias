package com.uniajc;

public class ReporteCuenta {

    public static String obtenerEstadoSaludFinanciera(Cuenta cuenta) {
        if (cuenta instanceof CuentaCorriente) {
            CuentaCorriente cc = (CuentaCorriente) cuenta;
            if (cc.sobregiro > 0) {
                return "ALERTA: La cuenta corriente presenta sobregiro activo.";
            }
        }
        
        if (cuenta.saldo >= 50000f) {
            return "SALUDABLE: La cuenta tiene un buen nivel de saldo.";
        } else {
            return "ATENCIÓN: Saldo bajo, se recomienda consignar.";
        }
    }
}