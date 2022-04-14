package com.dio.bootcampclasses;

public class Curso extends Atividade{

    private int cargaHoraria;

    public Curso(){
        
    }
    
    public Curso(String titulo, String descricao, int cargaHoraria){
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
    }

    public double calcularXP(){
        return this.XP_PADRAO;
    }
    
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }
    
    public void setCargaHoraria(int newCargaHoraria){
        this.cargaHoraria = newCargaHoraria;
    }
}