package com.programandofodacci.terranovaindustrialist.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1><strong>Criação, Leitura, Alteração, Deletação de Arquivo e Pastas</strong></h1>
 * <p>Essa classe tem como um objetivo de ler, alterar, criar e deletar arquivos do projeto</p>
 * 
 * @see BufferedReader
 * @see FileReader
 * @see IOException
 * @see ArrayList
 * 
 * 
 * 
 * @author Ultra Luminatio 13
 */
public class CLADAP {
    public String lerArquivosPequenos(String local){
        String conteudo = "";
        try{
            List<String> linhas = Files.readAllLines(Paths.get(local));
            for(String linha: linhas){
                conteudo += linha + "";
            }
        }
        catch (IOException e) {
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return conteudo;
    } 
    public String lerArquivosGrandes(String local){
        StringBuilder conteudo = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(local))) {
            String linha;
            while((linha = br.readLine()) != null){
                conteudo.append(linha);
            }
        } 
        catch (IOException e) {
            //TODO: Adicionar uma classe para armazenar algumas exceptions

        }

        return conteudo.toString();
    }
    
    public ArrayList<String> lerLinhasDeArquivosGrandes(String local){
        ArrayList<String> linhas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(local))) {
            String linha = br.readLine();
            linhas.add(linha);
            while(linha != null){
                linha = br.readLine();
                linhas.add(linha);
            }
            
            return linhas;
        } 
        catch (IOException e) {
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        
        return null;
    }
    public ArrayList<String> lerLinhasDeArquivosPequenos(String local){
        ArrayList<String> linhas = new ArrayList<>();
        try{
            for(String linha: Files.readAllLines(Paths.get(local))){
                linhas.add(linha);
            }
            return linhas;
        }
        catch (IOException e) {
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    
    public boolean criarArquivo(String local){
        Path caminho = Paths.get(local);
        try{
            Files.createFile(caminho);
            return true;
        }
        catch(FileAlreadyExistsException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public boolean editarArquivoPequeno(String local, String conteudo){
        Path caminho = Paths.get(local);
        try{
            Files.write(caminho, conteudo.getBytes());
            return true;
        }
        catch(FileAlreadyExistsException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public boolean editarArquivoPequeno(String local, String conteudo, StandardOpenOption configuracao){
        Path caminho = Paths.get(local);
        try{
            Files.write(caminho, conteudo.getBytes(), configuracao);
            return true;
        }
        catch(FileAlreadyExistsException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public boolean editarArquivoGrande(String local, String conteudo){
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(local))){
            bw.write(conteudo);
            return true;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    public boolean editarArquivoGrande(String local, String conteudo, StandardOpenOption configuracao){
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(local), configuracao)){
            bw.write(conteudo);
            return true;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public boolean deletarArquivo(String local){
        try{
            Files.deleteIfExists(Paths.get(local));
            return true;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public boolean verificarArquivo(String local){
        Path caminho = Paths.get(local);
        return Files.exists(caminho);
    }
    
    public boolean criarDiretorio(String local){
        Path caminho = Paths.get(local);
        try{
            Files.createDirectory(caminho);
            return true;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public boolean verificarDiretorio(String local){
        Path caminho = Paths.get(local);
        return Files.isDirectory(caminho);
    }
}
