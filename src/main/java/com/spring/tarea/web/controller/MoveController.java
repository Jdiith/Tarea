package com.spring.tarea.web.controller;

import com.spring.tarea.domain.Move;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/move")
public class MoveController {
    static List<Move> lista=new ArrayList<Move>();
    static {

        lista.add(new Move("Harry Potter y  la Órden del Fénix","PG-13",138));
        lista.add(new Move("Harry Potter y el Misterio del Príncipe","PG",153));
        lista.add(new Move("Harry Potter y las Reliquias de la Muerte – Parte 1","PG-13",146));
        lista.add(new Move("Los juegos del hambre","PG-13",142));
    }

    @GetMapping("/all")
    public List<Move> getMove() {
        return lista;
    }

    @PostMapping(path="/save")
    public ResponseEntity<String> save(@RequestBody Move l) {
        lista.add(l);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    

}
