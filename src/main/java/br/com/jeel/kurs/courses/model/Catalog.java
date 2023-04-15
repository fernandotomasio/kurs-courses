package br.com.jeel.kurs.courses.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "catalogs")
public class Catalog {
    @Id
    private String id;
    private String title;
    private String description;
}