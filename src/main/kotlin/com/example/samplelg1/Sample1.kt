package com.example.samplelg1

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.time.OffsetDateTime

@Component
open class Sample1(
    private val jdbcTemplate: JdbcTemplate
) {

//    @Transactional
    fun exec() {
        val before = jdbcTemplate.queryForList("select * from sample_tbl order by id desc limit 3")
        println(before)

        jdbcTemplate.execute("insert into sample_tbl (txt) values ('${OffsetDateTime.now()}')")

        val list = jdbcTemplate.queryForList("select * from sample_tbl order by id desc limit 3")

        println(list)
    }
}