package br.com.bendo.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bendo.portal.model.Pessoa;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaController extends GenericController<Pessoa, Integer> {

}
