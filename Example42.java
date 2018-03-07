import java.util.*;
class Example42{
	public static void main(String args[]){
		Random r=new Random();
		int[][] x=new int[3][2];
			for(int i=0;i<3;i++){
				for(int j=0;j<2;j++){
					
					
					 x[i][j]=r.nextInt(10);
					}
				
				
				}
		
		for(int[] x1:x){
			for(int x2:x1){
				System.out.print(x2);
				
				}
			
			}
		
		
		}
		
		
	
	
	}
