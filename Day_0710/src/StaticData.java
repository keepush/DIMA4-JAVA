
public class StaticData {
	//인스턴스 변수 : 자신의 클래스가 생성되면 탄생했다가... (Heap 영역)
	//				  그 객체를 pointing 하는 참조 변수가 없어지면 GC에 의해 소멸됨
	String title = "History of island"; 
	private int page;
	
	

	// 클래스 변수 - static이 붙은!, 프로그램이 구동되면 생성.. (Static 영역)
	// 				 프로그램이 종료되면 소멸	
	static int CODE = 12; 

	public void setPage(int page) {
		this.page = page;
	}

	public void process(int page) {
		int maxPage = 500;	// 지역 변수(stack) - 메소드를 호출하면 탄생했다가...


		{
			int inner = 150;
			maxPage += 10;
			System.out.println("inner= " + inner);
			System.out.println("Max Page= " + maxPage);
			//지역종료
		}

		//inner += 1; //바깥것을 안쪽에서 쓸 수는 있어도, 안쪽것은 바깥쪽에서 쓸 수 없음

	} // 지역이 닫히면 소멸합니다.
	
	
	public void calc() {
		this.title = "2024년 7월 어느날";  //인스턴스변수만 디스this 라고 함
		this.page = 1500;
		this.CODE = 7;	// 하나의 변수를 여러 객체에서 공유하면서 사용할 때; ex_공공인프라
		StaticData.CODE = 7; // 다른 클래스에 있는 인스턴스 변수 쓰는 법. 일단 this는 안됨
	}
}
