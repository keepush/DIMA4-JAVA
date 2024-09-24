import java.util.Scanner;

public class BubbleSort {
   public static void main(String[] args) {
      Scanner keyin = new Scanner(System.in);
      int temp;
//      int[] data = new int[10]; // 0 큰값, 1 중간값, 2 작은값
      int [] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      int cnt = 0;
      

//      for(int i = 0; i<data.length; ++i)
//         data[i] = (int)(Math.random() * 100 + 1) ;

      System.out.println("--정렬 전--");
      for(int tmp : data)
         System.out.print(tmp + " ");
      System.out.println();

      // 거품 정렬(Bubble Sort)
//      for(int j=data.length-1; j>0; --j ) {              //0
//         for(int i = 0; i<data.length -1; ++i) {          //1 2 3 
//            if (data[i] < data[i+1]) {
//               temp    = data[i];
//               data[i]    = data[i+1];
//               data[i+1]    = temp;      
//            }   
//         }
//      }
      
      for(int i=0; i<data.length-1; ++i) {
    	  cnt =0;
    	  for (int j=0; j < data.length-1-i; ++j) {
    		  if (data[j] < data[j+1]) {
    			  temp = data[j];
    			  data[j] = data[j+1];
    			  data[j+1] = temp;
    			  cnt++;
    		  }
    		  if (cnt==0) break;
    	  }
      }
      
      System.out.println("\n--정렬 후--");
      for(int tmp : data)
         System.out.print(tmp + " ");
      System.out.println();
      System.out.println("바꾼 횟수: " + cnt);
   }
}

