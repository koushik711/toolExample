package com.qa.visa.repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.qa.visa.model.OrderDetails;

@Repository
public class SpringVisaToolDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQL = "select RETURN_REASON_CD from return_reason where RETURN_REASON_CD=8";
	
	public List<OrderDetails> isData() {
		
		List<OrderDetails> orderdetails = new ArrayList<OrderDetails>();
		List<Map<String, Object>> resultSet =  jdbcTemplate.queryForList(SQL);

//		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		
		for (Map<String, Object> row : resultSet) {
			System.out.println("row size is:"+ resultSet.size());
			System.out.println("row content"+ row.keySet());

		}

		return orderdetails;
		
	}

	public void isData(int oid) {
		System.out.println("The orderId entered is :: "+oid);
		String SQL = "select * from pmt_method where payment_method_id in(select payment_method_id from payment_instruction where order_id in("+oid+"))";
		String rnp_brand = "RESERVE_PAY";
		List<Map<String, Object>> result =  jdbcTemplate.queryForList(SQL);
		if(result.size()<1){
			System.out.println("No data found");
		}
		for (Map<String, Object> row : result) {
			System.out.println(row.get("BRAND"));
			if(row.get("BRAND").equals(rnp_brand)){
				System.out.println("Order is rnp order: following rnp flow");
			}
		}
		System.out.println("Order is non rnp order: following normal flow");
		
		
	}
}