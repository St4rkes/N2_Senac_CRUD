package br.senac.go.resources;

import br.senac.go.domain.Endereco;
import br.senac.go.generics.GenericOperationsResource;

import java.util.List;

public class EnderecoResource implements GenericOperationsResource<Endereco, Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */
    @Override
    public Endereco post(Endereco entity) {
        return null;
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    public List<Endereco> get() {
        return null;
    }

    @Override
    public Endereco get(Endereco entity) throws Exception {
        return null;
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Endereco put(Endereco entity, Integer id) {
return  null;
    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    public Endereco patch(Endereco entity, Integer id) {
return null;
    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    public void delete(Endereco entity) {

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
