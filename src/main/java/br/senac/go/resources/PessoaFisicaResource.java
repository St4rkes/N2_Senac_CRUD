package br.senac.go.resources;

import br.senac.go.domain.PessoaFisica;
import br.senac.go.generics.GenericOperationsResource;
import br.senac.go.services.PessoaFisicaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/pessoaFisica")
@Api(value="Operações para manipulação dos dados do pessoa",
        tags = "pessoaFisica ")
public class PessoaFisicaResource implements
        GenericOperationsResource<PessoaFisica, Integer> {
    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     *
     * @param entity
     * @return
     */

    @Autowired
    private PessoaFisicaService pessoaFisicaService;

    @Override
    @PostMapping("/create")
    public PessoaFisica post(@RequestBody PessoaFisica entity) {
        return pessoaFisicaService.create(entity);
    }

    /**
     * Retorna uma lista de entidades
     *
     * @return
     */
    @Override
    @GetMapping("/read/all")
    public List<PessoaFisica> get() {return null;
    }

    @Override
    @GetMapping("/read")
    public PessoaFisica get(@RequestBody PessoaFisica entity) throws Exception {
        return pessoaFisicaService.read(entity);
    }

    /**
     * Atualiza TODO o registro
     *
     * @param entity
     * @param id
     */
    @Override
    @PutMapping("/update/all/{id}")
    public PessoaFisica put(@RequestBody PessoaFisica entity,@PathVariable("id") Integer id) throws Exception {
        return pessoaFisicaService.updatePut(entity, id);
    }

    /**
     * Atualiza parcialmente um registro
     *
     * @param entity
     * @param id
     */
    @Override
    @PatchMapping("/update/patch/{id}")
    public PessoaFisica patch(@RequestBody PessoaFisica entity, @PathVariable("id") Integer id) throws Exception {
        return pessoaFisicaService.updatePatch(entity, id);
    }

    /**
     * Deleta um registro no banco;
     *
     * @param entity
     */
    @Override
    @DeleteMapping
    public void delete(@RequestBody PessoaFisica entity) {
        pessoaFisicaService.delete(entity);
    }

    /**
     * Deleta um registro no banco pelo identificador
     *
     * @param id
     */
    @Override
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        pessoaFisicaService.deleteById(id);
    }
}
