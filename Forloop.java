import java.util.Scanner;
public class Forloop{
	public static void main(String[] arg){
		int a=0; 
               	for (int i = 1; i <= 4; i++) {
           		 for (int b = 1; b <= 4; b++) {
                		for (int c = 1; c <= 4; c++) {
                                       if (c != i && c != b && i != b) {
                       				 a++; 
                        System.out.println(i + "" + b + "" + c); 
                			}
           			 }
        		}
		}
	}
}