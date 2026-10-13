package com.programandofodacci.terranovaindustrialist.models;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
/**
 *
 * @author UltraLuminatio
 */
public class Doador {
    
    @SerializedName("Nome") private String nome;
    @SerializedName("Email") private String email;
    @SerializedName("Valor_doado") private BigDecimal valorDoado;

    public Doador(String nome, String email, double valorDoado) {
        this.nome = nome;
        this.email = email;
        this.valorDoado = new BigDecimal(valorDoado);
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public double getValorDoado() {
        return valorDoado.doubleValue();
    }
    
    
    
    
}
