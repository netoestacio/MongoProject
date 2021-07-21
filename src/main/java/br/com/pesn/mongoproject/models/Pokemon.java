package br.com.pesn.mongoproject.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document("Pokemon")
public class Pokemon {

    @Id
    private Integer id;
    private Integer number;
    private String name;
    private String[] type;
    private String gender;
    private String category;
    private String[] weakness;


}
