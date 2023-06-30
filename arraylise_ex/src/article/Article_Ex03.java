package article;

import java.util.ArrayList;
import java.util.List;

import article.dao.ArticleDao;
import article.domain.Article;

public class Article_Ex03 {

	public static void main(String[] args) {
		//10줄(안에 내용)
		List<Article> aList = new ArrayList<>();
		
		
		//변수
		int num = 0;
		String title = "공지사항입니다.";
		String name = "관리자";
		String text = "공지사항 게시판 테스트입니다.";
		
		for(int i = 0; i < 10; ++i) {
			Article article = new Article();
			article.setaID(num++);
			article.setSubject(title + " - " + i);
			article.setWriter(name + " - " + i);
			article.setContent(text + " - " + i);
			aList.add(article);
			
		}

		ArticleDao dao = new ArticleDao();
		dao.selectAllarticle(aList);
	
	
	
	}

}
