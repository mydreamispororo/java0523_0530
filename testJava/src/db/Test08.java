package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test08 {

	public static void main(String[] args) {
		//DB 입출력
		//연결 : connection 객체(연결 정보가 필요) -> DriverManager
		//쿼리실행 : PreparedStatement 객체
		//(출력) : ResultSet 객체
		
		String url = "jdbc:mysql://localhost:3306/springdb";
		String id = "spring12";
		String pwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결");
			
			
			//쿼리실행
//			1. primary key 가 있으면
//			insert into 테이블명(쿼리1, 쿼리2..) values(값1, 값2..)
//			
//			2. primary key 없으면
//			insert into 테이블명 values(값1, 값2..)
			
			String query = "insert into member(mem_name, mem_passwd) values(?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "koreait");
			pstmt.setString(2, "1234");
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("회원가입이 완료되었습니다.");
			}
//			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
