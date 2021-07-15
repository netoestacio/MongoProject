package br.com.pesn.mongoproject.models;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Document(collation = "arquivo")
public class Arquivo {

    @Id
    private String id;
    private String data;
    private String nome;
    private String conteudo;

    public Arquivo(String nome, String conteudo){
        this.nome = nome;
        this.conteudo = conteudo;
        this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}
