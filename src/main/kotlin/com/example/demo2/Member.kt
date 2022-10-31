package com.example.demo2

import org.jetbrains.annotations.NotNull
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @field:NotNull
    var memberId: Int=0,

    @field:NotNull
    var memberName: String="",

    @field:NotNull
    var memberRank: String="",
)