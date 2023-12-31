package br.senac.go.resources;

import br.senac.go.domain.Contato;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class ContatoResource implements GenericOperationsResource<Contato, Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */
    @Override
    public Contato post(Contato entity) {
        return null;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    public List<Contato> get() {
        return null;
    }

    @Override
    public Contato get(Contato entity) {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Contato put(Contato entity, Integer id) {
return null;
    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Contato patch(Contato entity, Integer id) {
return null;
    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    public void delete(Contato entity) {

    }

    /**
     * Deleta um registro no banco pelo identificador
     *
     * @param id
     */
    @Override
    public void deleteById(Integer id) {

    }
}
