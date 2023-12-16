package br.senac.go.resources;

import br.senac.go.domain.Telefone;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class TelefoneResource implements GenericOperationsResource<Telefone, Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */
    @Override
    public Telefone post(Telefone entity) {
        return null;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    public List<Telefone> get() {
        return null;
    }

    @Override
    public Telefone get(Telefone entity) throws Exception {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Telefone put(Telefone entity, Integer id) {
        return null;
    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Telefone patch(Telefone entity, Integer id) {
        return null;
    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    public void delete(Telefone entity) {

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
