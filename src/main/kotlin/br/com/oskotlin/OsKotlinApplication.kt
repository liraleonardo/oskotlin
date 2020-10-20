package br.com.oskotlin

import liquibase.integration.spring.SpringLiquibase
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class OsKotlinApplication


fun main(args: Array<String>) {
	runApplication<OsKotlinApplication>(*args)


}
