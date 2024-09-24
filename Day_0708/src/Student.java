/*
 *  관련 있는 값을 저장하기 위한 용도로 만들어진 클래스
 *  VO (Value Object)
 *  접근지정자(access) : private, public, (default), protected
 *  속성은 private으로 지정한다.
 *  
 *  속성에 값을 대입하기 위해 접근하는 메소드: setter
 *  속성에 값을 꺼내기 위해 접근하는 메소드: getter
 */

// 캡슐화 ==> 정보 은닉(private)
public class Student {
	private String name;        // 멤버변수(인스턴스 변수), 속성
	private int kor;
	private int eng;
	private int mat;
	private double avg;
	
	// setter 생성하기
	public void setName(String n) {   // n: 지역변수 - this 붙이지 않음, 외부에서 사용 불가
		this.name = n;
	}
	
	public void setKor(int k) {
		this.kor = k;
	}
	
	public void setEng(int e) {
		this.eng = e;
	}
	
	public void setMat(int m) {
		this.mat = m;
	}
	
	public void setAvg(double a) {
		this.avg = a;
	}
	
	
	// getter 생성하기
	public String getName() {
		return this.name;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMat() {
		return this.mat;
	}
	
	public double getAvg() {
		return this.avg;
	}
	
	
	// 일반 메소드
	public void output() {
		System.out.printf("%3s %3d %3d %3d %.2f%n", name, kor, eng, mat, avg);
	}
}
