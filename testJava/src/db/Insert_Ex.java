package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Ex {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/koreait12";
		String id = "koreait2";
		String pwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			
			String query = "insert into member(mem_name, mem_pwd, mem_regdate, mem_gender, mem_intro) values(?, ?, now(), ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "강민지");
			pstmt.setString(2, "3333");
			pstmt.setString(3, "W");
			pstmt.setString(4, "소개3");
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
