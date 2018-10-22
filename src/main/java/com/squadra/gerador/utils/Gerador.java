package com.squadra.gerador.utils;

public class Gerador {

    public String geraSequencia(int indice) {
        String resultado = "";
        for (int i = indice; i < (indice + 5); i++) {
            resultado += geradorRecursivo(i) + " ";
        }
        return resultado;
    }

    private int geradorRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return geradorRecursivo(n - 1) + geradorRecursivo(n - 2);
    }
}
