package com.autodesk.lp.sample.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author David.Tegart
 */
@RestController
public class SampleController {

    private static final UUID ID = UUID.randomUUID();

    @RequestMapping(value = "/id")
    public ResponseEntity<String> getId() {
        return new ResponseEntity<>(ID.toString(), HttpStatus.OK);
    }
}