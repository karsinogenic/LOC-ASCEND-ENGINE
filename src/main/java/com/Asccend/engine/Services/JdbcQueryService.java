package com.Asccend.engine.Services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcQueryService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcQueryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> executeCustomQuery(String query) {
        List<Map<String, Object>> result = jdbcTemplate.queryForList(query);
        return result;
    }
}
