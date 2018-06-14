import java.util.*;
import java.io.*;

public class HRBotsavesprincess {

	public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
	 String n = scan.nextLine();
         String[][] arrStr = new String[Integer.parseInt(n)][Integer.parseInt(n)];

	 for(int i =0;i<Integer.parseInt(n);i++){
           arrStr[i] = (scan.nextLine()).split(" ");
	 }

	 System.out.println("//////////-------///////");

	 int[] M = locate(arrStr,"m");
	 int[] P = locate(arrStr,"p");

	 System.out.println("m is at position "+ M[0]+","+M[1]);
	 System.out.println("p is at positiin "+P[0]+","+P[1]);
	 for(int i=0;i<Integer.parseInt(n);i++){
           for(int j=0;j<Integer.parseInt(n);j++)
	   { 
		   System.out.print(arrStr[i][j]);
	 }
	 System.out.println();
	 }
	 scan.close();
	}
   
	static int[] locate(String[][] matrix,String str){
		int[] point=new int[2];
	/*	point.a =0;
		point.b =0;*/
		int x=0;
          for(int i=0;i<matrix.length;i++)
	  {
		  for(int j=0;j<matrix.length;j++){
			  if(matrix[i][j].equals(str)==true){
				  point[0] = i;
				  point[1] = j;
				  x =j;
			          break;
			  }
		  }
		  if(matrix[i][x].equals(str)==true){
			  break;
		  }
	  }

	  return point;
	
	}

	/*public class Point{
          int a;
	  int b;
	}*/
}
