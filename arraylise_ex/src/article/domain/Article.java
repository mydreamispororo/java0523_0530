package article.domain;

import java.time.LocalDate;

public class Article {
	//번호, 제목, 작성자, 내용, 작성일
//	int -> Integer 10000000
//	id int not null auto_incre
//	
//	bigint -> Long
//	id bigtin not null
	
	private Integer aID;
	private String subject;
	private String writer;
	private String content;
	private LocalDate regdate = LocalDate.now(); //LocalDateTime 시간까지 나옴, LocalDate 날짜까지 나옴, 객체를 사용하는 시점의 시간이 저장
	
	public Article() {}

	public Integer getaID() {
		return aID;
	}

	public void setaID(Integer aID) {
		this.aID = aID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}
	
	
	public void disp(Article article) {
		System.out.println("번호\t제목\t작성자\t내용\t등록일자");
		System.out.println(article.getaID() + "\t" + article.getSubject() + "\t" + article.getWriter() + "\t" + article.getContent() + "\t" + article.regdate);
		
	}
			
	
	
	
	
	
	
	
	
	
}
