package br.senac.go.services;

import br.senac.go.domain.PessoaFisica;
import br.senac.go.generics.IService;
import br.senac.go.repositories.PessoaFisicaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PessoaFisicaService implements IService<PessoaFisica, Integer> {

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @Override
    public PessoaFisica create(PessoaFisica entity) {
        return pessoaFisicaRepository.save(entity);
    }

    @Override
    public PessoaFisica readById(Integer id) throws Exception {
        return pessoaFisicaRepository.findById(id).orElseThrow(() -> new Exception("Pessoa fisica não encontrada!"));
    }

    @Override
    public PessoaFisica read(PessoaFisica entity) throws Exception {
        return this.readById(entity.getId());
    }

    @Override
    public PessoaFisica updatePatch(PessoaFisica entity, Integer id) throws Exception {
        PessoaFisica pessoaFisica = this.readById(id);
        pessoaFisica.setPessoa(entity.getPessoa());
        pessoaFisica.setCpf(entity.getCpf());

        return pessoaFisicaRepository.save(pessoaFisica);
    }

    @Override
    public PessoaFisica updatePut(PessoaFisica entity, Integer id) throws Exception {
         if (pessoaFisicaRepository.findById(id).isPresent()) {
            return pessoaFisicaRepository.save(entity);
        } else throw new Exception("Pesssoa fisica não encontrada!");
    }

    @Override
    public void deleteById(Integer id) {
        pessoaFisicaRepository.deleteById(id);
    }

    @Override
    public void delete(PessoaFisica entity) {
        pessoaFisicaRepository.delete(entity);
    }
}
