public class array{
    public void main(String[] args)
    {
      int arrayofnumbers[]=new int[10];
      arrayofnumbers[0]=10;
      arrayofnumbers[1]=20;
      arrayofnumbers[2]=30;
      System.out.println("third index data is :"+arrayofnumbers[2]);
      // second way define array 
      int numbers[]={10,20,30,40,50,60};
      numbers[0]=100;
      System.out.println("first index data:"+numbers[0]);
      // print array data
      for(int i=0;i<numbers.length; i++)
      {
        System.out.print("  "+numbers[i]);
      }

    }
}