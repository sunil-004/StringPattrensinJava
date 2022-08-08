import java.util.Scanner;
 class Pattren
 {
  public static void main(String[] args)
  {
	  int i,j,k,n,m;
	  int[][] p ={{1,1,1,1,1, 1,0,0,0,1 ,1,0,0,0,1, 1,1,1,1,1, 1,0,0,0,0,},
	              {0,1,0,0,0, 1,0,0,0,1 ,1,1,0,0,1, 0,0,1,0,0, 1,0,0,0,0,},
	              {0,0,1,0,0, 1,0,0,0,1 ,1,0,1,0,1, 0,0,1,0,0, 1,0,0,0,0,},
				  {0,0,0,1,0, 1,0,0,0,1 ,1,0,0,1,1, 0,0,1,0,0, 1,0,0,0,0,},
				  {1,1,1,1,1, 0,1,1,1,0 ,1,0,0,0,1, 1,1,1,1,1, 1,1,1,1,1}};
				       
	for(i=0;i<p.length;i++)
	{
		
	   for(j=0;j<5;j++)
		   if(p[i][j]==1)
	System.out.print("*");	   
          else
			  System.out.print(" ");
		 // System.out.println();
			System.out.print("\t");
			
		for(j=5;j<10;j++)
		   if(p[i][j]==1)
	System.out.print("*");	   
          else
			  System.out.print(" ");
		  System.out.print("\t");
		  
		  	for(j=10;j<15;j++)
		   if(p[i][j]==1)
	System.out.print("*");	   
          else
			  System.out.print(" ");
		  System.out.print("\t");
		  
		  for(j=15;j<20;j++)
		   if(p[i][j]==1)
	System.out.print("*");	   
          else
			  System.out.print(" ");
		  System.out.print("\t");
		  
		  for(j=20;j<25;j++)
		   if(p[i][j]==1)
	System.out.print("*");	   
          else
			  System.out.print(" ");
		  System.out.println();
		   
	}

//	System.out.print("\t");
					   
				   
 }
 }