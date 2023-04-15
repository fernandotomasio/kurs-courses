package br.com.jeel.kurs.courses.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("courses")
public class Course {
    @Id
    private String id;
    private String title;
    private String description;
    private String code;
    private Boolean active;
    private CourseType courseType;
    private CoverPage coverPage;
}
