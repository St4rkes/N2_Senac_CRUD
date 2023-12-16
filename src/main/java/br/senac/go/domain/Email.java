package br.senac.go.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "email")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Email extends BaseModel{
    private String enderecoEmail;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    @ManyToOne(fetch = FetchType.LAZY)
    private Contato contato;
}
