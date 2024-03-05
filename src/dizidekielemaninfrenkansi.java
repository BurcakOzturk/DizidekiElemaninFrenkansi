import java.util.Arrays;

public class dizidekielemaninfrenkansi {

	public static void main(String[] args) {
		int[]list = {10,20,20,10,10,20,20,5};
		int frekans ;
		int deger=0 ;
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));		
		
		for(int i=list.length-1 ; 0<=i ; i--) {
			frekans=0;
			deger=list[i];
			
			for(int j=i ; 0<=j ; j--) {
				if(list[i]==list[j]) {					
					frekans++;					
				}	
				else {
					i=j+1;
					break;
				}				
			}
			System.out.println(deger+" sayısının frekansı : "+frekans);			
			}		
		}
	}

	
			
		
	


