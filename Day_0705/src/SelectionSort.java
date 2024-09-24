import java.util.Scanner;

public class SelectionSort {
   public static void main(String[] args) {
      Scanner keyin = new Scanner(System.in);
      int temp;
      int[] data = new int[10]; // 0 큰값, 1 중간값, 2 작은값

      for(int i = 0; i<data.length; ++i)
         data[i] = (int)(Math.random() * 100 + 1) ;

      System.out.println("--정렬 전--");
      for(int tmp : data)
         System.out.print(tmp + " ");
      System.out.println();

      // 선택정렬(교환정렬)
      for(int i=0; i<data.length-1; ++i ) {              //0
         for(int j = i+1; j<data.length; ++j) {          //1 2 3 
            if (data[i] < data[j]) {
               temp    = data[i];
               data[i]    = data[j];
               data[j]    = temp;      
            }   
         }
      }
      
      System.out.println("\n--정렬 후--");
      for(int tmp : data)
         System.out.print(tmp + " ");
      System.out.println();
   }
}


//		if (data[0] < data[1]) {
//			temp = data[0];
//			data[0] = data[1];
//			data[1] = temp;
//		}  // data[0] 변수에는 가장 큰 값
//			
//		if (data[1] < data[2]) {
//			temp = data[0];
//			data[0] = data[2];
//			data[2]= temp;
//		}  // data[1]에는 data[2]보다 큰 값
//			
//				
//		System.out.printf("큰 값은 %d이고, 중간값 %d, 작은 값은 %d%n", data[0], data[1], data[2]);

