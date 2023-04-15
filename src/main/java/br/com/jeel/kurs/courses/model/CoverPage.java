package br.com.jeel.kurs.courses.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 *
 * @author fernandofot
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoverPage {

    private String objective;
    private String level;
    private String prerequisites;
    private String disciplines;
    private String maintenanceLevel;
    private String qualification;
    private String notes;
}
