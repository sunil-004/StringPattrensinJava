import java.util.Scanner;
 class Letters
 {
  public static void main(String[] args)
  {
	  int i,j,k,n,m,sum=0;
	  //int mid =len/2;
	  char c;
	   int mid ;
	  int len,count,count2,count3,count4;
	  int len2,len3;
	   String s;
	  char[] ch;
	  System.out.print("enter the character you want to print : ");
	  Scanner sc= new Scanner(System.in);
	  c= sc.next().charAt(0);
	  System.out.print("enter the value of n:");
	  n =sc.nextInt();
	  sc.nextLine();
	  System.out.print("enter your String:");
	  s =sc.nextLine();
	 // String str=s.replaceAll("\\s","");
	 String str="";
	 String arr[]=s.split(" ");
	 for(String st:arr)
		str+=st;
	  ch=str.toCharArray();
	   mid = n/2;
	   len=n;;
	   count=n;
	   count2=n/2;
	   count3=0;
	   count4=n;
	   len2=n;
	   len3=0;
		   for(k=0;k<ch.length;k++)
		   {
			   if(Character.isDigit(ch[k]))
			   {
				   sum=0;
			         break;
			   }
			   else
			   {
				   ++sum;
			   }
		   }
		   
		   if(sum==0)
		   {
			   System.out.print("please enter alphabets only");
		   }
	
else
{	
	  for(m=0;m<ch.length;m++)
	  {
		    
		 	if(ch[m]=='A'||ch[m]=='a')
			 {
				 len=n;
				 
	  for(i=0;i<n;i++)  
	  {	 for(int a=0;a<n-1;a++)
		  System.out.print(" ");
		  for(j=0;j<len;j++)
		  {
			  System.out.print(" ");
		  }
		  for(k=0;k<=2*i;k++)
		  {
			  if(k==0||k==(2*i)||i==mid)
			  {
				  System.out.print(c);
			  }
			  
			  else
			  {
				  System.out.print(" ");
			  }
	  }
	  len--; 
	  System.out.println(); 
    
  //eof of Letter A
 // System.out.print("\t");
  }
	  }
 //Bletter
	else if(ch[m]=='B'||ch[m]=='b') 
	{		
	for(i=0;i<n;i++)
		  
	  {
		  if(i==0)
		  {
			  
		  for(j=0;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(j=0;j<n-2;j++)
		  {
			  System.out.print(c);
		  }
		  System.out.println();
	  }//eof of if
	  
	 else if(i==mid)
	  {
		  for(j=0;j<n;j++)
			  {
				  System.out.print(" ");
			  }
		  for(k=0;k<n-2;k++)
		  {
			  System.out.print(c);
		  }
		  System.out.println();
	  }// eof of else if
	  else if(i==n-1)
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  for(k=0;k<n-2;k++)
		  {
			  System.out.print(c);
		  }
	  }//eof else if 
		  
		  else 
		  {
			 for(j=0;j<n;j++)
			  {
				  System.out.print(" ");
			  }
			  
			  for(k=0;k<n;k++)
			  {
				  
				  
				   if(k==0||k==n-1)
				  {
					  System.out.print(c);
				  }
				  
				  else{
					  System.out.print(" ");
				  }
				 
			  }
			  
			 System.out.println();  
		  }//eof of else
		 
		  }//end of Bletter
		  System.out.println();
	}//EOF OF ELSE IF-1
		 
		 else if(ch[m]=='C'||ch[m]=='c') 
        {			
		    for(i=0;i<n;i++)
			{
			  for(j=0;j<n;j++)
			   {
					  System.out.print(" ");
				  }
				  for(k=0;k<n;k++)
				  {
					  if(k==0||i==0||i==n-1)
					  {
						  System.out.print(c);
					  }
					  
					  else
					  {
						  System.out.print(" ");
					  }
	               }
	  //len--;
	  System.out.println();
	  }                            //eof of letter C		
	  }//eof of ELSE IF-2  
		 //System.out.println();
	  
	else if(ch[m]=='D'||ch[m]=='d')
	{	
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  if(i==0)
		  {
			  for(k=0;k<n-2;k++)
			  {
				  System.out.print(c);
			  }
		  }//eof of if
		  else if(i==n-1)
		  {
			  for(k=0;k<n-2;k++)
			  System.out.print(c);
		  }
		  else{
			  for(k=0;k<n;k++)
			  {
			  if(k==0||k==n-1)
			  {
				  System.out.print(c);
			  }
			  else{
				  System.out.print(" ");
			  }
			  }//eof of else
		  }//eof of 1st for loop
	  System.out.println();
	  }	                         //eof of letter D  
	  
	}
	else if(ch[m]=='E'||ch[m]=='e')
	{
	for(i=0;i<n;i++)
		  
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  for(k=0;k<n;k++)
		  {
			  if(k==0||i==0||i==n-1||i==mid)
			  {
				  System.out.print(c);
			  }
			  
			  else
			  {
				  System.out.print(" ");
			  }
	  }
	  //len--;
	  System.out.println();
	  
  }                                         //eof of letter E
  System.out.println();
	}
  
	
	else if(ch[m]=='F'||ch[m]=='f')
	{
  	    for(i=0;i<n;i++)
		  
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  for(k=0;k<n;k++)
		  {
			  if(k==0||i==0||i==mid)
			  {
				  System.out.print(c);
			  }
			  
			  else
			  {
				  System.out.print(" ");
			  }
	  }
	  //len--;
	  System.out.println();
	  
  }                                    //eof of letter F
  
  System.out.println();
	}
else if(ch[m]=='G'||ch[m]=='g')	
{
  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
		  if(i==0)
		  { 
			  for(k=0;k<n;k++)
			  {
				  System.out.print(c);
			  }
			  //System.out.println();
		  }//eof of if
		else if(i==mid)
		{
			for(k=0;k<n;k++)
			{
				if(k>=2||k==0)
				System.out.print(c);
			   else{
				   System.out.print(" ");
			   }
			}
		}
		else if(i==n-1)
		{
			for(k=0;k<n;k++)
			{
				System.out.print(c);
			}
		}
		else
		{
			for(k=0;k<n;k++)
			{
				if(k==0)
				{
					System.out.print(c);
				}
				else if(k>mid && i>mid && k==n-1)
				{
					System.out.print(c);
				}
				else
				{
					System.out.print(" ");
				}
			}
			//System.out.println();
			
		}
		System.out.println();

  }                        //eof of For loppp i and letter G
  
  System.out.println();
}
  else if(ch[m]=='H'||ch[m]=='h')
  {
    for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
			 
		   if(i==mid)
		   {
			   for(k=0;k<n;k++)
				   System.out.print(c);
		   }//eof of if
		   
		   else
		   {
			  for(k=0;k<n;k++)
			  {
				  if(k==0||k==n-1)
				  System.out.print(c);
			    else
					System.out.print(" ");
			  }
		   }//eof of else
			  System.out.println();
  }                                //eof of For loppp i and letter H
  
  System.out.println();
  }
  else if(ch[m]=='J'||ch[m]=='j')
  {
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
			 
		   if(i==0)
		   {
			   for(k=0;k<n;k++)
				   System.out.print(c);
		   }//eof of if
		   else if(i==n-1)
		   {
			   for(k=0;k<mid+1;k++)
				   System.out.print(c);
		   }
		   
		   else
		   {
			  for(k=0;k<n;k++)
			  {
				  if(k==mid)
				  System.out.print(c);
			    else if(k==0&&i>mid)
					System.out.print(c);
				else
					System.out.print(" ");
			  }
		   }//eof of else
			  System.out.println();
  }                                    //eof of For loppp i and letter J
  
  System.out.println();
  }
  else if(ch[m]=='I'||ch[m]=='i')
  {
  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
			 
		   if(i==0||i==n-1)
		   {
			   for(k=0;k<n;k++)
				   System.out.print(c);
		   }//eof of if
		   
		   else
		   {
			  for(k=0;k<n;k++)
			  {
				  if(k==mid)
				  System.out.print(c);
			    else
					System.out.print(" ");
			  }
		   }//eof of else
			  System.out.println();
  }                                  //eof of For loppp i and letter I
  
  System.out.println();
  }
  else if(ch[m]=='K'||ch[m]=='k')
  {
   for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
			 
			  if(i<=mid)
			  {
			   for(k=0;k<n;k++)
			   {
				   if(k==0||k==count-1)
				   {
					   System.out.print(c);
				   }
				  
				else{
					   System.out.print(" ");
				   }
			   }
			   count--;
			  }//eof of if
			  
			  else{
				  
				  for(k=0;k<n;k++)
				  {
				  	 if(k==0||k==count2+1)
				   {
					   System.out.print(c);
				   }
				   else
				   {
					   System.out.print(" ");
				   }
				  }
				 count2++;  
			  }//eof of else
			 
			
			  System.out.println();
  }                                   //eof of For loppp i and letter K
  System.out.println();
  }
  else if(ch[m]=='L'||ch[m]=='l')
  {
    for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
			 
			  
			   for(k=0;k<n;k++)
			   {
				   if(k==0||i==n-1)
				   {
					   System.out.print(c);
				   }
				  
				else{
					   System.out.print(" ");
				   }
			   }
			 
			
			  System.out.println();
  }                                    //eof of For loppp i and letter L
  System.out.println();
  }
  else if(ch[m]=='M'||ch[m]=='m')
  {
   for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        } 
                if(i==mid)
                {
					for(k=0;k<n;k++)
						if(k==0||k==mid||k==n-1)
							System.out.print(c);
						else
							System.out.print(" ");
				}
                else
                {					
				for(k=0;k<n;k++)
				{
					if(k==0||k==n-1)
					{
						System.out.print(c);
					}
					else if(k==i&&i<mid||k==len2-1&&i<mid)
						//else if(k==i && i>mid|| k==len-1&&i>mid)
						System.out.print(c);
					else 
						System.out.print(" ");
				}
				}
				len2--;
				 System.out.println();
  }                                               //eof of For loppp i and letter M
  
  System.out.println();
  }
