package br.com.gustavo.gestao_vagas.modules.candidate.controller;


import br.com.gustavo.gestao_vagas.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity) {
        System.out.println("Candidato criado: ");
        System.out.println(candidateEntity.getEmail());
    }


}
