package com.example.algorithm.exception.nullpointerexception;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collections;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2020/5/11 22:39
 */
public class Test04 {

    public void test(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        // 当查询结果为空时，返回 new ArrayList<>()
        jdbcTemplate.queryForList("SELECT * FROM person");

        // 若找不到该条记录，则抛出 EmptyResultDataAccessException
        jdbcTemplate.queryForObject("SELECT age FROM person WHERE id = 1", Integer.class);
    }

    // 支持泛型集合
    public <T> List<T> testReturnCollection() {

        return Collections.emptyList();
    }

}