else if(ch[m]=='N'||ch[m]=='n')
{	
   for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		     {
			  System.out.print(" ");
		     }
			 
			  
			   for(k=0;k<n;k++)
			   {
				   if(k==0||k==n-1||i==k)
				   {
					   System.out.print(c);
				   }
				  
				else{
					   System.out.print(" ");
				   }
			   }
			 
			
			  System.out.println();
  }                                //eof of letter N
  
  System.out.println();
} 	  
else if(ch[m]=='O'||ch[m]=='o')
{	
	for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
			 
			  if (i==0)
			  {   
		          
				  for(k=0;k<n-1;k++)
				  {
			          if(k>0)
					  System.out.print(c);
				     else
						 System.out.print(" ");
				  }
				  //System.out.println();
			  }
			  
			  else if(i==n-1)
			  {

				  for(k=0;k<n-1;k++)
				  {
					  if(k>0)
					  System.out.print(c);
				     else
						 System.out.print(" ");
				  }
			  }
			  
			  else
			  {
				 
			   for(k=0;k<n;k++)
			   {
                 
				   if(k==0||k==n-1)
				   {
					   System.out.print(c);
				   }
				  
				else{
					   System.out.print(" ");
				   }
			   }
			 
			  }
			  System.out.println();
  }                                    //eof of For loppp i and letter O
  
  System.out.println();
}
else if(ch[m]=='P'||ch[m]=='p')
{
  for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
			 
			  if (i==0)
			  {   
		          
				  for(k=0;k<n-2;k++)
				  {
					  System.out.print(c);
				  }
				  //System.out.println();
			  }
			  
			  else if(i==mid)
			  {

				  for(k=0;k<n-2;k++)
				  {
					  System.out.print(c);
				  }
			  }
			  
			  else
			  {
				 
			   for(k=0;k<n;k++)
			   {
                 
				   if(k==0||k==n-1&& i<mid)
				   {
					   System.out.print(c);
				   }
				  
				else{
					   System.out.print(" ");
				   }
			   }
			 
			  }
			  System.out.println();
  }                                 //eof of For loppp i and letter P
  System.out.println();
}
else if(ch[m]=='R'||ch[m]=='r')
{
    for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(" ");
		  }
		  if(i==0)
		  {
			  for(k=1;k<n-1;k++)
			  {
				  System.out.print(c);
			  }
			  System.out.println();
		  }//eof of if
		  else if(i==mid)
		  {
			  for(k=2;k<n;k++)
			  {
				  System.out.print(c);
			  }
			  System.out.println();
		  }//eof of else if
		  
		  else
		  {
			  for(k=0;k<n;k++)
			  {
			  if(k==0|| k==n-1)
			  {
				  System.out.print(c);
			  }
			  else
			  {
				  System.out.print(" ");
			  }
			  
			}
	  System.out.println();
	  }//eof of else

  }//eof of For loppp i and letter R
  System.out.println();
}
else if(ch[m]=='Q'||ch[m]=='q')
{
  for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        } 
                
			  if (i==0)
			  {   
		          
				  for(k=0;k<n-1;k++)
				  {
			          if(k>0)
					  System.out.print(c);
				     else
						 System.out.print(" ");
				  }
			  }
			  
			  else if(i==n-2)
			  {

				  for(k=0;k<n-1;k++)
				  {
					  if(k>0)
					  System.out.print(c);
				     else
						 System.out.print(" ");
				  }
			  }
			  
			  else if(i==n-1)
			  {
				  for(k=0;k<n;k++)
					  if(k==n-1)
						  System.out.print(c);
					  else
						  System.out.print(" ");
			  }
			  else
			  {
				 
			   for(k=0;k<n;k++)
			   {
                 
				   if(k==0||k==n-1)
				   {
					   System.out.print(c);
				   }
				    else if(k==i&&i>=mid)
						System.out.print(c);
				  
				else{
					   System.out.print(" ");
				   }
			   }
			 
			  }
			  System.out.println();
  }                                            //eof of For loppp i and letter Q
  System.out.println();
}
  //System.out.println();
  else if(ch[m]=='S'||ch[m]=='s')
  {
  for(i=0;i<n;i++)
  {
	  
	   for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
				  if(i==0)
				  {
			       for(k=0;k<n;k++)
				   {
					 System.out.print(c);
				   }
				}
				else if(i==mid)
				{
					for(k=0;k<n;k++)
				   {
					 System.out.print(c);
				   }
				}
				else if(i==n-1)
				{
					for(k=0;k<n;k++)
				   {
					 System.out.print(c);
				   }
				}
				
				else
				{
					for(k=0;k<n;k++)
				   {
					   if(k==0&&i<mid)
					 System.out.print(c);
				 else if(k==n-1&&i>mid)
					 System.out.print(c);
				   else
					 System.out.print(" ");
				   }
				}
				   System.out.println();
  }                                          //eof of For loppp i and letter S
  
  System.out.println();
  }
  else if(ch[m]=='T'||ch[m]=='t')
  {
    for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
				 for(k=0;k<n;k++)
				 {
					 if(i==0||k==mid)
						 System.out.print(c);
					 else
						 System.out.print(" ");
				 }
				 System.out.println();
  }                                                //eof of For loppp i and letter T
  System.out.println();
  }
  else if(ch[m]=='U'||ch[m]=='u')
  {
   for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
				if(i==n-1)
				{
					for(k=0;k<n-1;k++)
					{
						if(k>0)
							System.out.print(c);
						else
							System.out.print(" ");
					}
				}
				else
				{
				 for(k=0;k<n;k++)
				 {
					 if(k==0||k==n-1)
						 System.out.print(c);
					 else
						 System.out.print(" ");
				 }
				}
				 System.out.println();
  }//eof of For loppp i and letter U
 
 System.out.println();
  }
  else if(ch[m]=='V'||ch[m]=='v')
  {
len=0; 
	  	  for(i=n-1;i>=0;i--)
	  {
		   len++;
		        for(j=0;j<len;j++)
		         {
			    System.out.print(" ");
		        } 
                for(k=0;k<=2*i;k++)
		      {
			  if(k==0||k==(2*i))
			  {
				  System.out.print(c);
			  }
			  
			  else
			  {
				  System.out.print(" ");
			  }
			  
	  }
	 
			   
			  System.out.println();
  }//eof of For loppp i and letter V
  System.out.println();
  }
  else if(ch[m]=='W'||ch[m]=='w')
  {
  len2=n;
  //System.out.println();
   for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        } 
                if(i==mid)
                {
					for(k=0;k<n;k++)
						if(k==0||k==mid||k==n-1)
							System.out.print(c);
						else
							System.out.print(" ");
				}
                else
                {					
				for(k=0;k<n;k++)
				{
					if(k==0||k==n-1)
					{
						System.out.print(c);
					}
						else if(k==i && i>mid|| k==len2-1&&i>mid)
						System.out.print(c);
					else 
						System.out.print(" ");
				}
				}
				len2--;
				 System.out.println();
  }//eof of For loppp i and letter W
  
  System.out.println();
  }
  else if(ch[m]=='X'||ch[m]=='x')
  {
  len2=n;
  
   for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
				for(k=0;k<n;k++)
				{
					if(k<n&&k==i||k==len2-1)
						System.out.print(c);
					else
						System.out.print(" ");
				}
				len2--;
				 System.out.println();
  }//eof of For loppp i and letter X
  
  System.out.println();
  }
  else if(ch[m]=='Y'||ch[m]=='y')
  {
  len2=n;
  for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        }  
				for(k=0;k<n;k++)
				{
					if(k<n/2&&k==i||k==len2-1)
						System.out.print(c);
					else
						System.out.print(" ");
				}
				len2--;
				 System.out.println();
  }  //eof of For loppp i and letter Y
  System.out.println();
  }
  else if(ch[m]=='Z'||ch[m]=='z')
  {
  len2=n;
    for(i=0;i<n;i++)
	  {
		  
		        for(j=0;j<n;j++)
		         {
			    System.out.print(" ");
		        } 
                for(k=0;k<n;k++)
				{
					if(i==0||i==n-1||k==len2-1)
					{
						System.out.print(c);
					}
					else
						System.out.print(" ");
				}
				len2--;
				 System.out.println();
  }//eof of For loppp i and letter Z*/
	
  }
  else
  {
	  System.out.print(" you have to enter letters only:");
  }
  }
  }
 }
 }