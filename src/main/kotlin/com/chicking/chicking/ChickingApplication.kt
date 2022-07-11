package com.chicking.chicking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class ChickingApplication

fun main(args: Array<String>) {
    runApplication<ChickingApplication>(*args)
}
