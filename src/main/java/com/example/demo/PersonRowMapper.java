package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
import com.example.model.User;
 
public class PersonRowMapper implements RowMapper<User> {
 
    public User mapRow(ResultSet resultSet, int arg1) throws SQLException {
    	User person = new User();
        person.setFirst_name(resultSet.getString(1));
        person.setLast_name(resultSet.getString(2));
        person.setEmail(resultSet.getString(3));
        person.setPassword(resultSet.getString(4));
        return person;
    }
}