package uz.sobirjonov.korxona.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "pasport")
public class Pasport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String card_number;

    private String surname;

    private String name;

    private String patronymic;

    private LocalDate dateOfBirth;

    private LocalDate dateOfIssue;

    private LocalDate dateOfExpiry;

    private String sex;

    private String citizenship;

    private Long personalNumber;

    private String placeOfIssue;
}
