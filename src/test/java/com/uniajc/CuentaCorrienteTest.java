package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {

    private static final float DELTA = 0.0001f;

    @Test 
    void retirarConSobregiroActualizasaldoYSobregiro(){
        CuentaCorriente cuenta = new CuentaCorriente(100000f, 0.12f);
        cuenta.retirar(120000f);
        assertEquals(0f, cuenta.saldo, DELTA);
        assertEquals(20000f, cuenta.sobregiro, DELTA);
    }


    @Test 
    void consignarConSobregiroPagaLaDeudaPrimero(){
        CuentaCorriente cuenta = new CuentaCorriente(0f, 0.12f);
       cuenta.sobregiro = 20000f;//simulamos un sobregiro activo

       cuenta.consignar(30000f);

       assertEquals(0f, cuenta.sobregiro, DELTA);
       assertEquals(10000f, cuenta.saldo, DELTA);
    }


 }
