class pattern
{
    public static void main(String args[])
    {
       /*  for( int i=1; i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==5 || i==1 ||j==5 || j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }  
        */

  /*for( int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                    System.out.print("*");
                
            }
        System.out.println();
        }  

*/

/*for( int i=4; i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
               
                    System.out.print("*");
                
            }
        System.out.println();
        }  

*/

/*for( int i=1; i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
               
                    System.out.print(" ");
                
            }
            for(int j=1; j<=i;j++)
            {
                    System.out.print("*");
            }
        System.out.println();
        }  
*/

/*for( int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                    System.out.print(j);
                
            }
        System.out.println();
        }  
*/

/*for( int i=4; i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
               
                    System.out.print(j);
                
            }
        System.out.println();
        }  
*/
/*int n=1;
for( int i=1; i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
               
                    System.out.print(n);
                    n++ ;
                
            }
        System.out.println();
        }  
*/
/*int sum;
for( int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum=i+j;
                if(sum%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
        System.out.println();
        }  
*/

/*int n=5;
// upper half of butterfly
for( int i=1;i<=n;i++)
{
        // print left wing
        for(int j=1;j<=i;j++)
        {
                System.out.print('*');

        }
        // print spaces in middle
        for(int j=1;j<=2*(n-i);j++)
        {
                System.out.print(" ");

        }
        //print the right wing
        for(int j=1;j<=i;j++)
        {
                System.out.print("*");

        }
        System.out.println();
}
// print the lower half
for(int i=n;i>=1;i--)
{
        //print the left wing
        for(int j=1;j<=i;j++)
        {
                System.out.print("*");

        }
        //print spaces in middle
        for(int j=1;j<=2*(n-i);j++)
        {
                System.out.print(" ");

        }
        //print right wing
        for(int j=1;j<=i;j++)
        {
                System.out.print("*");
        }
        System.out.println();
}

*/

/*for(int i=1;i<=5;i++)
{
        // Spaces
        for(int j=1;j<=(5-i);j++)
        {
                System.out.print(" ");

        }
        //stars
        for(int j=1;j<=5;j++)
        {
                System.out.print("*");

        }
        System.out.println();
}
*/

/*for(int i=1;i<=5;i++)
{
        for(int j=1;j<=(5-i);j++)
        {
                System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
                System.out.print(i);
        }
        System.out.println();
}
*/

for(int i=1;i<=5;i++)
{
        for(int j=1;j<=(5-i);j++)
        {
                System.out.print(" ");
        }
        for(int j=i;j>=1;j--)
        {
                System.out.print(j);
        }
        for(int j=2;j<=i;j++)
        {
                System.out.print(j);
        }
        System.out.println();

}







       




























}}





































    
