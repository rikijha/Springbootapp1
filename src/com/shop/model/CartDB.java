package com.shop.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Component;

import com.shop.beans.Product;
import com.shop.beans.Vendor;

@Component
public class CartDB {
	JdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbc = new JdbcTemplate(dataSource);
	}
public List<Product> getAllProduct() {
	return jdbc.query("select * from product", new RowMapper<Product>() {

		@Override
		public Product mapRow(ResultSet rs, int arg1) throws SQLException {
			Product p=new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getString("price"));
			p.setDescription(rs.getString("description"));
			return p;
		}
	});
}

public void createVendor(Vendor v) {
	BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(v);
	
}
}
