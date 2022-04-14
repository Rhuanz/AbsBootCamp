package com.dio.bootcampclasses;


public abstract class Atividade {
    
    protected static final double XP_PADRAO = 10;
    protected String titulo;
    protected String descricao;

    public abstract double calcularXP();

    public String getTitulo(){
        return this.titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }

    public void setDescricao(String newDescricao){
        this.descricao = newDescricao;
    }
}
