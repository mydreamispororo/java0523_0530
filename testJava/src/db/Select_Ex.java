package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_Ex {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/koreait12";
		String id = "koreait2";
		String pwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			
			String query = "select mem_id, mem_name, mem_pwd, mem_regdate, mem_gender, mem_intro from member order by mem_id desc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			System.out.println("회원아이디\t회원이름\t비밀번호\t가입일\t\t성별\t자기소개");
			
			if(rs.next()) {
				
		
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6));
				}while(rs.next());
				

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
