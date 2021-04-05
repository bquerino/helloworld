package com.mycompany.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloworldApplication

fun main(args: Array<String>) {
	runApplication<HelloworldApplication>(*args)
}

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello world!"),
		Message("2", "Bonjour le monde!"),
		Message("3", "Olá mundo!"),
		Message("4", "Hallo Welt"),
		Message("5", "Ciao mondo")
	)
}

data class Message(val id: String?, val text: String)
