package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	
	public HashMap<Integer , Coffe> findAll(){
		HashMap<Integer, Coffe> data = new HashMap<>();
		                                 // desc - 내림차순, asc-오름차순
		String sql="select * from coffe"; // coffe order by price desc; 
		
		try {
			
			pt=conn.prepareStatement(sql);
			rs = pt.executeQuery();  // select - executeQuery , 
			                       // insert update delete - executeUpdate
			while(rs.next()) {
				// rs.get데이터타입("컬럼명")
				data.put(rs.getInt("coffe_id"),
			new Coffe( rs.getString("item_name") , rs.getInt("price"),
							rs.getBoolean("decaffein") )	
						);
			}
			
		}catch(SQLException e) {
			System.out.println("coffe테이블 조회 실패");
		}
		
		
		return data;
	}
}










