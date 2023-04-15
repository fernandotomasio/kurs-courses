package br.com.jeel.kurs.courses.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoverPage {
    private String title;
    private String description;
    private String author;
    private String date;
    private String version;
    private String logoUrl;
}