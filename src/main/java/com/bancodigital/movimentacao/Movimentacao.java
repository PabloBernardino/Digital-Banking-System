package com.bancodigital.movimentacao;

import com.bancodigital.Conta.Conta;
import com.bancodigital.Conta.StatusConta;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class Movimentacao {

    private String descricao;
    private BigDecimal valor;
    private StatusConta status;
    private LocalDateTime dataHora;
    private TipoTransacao tipoTransacao;

    //private BigDecimal valor;
    //private LocalDateTime dataHora;
    //private Conta contaOrigem;
    //private Conta contaDestinatario;

    public TipoTransacao getTipoTransacao() {return tipoTransacao;}
    public String getDescricao() {return descricao;}
    public BigDecimal getValor() {return valor;}
    public StatusConta getStatus() {return status;}
    public LocalDateTime getDataAtualizacao() {return dataHora;}

    public Movimentacao(TipoTransacao tipoTransacaoInit,
                        BigDecimal valorInit,
                        StatusConta statusInit,
                        LocalDateTime dataHoraInit,
                        String descricaoInit)

    {

        tipoTransacao = tipoTransacaoInit;
        valor = valorInit;
        dataHora = LocalDateTime.now();
        status = statusInit;
        descricao = descricaoInit;

    }


}
