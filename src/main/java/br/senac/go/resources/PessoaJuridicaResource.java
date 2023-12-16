package br.senac.go.resources;

import br.senac.go.domain.PessoaJuridica;
import br.senac.go.generics.GenericOperationsResource;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class PessoaJuridicaResource implements GenericOperationsResource<PessoaJuridica, Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */
    @Override

    public PessoaJuridica post(@RequestBody PessoaJuridica entity) {
        return null;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override

    public List<PessoaJuridica> get() {
        return null;
    }

    @Override

    public PessoaJuridica get(@RequestBody PessoaJuridica entity) throws Exception {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override

    public PessoaJuridica put(@RequestBody PessoaJuridica entity, @PathVariable("id")  Integer id) {
        return null;
    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override

    public PessoaJuridica patch(@RequestBody PessoaJuridica entity, @PathVariable("id") Integer id) {
return null;
    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override

    public void delete(@RequestBody PessoaJuridica entity) {

    }

    /**
     * Deleta um registro no banco pelo identificador
     *
     * @param id
     */
    @Override

    public void deleteById(@PathVariable("id") Integer id) {

    }
}
