package com.ntt.demo1.controller;

import com.ntt.demo1.domain.MonitorUfficio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/monitorUfficio")
public class MonitorUfficioController {

    @GetMapping("/")
    public ResponseEntity<MonitorUfficio> returnMonitorUfficio(){
        MonitorUfficio monitorUfficio = new MonitorUfficio();
        Set<String> inputs = new HashSet<>();
        monitorUfficio.setInputs(inputs);
        inputs.add("ciao");
        monitorUfficio.setInput("hdmi");
        monitorUfficio.setColore("blu");
        monitorUfficio.setMarca("Samsung");
        return new ResponseEntity<>(monitorUfficio,HttpStatus.OK);
    }


    @PostMapping("/")

    public ResponseEntity<?> createMonitorUfficio(@RequestBody MonitorUfficio monitorUfficio){
       MonitorUfficio monitorUfficio1 = monitorUfficio;
        return new ResponseEntity<>(monitorUfficio1,HttpStatus.CREATED);
    }

    @PutMapping("/{marca}")
    public ResponseEntity<?> updateMonitorUfficio(@PathVariable String marca,@RequestBody MonitorUfficio monitorUfficio){
        MonitorUfficio monitorUfficio2 = new MonitorUfficio();
        Set<String> inputs = new HashSet<>();
        inputs.add("ciao");
        monitorUfficio2.setInput("hdmi");
        monitorUfficio2.setColore("blu");
        monitorUfficio2.setMarca("Samsung");
        monitorUfficio2.setInputs(inputs);

        if (monitorUfficio2.getMarca().equals(marca))
            return new ResponseEntity<>(monitorUfficio,HttpStatus.OK);
        return new ResponseEntity<>(monitorUfficio,HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{marca}")
    public ResponseEntity<?> deleteMonitorUfficio(@PathVariable String marca,@RequestBody MonitorUfficio monitorUfficio){
        System.out.println("Monitor Ufficio: " + marca);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
