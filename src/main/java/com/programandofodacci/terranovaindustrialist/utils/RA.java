package com.programandofodacci.terranovaindustrialist.utils;

import java.nio.file.Path;

/**
 * <h1>Relocador de Arquivo</h1>
 * <p>Essa classe serve para quando for receber um parametro
 * indicando o local de acordo com o projeto já retornado o local do
 * arquivo sem precisar definir um if/else para verificar o SO onde o projeto
 * está rodando</p>
 * @author UltraLuminatio
 */
public class RA {
    private static final String DIR = System.getProperty("user.dir");
    private static final String SO = System.getProperty("os.name").toLowerCase();
    
    //Getters
    public static String getDIR() {
        return DIR;
    }
    
    //Funções extras
    /**
     * Na entrada da string local tem que usar a "/" para mostrar o local que vai ser 
     * trocado por um outro caracter dependendo do SO
     * @param local
     * @return local do arquivo definido pro arquivo
     */
    public static String replaceLocale(String local){
        return Path.of(DIR)
            .resolve(local)
            .normalize()
            .toString();
    }
    
    /**
     * Na entrada da string local tem que usar a "/" para mostrar o local que vai ser 
     * trocado por um outro caracter dependendo do SO
     * @param local
     * @param arquivo 
     * @return local do arquivo definido pro arquivo
     */
    public static String replaceLocale(String local, String arquivo){
        return Path.of(DIR)
            .resolve(local+arquivo)
            .normalize()
            .toString();
    }
    
}
