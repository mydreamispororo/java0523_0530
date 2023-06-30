package article;

import java.util.ArrayList;
import java.util.List;

import article.dao.ArticleDao;
import article.domain.Article;

public class Article_Ex02 {

	public static void main(String[] args) {
		//객체(1명의 내용) + Collections(arraylist) 목록
		
		//****** 1줄만 있는 게시판 ******
		//게시물 row(줄)
//		List<객체명> 별명 = new 자식<>();
		List<Article> aList = new ArrayList<>();
		
		//게시물 내용
		Article article = new Article();
		
		int num = 0;
		String title = "공지사항입니다.";
		String name = "관리자";
		String text = "공지사항 게시판 테스트입니다.";
		
		
		//필드에 저장 -> 줄이 x : 줄 안에 내용을 만들어 주는 것
		article.setaID(++num);
		article.setSubject(title);
		article.setWriter(name);
		article.setContent(text);
		
		aList.add(article); //줄을 만들어줌
		
		ArticleDao dao = new ArticleDao();
		dao.selectArticle(aList);
		
		
		
	}

}
