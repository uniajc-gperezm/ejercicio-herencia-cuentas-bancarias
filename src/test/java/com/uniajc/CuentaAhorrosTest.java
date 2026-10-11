package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * CuentaAhorrosTest
 */
public class CuentaAhorrosTest {

    private static final float DELTA = 0.0001f;

    @Test 
    void cuentaInactivaSiSaldoMenorAMinimo() {
        CuentaAhorros cuenta = new CuentaAhorros(5000f, 0.12f);
        cuenta.retirar(1000f);
        assertEquals(5000f, cuenta.saldo, DELTA);

    }

    @Test 
    void cuentaActivaSiSaldoMayorOIGualAMinimo() {
        CuentaAhorros cuenta = new CuentaAhorros(15000f, 0.12f);
        cuenta.consignar(2000f);
        assertEquals(17000f, cuenta.saldo, DELTA);
    }
}
