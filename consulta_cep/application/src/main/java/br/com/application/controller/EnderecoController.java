package br.com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.application.dto.EnderecoDto;
import br.com.application.servico.ApiServico;

@RestController
public class EnderecoController {

    @Autowired
    private ApiServico apiServico;

    @GetMapping("/endereco")
    public EnderecoDto buscarEndereco(@RequestParam String cep) {
        try {
            return apiServico.getEndereco(cep);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar o endereço: " + e.getMessage(), e);
        }
    }
}
