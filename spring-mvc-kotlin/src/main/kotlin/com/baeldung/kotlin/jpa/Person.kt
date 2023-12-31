package com.baeldung.kotlin.jpa

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Person @JvmOverloads constructor(
        @Column(nullable = false)
        val name: String,
        @Column(nullable = true)
        val email: String? = null,
        @OneToMany(cascade = [CascadeType.ALL])
        val phoneNumbers: List<PhoneNumber>?=null,
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int?=null)
