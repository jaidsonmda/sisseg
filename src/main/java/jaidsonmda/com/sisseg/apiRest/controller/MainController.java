package jaidsonmda.com.sisseg.apiRest.controller;

import jaidsonmda.com.sisseg.apiRest.repository.SistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jaidsonmda.com.sisseg.apiRest.domain.Sistema;

import java.util.List;

@RestController
@RequestMapping(path="/home")
public class MainController {
    @Autowired
    private SistemaRepository sistemaRepository;
    @PostMapping(path="/cadastra")
    public @ResponseBody String adicionaNovoSistema (
            @RequestParam(required = true) String sigla,
            @RequestParam(required = true) String descricao,
            @RequestParam String email,
            @RequestParam String url
            ){
        Sistema s= new Sistema(descricao, sigla, email, url);
        sistemaRepository.save(s);
        return "Salvo!";
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path="/sistemas")
    public @ResponseBody Iterable<Sistema> allSistemas(){
        return sistemaRepository.findAll();
    }

}
