package com.programandofodacci.terranovaindustrialist.utils;

import com.google.gson.annotations.Expose;
import java.io.IOException;
import java.time.Duration;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * <h1>Enviador e recebidor de Metodos HTTP/HTTPS</h1>
 * <p>Essa classe server para fazer metodos post/get via web ainda terá futuras implementações</p>
 * @author UltraLuminatio
 */
public class ERMH {
    private static final OkHttpClient okc = new OkHttpClient
        .Builder()
            .callTimeout(Duration.ofSeconds(10))
            .readTimeout(Duration.ofSeconds(30))
            .build();

    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    //Metodos post
    public static String requestMethodPost(String link, String json) throws IllegalAccessError, RuntimeException{
        RequestBody corpoRequesicao;
        corpoRequesicao = RequestBody.create(json,JSON);
        
        Request requesicao = new Request
            .Builder()
                .url(link)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .post(corpoRequesicao)
                .build();
        
        try(Response resposta = okc.newCall(requesicao).execute()){
            if(!resposta.isSuccessful()){
                throw new IllegalAccessError("Erro HTTP: " + resposta.code());
            }
            
            if(resposta.body() == null){
                throw new IllegalAccessError("requisição falhada");
            }
            
            return resposta.body().string();
        }catch(IOException e){
            throw new RuntimeException("Erro na requisição do metodo post no link: " + link, e);
        }
    }
    
    //Metodos get
    public static String requestMethodGet(String link){
        Request requesicao = new Request
            .Builder()
                .url(link)
                .build();
        
        try(Response resposta = okc.newCall(requesicao).execute()){
            if(!resposta.isSuccessful()){
                throw new IllegalAccessError("Erro HTTP: " + resposta.code());
            }
            
            if(resposta.body() == null){
                throw new IllegalAccessError("requisição falhada");
            }
            
            return resposta.body().string();
        }catch(IOException e){
            throw new RuntimeException("Erro na requisição do metodo post no link: " + link, e);
        }
    }

    public static class GetParametros{
        @Expose private String parametro;
        @Expose private String valor;

        //Contrutores
        public GetParametros() {
        }
        public GetParametros(String parametro, String valor) {
            this.parametro = parametro;
            this.valor = valor;
        }
        
        
        //Getters
        public String getParametro() {
            if(parametro == null || parametro.isEmpty()) throw new IllegalArgumentException("Parametro vazio");
            return parametro;
        }
        public String getValor() {
            if(valor == null || valor.isEmpty()) throw new IllegalArgumentException("Valor vazio");
            return valor;
        }
        
        //funções extras

        @Override
        public String toString() {
            if(parametro == null || parametro.isEmpty()) throw new IllegalArgumentException("Parametro vazio");
            if(valor == null || valor.isEmpty()) throw new IllegalArgumentException("Valor vazio");
            return getParametro() + "=" + getValor();
        }
        
        
    }
    
    public static String requestMethodGet(String link, String json){
        CLADJ cladj = new CLADJ();
        
        String novoLink = link;
        GetParametros[] gts = cladj.getClasse(json, GetParametros[].class);
        if(gts==null){
            throw new IllegalArgumentException("Requisição vazia");
        }
        if(!(gts==null)){
            try{
                novoLink += "?";
                int qntd_parametros = 0;
                for(GetParametros get : gts){
                    novoLink += String.format("%s", get.toString());
                    if(qntd_parametros < gts.length - 1) novoLink += "&";
                    qntd_parametros++;
                }
            }
            catch(IllegalArgumentException e){
                throw new IllegalArgumentException(e);
            }
        }
        
        Request requesicao = new Request
            .Builder()
                .url(novoLink)
                .build();
        
        try(Response resposta = okc.newCall(requesicao).execute()){
            if(!resposta.isSuccessful()){
                throw new IllegalAccessError("Erro HTTP: " + resposta.code());
            }
            
            if(resposta.body() == null){
                throw new IllegalAccessError("requisição falhada");
            }
            
            return resposta.body().string();
        }catch(IOException e){
            throw new RuntimeException("Erro na requisição do metodo get no link: " + link, e);
        }
    }
    
    public static String requestMethodGet(String link, GetParametros... gp){
        
        String novoLink = link;
        if(gp==null){
            throw new IllegalArgumentException("Requisição vazia");
        }
        if(!(gp==null)){
            try{
                novoLink += "?";
                int qntd_parametros = 0;
                for(GetParametros get : gp){
                    novoLink += String.format("%s", get.toString());
                    if(qntd_parametros < gp.length - 1) novoLink += "&";
                    qntd_parametros++;
                }
            }
            catch(IllegalArgumentException e){
                throw new IllegalArgumentException(e);
            }
        }
        
        Request requesicao = new Request
            .Builder()
                .url(novoLink)
                .build();
        
        try(Response resposta = okc.newCall(requesicao).execute()){
            if(!resposta.isSuccessful()){
                throw new IllegalAccessError("Erro HTTP: " + resposta.code());
            }
            
            if(resposta.body() == null){
                throw new IllegalAccessError("requisição falhada");
            }
            
            return resposta.body().string();
        }catch(IOException e){
            throw new RuntimeException("Erro na requisição do metodo get no link: " + link, e);
        }
    }
    
    
    //Getters
    public static OkHttpClient getOkc() {
        return okc;
    }
    public static MediaType getJSON() {
        return JSON;
    }
    
    
    
}
