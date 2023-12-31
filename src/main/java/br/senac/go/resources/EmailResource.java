package br.senac.go.resources;

import br.senac.go.domain.Email;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class EmailResource implements GenericOperationsResource<Email, Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */
    @Override
    public Email post(Email entity) {
        return null;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    public List<Email> get() {
        return null;
    }

    @Override
    public Email get(Email entity) throws Exception {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Email put(Email entity, Integer id) {
return null;
    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Email patch(Email entity, Integer id) {
        return null;
    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    public void delete(Email entity) {

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
