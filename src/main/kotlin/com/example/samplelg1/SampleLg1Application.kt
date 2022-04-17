package com.example.samplelg1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleLg1Application

fun main(args: Array<String>) {
	val context = runApplication<SampleLg1Application>(*args)
	context.getBean(Sample1::class.java).exec()
}
