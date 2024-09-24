package objectinherit;

import java.util.Objects;

class Friend {
   String name;
   int age;
   
   public Friend(String name, int age) {
      super();
      this.name = name;
      this.age = age;
   }
   
   public void output() {
      System.out.println(name + ", " + age + "살");
   }

   // 멤버 변수를 문자열로 변환하여 반환해주는 메소드
   @Override
   public String toString() {
      return "Friend [name=" + name + ", age=" + age + "]";
   }

//@Override
//public int hashCode() {
//	return Objects.hash(age, name);
//}
//
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Friend other = (Friend) obj;
//	return age == other.age && Objects.equals(name, other.name);  // true 반환
//}
   
   
   
   @Override
   public boolean equals(Object obj) {     // obj ==> f3,  f1 ==> this
	   // this의 name과 obj의 name이 같고, this의 age와 obj의 age가 같아야 같은 데이터이다.
	   // 전달인자인 object는 friend 타입이 아님  ==> 자식으로 바꿔 주어야 함
	   if(obj == this) return true;
	   if(obj == null) return false;   // null을 받았을 때 비교 동작 불가하기 때문
 	   Friend temp = (Friend)obj; // 부모가 자식으로 변경 ==> 하향 캐스팅

	   if((name.equals(temp.name)) && (age == temp.age))
			   return true;
	   else
		   return false;
   }
}

public class FriendTest {

   public static void main(String[] args) {
      Friend f1 = new Friend("손오공", 34);
      f1.output();
      
      // 전달 인자가 객체면 그 객체의 오버라이드된 toString()을 호출한다. 
      // 오버라이드 되어 있지 않으면 Object로부터 상속받은 순수 toStirng() 호출
      System.out.println(f1); // 주소 출력
      
      Friend f2 = new Friend("저팔계", 25);
      System.out.println(f2);
      
      Friend f3 = new Friend("손오공", 34);
      
      // 주소를 비교하는 것이므로 둘 다 false
      System.out.println(f1 == f2); // 주소 비교라 false
      System.out.println(f1 == f3);
      
      // 내용을 비교해서 같은 데이터라고 true를 출력하려면 오버라이딩 해야 함
      System.out.println(f1.equals(f3));
 //     System.out.println(f1.equals(f4));
      
      
      // -----------------------------------------------------------
      String addr = "서울시";
     System.out.println(addr.getClass());
     System.out.println(f1.getClass());
   }

}
