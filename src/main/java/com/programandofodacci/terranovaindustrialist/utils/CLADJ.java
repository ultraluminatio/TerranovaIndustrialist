package com.programandofodacci.terranovaindustrialist.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 * <h1><strong>Criação, Leitura, Alteração, Deletação de Json</strong></h1>
 * <p>Essa classe tem como um objetivo de ler, alterar, criar e deletar Strings em formatos JSON</p>
 * 
 * @see Gson
 * @see GsonBuilder
 * @see JsonSyntaxException
 * 
 * 
 * 
 * @author Ultra Luminatio 13
 */
public class CLADJ {
    private static Gson gson;
    
    
    public <T extends Object> T getClasse(String json, Class<T> classe){
        try{
            gson = new GsonBuilder().create();
            T saida = gson.fromJson(json, classe);
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    public <T extends Object> T getClasse(String json, Type tipoClasse){
        try{
            gson = new GsonBuilder().create();
            T saida = gson.fromJson(json, tipoClasse);
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    public <T extends Object> T getClasse(String json, TypeToken<T> tipoClasse){
        try{
            gson = new GsonBuilder().create();
            T saida = gson.fromJson(json, tipoClasse);
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    
    public String toJson(Object objeto){
        try{
            gson = new GsonBuilder().
                    setPrettyPrinting().
                    excludeFieldsWithoutExposeAnnotation().
                    create();
            String saida = gson.toJson(objeto, objeto.getClass());
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    public String toJson(Object objeto, Class classe){
        try{
            gson = new GsonBuilder().
                    setPrettyPrinting().
                    excludeFieldsWithoutExposeAnnotation().
                    create();
            String saida = gson.toJson(objeto, classe);
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    public String toJson(Object objeto, Type Tipoclasse){
        try{
            gson = new GsonBuilder().
                    setPrettyPrinting().
                    excludeFieldsWithoutExposeAnnotation().
                    create();
            String saida = gson.toJson(objeto, Tipoclasse);
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    } 
    
}
   