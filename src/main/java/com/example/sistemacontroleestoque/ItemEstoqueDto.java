package com.example.sistemacontroleestoque;

public class ItemEstoqueDto {
    private Long id;
    private Long quant;
    private Float valorUnitario;
    public Float getValorUnitario() {
    return valorUnitario;
    }
    public void setValorUnitario(Float valorUnitario) {
    this.valorUnitario = valorUnitario;
    }
    public Long getId() {
    return id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    public Long getQuant() {
    return quant;
    }
    public void setQuant(Long quant) {
    this.quant = quant;
    }
}