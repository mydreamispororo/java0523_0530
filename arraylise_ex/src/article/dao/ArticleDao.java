package article.dao;

import java.time.LocalDate;
import java.util.List;

import article.domain.Article;

public class ArticleDao {
	
	public void selectArticle(List<Article> list) {
		
		System.out.println("번호\t제목\t작성자\t내용\t등록일자");
		for(int i = 0; i < list.size(); ++i) {
			//get : 줄번호
			int id = list.get(i).getaID();
			String subject = list.get(i).getSubject();
			String writer = list.get(i).getWriter();
			String content = list.get(i).getContent();
			LocalDate regdate = list.get(i).getRegdate();
			System.out.println(id + "\t" + subject + "\t" + writer + "\t" + content + "\t" + regdate);
			
			
		}
	}

	public void selectAllarticle(List<Article> list) {
		System.out.println("-------------------------------");
		System.out.println("번호\\t제목\\t작성자\\t내용\\t등록일자");
		System.out.println("-------------------------------");
		
		for(int i = 0; i < list.size(); ++i) {
			int num = list.get(i).getaID();
			String subject = list.get(i).getSubject();
			String writer = list.get(i).getWriter();
			String content = list.get(i).getContent();
			LocalDate regdate = list.get(i).getRegdate();
			
			System.out.println(num + "\t" + subject + "\t" + writer + "\t" + content + "\t" + regdate);
			System.out.println("-------------------------------");
		}
		
	}
}
