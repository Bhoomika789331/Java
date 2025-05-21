package day_3;

public class Practice_array {
      public static void  main(String[] args) {
    	  int a[]= {23,45,56,78};
    	  int min=a[0];//max
    	  for(int i=1;i<a.length;i++) {
    		  if(a[i]<min) {//>max
    			  min=a[i];//max
    		  }
    	  }
    			  System.out.println("min:"+min);//max
    		  
    		  
    	  
      }
}
