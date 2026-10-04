public class first{

public static void main(String []args)
{
  int seat=7;
  int line=5;
  for(int i=0; i<10; i++)
  {
    for(int j=0; j<10; j++)
    {
        if(i==line && j==seat)
        {
            System.out.print("Ahmad seats line is: "+i+"and seat is:"+j);
            break;
        }
            
        }
    }
  }

  
}

