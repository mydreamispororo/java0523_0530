package member.domain;

import java.time.LocalDate;
import java.util.List;

public class Member {
	//회원번호를 직접 생성: String
	//회원번호, 회원이름, 회원비번, 가입일
//	Integer num = 1;
//	Long num = 1L;
	private String MemID;
	private String MemName;
	private String MemPWD;
	private LocalDate MemDate = LocalDate.now();
	
	public Member() {}

	public String getMemID() {
		return MemID;
	}

	public void setMemID(String memID) {
		MemID = memID;
	}

	public String getMemName() {
		return MemName;
	}

	public void setMemName(String memName) {
		MemName = memName;
	}

	public String getMemPWD() {
		return MemPWD;
	}

	public void setMemPWD(String memPWD) {
		MemPWD = memPWD;
	}

	public LocalDate getMemDate() {
		return MemDate;
	}

	public void setMemDate(LocalDate memDate) {
		MemDate = memDate;
	}

	@Override
	public String toString() {
		return "Member [MemID=" + MemID + ", MemName=" + MemName + ", MemPWD=" + MemPWD + ", MemDate=" + MemDate + "]";
	}


	public void disp(List<Member> aList) {
		//list 출력할 때 줄은 get(인덱스번호)
		
		System.out.println("회원번호\t회원이름\t회원비밀번호\t가입일");
		System.out.println("-------------------------------------------------------");
		
		for(int i = 0; i < aList.size(); ++i) {
//			System.out.println(aList.get(i));
			String mid = aList.get(i).getMemID();
			String mname = aList.get(i).getMemName();
			String mpwd = aList.get(i).getMemPWD();
			LocalDate mdate = aList.get(i).getMemDate();
			
			
			System.out.println(mid + "\t" + mname + "\t" + mpwd + "\t" + mdate);
			
		}
	}
	
	 
	
	
	
	
}
