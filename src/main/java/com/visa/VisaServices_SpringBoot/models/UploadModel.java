package com.visa.VisaServices_SpringBoot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UploadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String holderPassportNo;
    private String holderDateOfBirth;
    private String holderNationality;
    private Long fileId;


    @CreationTimestamp
    private LocalDateTime createdDateTime;
}
