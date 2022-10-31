package com.example.demo2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository


@Repository
class HelloRepository(@Autowired private val jdbcTemplate: JdbcTemplate) {
    fun findById(id: Int?): Map<String, Any> {

        // SELECT文
        val query = ("SELECT * FROM member WHERE member_id=?")

        // 検索実行
        return jdbcTemplate.queryForMap(query, id)
    }
}