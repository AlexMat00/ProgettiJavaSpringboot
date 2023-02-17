package com.ntt.demo1.controller;

import com.ntt.demo1.domain.Canale;
import com.ntt.demo1.domain.Tv;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/tv")
public class TvController {
    @GetMapping("/")
    public ResponseEntity<Tv> returnTv(){
        Tv tv = new Tv();
        tv.setCanale(1);
        tv.setColore("nero");
        tv.setMarca("Poco");
        Canale canale1 = new Canale("RAi1",1,false);
        Canale canale2 = new Canale("RAi2",2,false);
        Canale canale3 = new Canale("RAi3",3,false);
        ArrayList<Canale> canali = new ArrayList<>();
        canali.add(canale1);
        canali.add(canale2);
        canali.add(canale3);
        tv.setCanali(canali);
        tv.setId(1);

        return new ResponseEntity<>(tv, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> createTv(@RequestBody Tv tv){
        Tv tv1 = tv;
        return new ResponseEntity<>(tv1,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateTv(@PathVariable long id,@RequestBody Tv tv){
        Tv tv2 = new Tv();
        tv2.setId(1);
        tv2.setMarca("Panasonic");
        tv2.setColore("arancione");
        tv2.setCanale(6);
        Canale canale1 = new Canale("RAi1",1,false);
        Canale canale2 = new Canale("RAi2",2,false);
        Canale canale3 = new Canale("RAi3",3,false);
        ArrayList<Canale> canali = new ArrayList<>();
        canali.add(canale1);
        canali.add(canale2);
        canali.add(canale3);
        tv2.setCanali(canali);
        if (tv2.getId() == id)
            return new ResponseEntity<>(tv,HttpStatus.OK);
        return new ResponseEntity<>(tv,HttpStatus.NO_CONTENT);
}



}

