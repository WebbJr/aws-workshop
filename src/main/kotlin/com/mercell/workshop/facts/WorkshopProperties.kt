package com.mercell.workshop.facts

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties("workshop")
@ConstructorBinding
data class WorkshopProperties(
    val fact: String = "Not a fact :)"
)