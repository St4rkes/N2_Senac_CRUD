package br.senac.go.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pessoa_fisica")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class PessoaFisica extends BaseModel implements Serializable {

    private String cpf;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa pessoa;
}