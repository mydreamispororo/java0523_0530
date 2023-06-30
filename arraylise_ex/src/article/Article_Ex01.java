package article;

import article.domain.Article;

public class Article_Ex01 {

	public static void main(String[] args) {
		//게시판 만들기
		
		Article article = new Article();
		
		int num = 0;
		String title = "공지사항입니다.";
		String name = "관리자";
		String text = "공지사항 게시판 테스트입니다.";
		
		//객체 필드에 저장
		article.setaID(++num);
		article.setSubject(title);
		article.setWriter(name);
		article.setContent(text);
		
		article.disp(article);
		
		
		
		
		
		
		
		
		

	}

}
