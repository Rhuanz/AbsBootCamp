package com.dio.bootcampclasses;

import java.time.LocalDate;

public class Mentoria extends Atividade {

    private LocalDate data;

    public Mentoria(){

    }

    public Mentoria(String titulo, String descricao, LocalDate data){

        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public double calcularXP(){
        return this.XP_PADRAO;
    }
    
    public LocalDate getData(){
        return this.data;
    }

    public void setData(LocalDate newData){
        this.data = newData;
    }
}
