public int evendigitsum(int input1)
{
	 int temp=0,sum=0;;
    while(input1>0)
    {
     temp=input1%10;
     if(temp%2!=0)
     {
         sum+=input1%10;
     }   
     input1/=10;
    }
    return sum;
		
	}
}
