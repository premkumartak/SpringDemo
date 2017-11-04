package com.example.repoImpl;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.PersonRowMapper;
import com.example.model.LoginUser;
import com.example.model.User;
import com.example.repo.RegistrationDao;
import com.mysql.jdbc.Connection;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
@Autowired	
private JdbcTemplate jdbcTemplate;

@Override
	public void registerStudent(User user) {

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajay","root","root");
			PreparedStatement ps=con.prepareStatement("insert into student(first_name,last_name,email,password) values(?,?,?,?)");
			
			ps.setString(1, user.getFirst_name());
			ps.setString(2, user.getLast_name());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public List<User> selectAll() {
    return jdbcTemplate.query("SELECT * from student",
            new PersonRowMapper());
}
	

}
