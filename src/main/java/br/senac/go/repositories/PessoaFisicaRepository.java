package br.senac.go.repositories;

import br.senac.go.domain.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {
}
