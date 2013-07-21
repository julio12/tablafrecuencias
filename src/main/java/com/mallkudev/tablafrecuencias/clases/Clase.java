package com.mallkudev.tablafrecuencias.clases;

public class Clase {

    private float limInf;
    private float limSup;

    public Clase() {
        limInf = 0f;
        limSup = 0f;
    }

    public Clase(float limInf, float limSup) {
        this.limInf = limInf;
        this.limSup = limSup;
    }

    public void setLimInf(float limInf) {
        this.limInf = limInf;
    }

    public void setLimSup(float limSup) {
        this.limSup = limSup;
    }

    public float getLimInf() {
        return limInf;
    }

    public float getLimSup() {
        return limSup;
    }

    /**
     * Retorna la marca de clase o media
     */
    public float getMarca() {
        return (getLimSup() + getLimInf()) / 2;
    }
}
