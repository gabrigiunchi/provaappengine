package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController {


    @Value("\${application.version}")
    private lateinit var version: String

    @GetMapping
    fun foo(): ResponseEntity<String> {
        return ResponseEntity.ok(this.version)
    }
}