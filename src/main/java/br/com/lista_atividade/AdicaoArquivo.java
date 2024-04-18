package br.com.lista_atividade;

import java.io.*;

public class AdicaoArquivo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("meuarquivo.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("Isso é uma adição!");
            bufferedWriter.close();
            System.out.println("A mensagem foi adicionada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao tentar adicionar a mensagem!");
            e.printStackTrace();
        }
    }
}