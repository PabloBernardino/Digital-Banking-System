package com.bancodigital.extrato;

import java.util.ArrayList;
import java.util.List;
import com.bancodigital.movimentacao.Movimentacao;

public class Extrato {
    private String dataHora;
    private String contaOrigem;
    private String contaDestinatario;
    private List<Extrato> extratos;

    public String getDataHora() {return dataHora;}
    public void setDataHora(String dataHora) {this.dataHora = dataHora;}
    public String getContaOrigem() {return contaOrigem;}
    public String getContaDestinatario() {return contaDestinatario;}

    public Extrato(String dataHora, String contaOrigem, String contaDestinatario) {

        this.dataHora = dataHora;
        this.contaOrigem = contaOrigem;
        this.contaDestinatario = contaDestinatario;
        this.extratos = new ArrayList<Extrato>();

    }


}


