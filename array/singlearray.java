public class singlearray{

    public static void main(String args[])
{
    int numbers[][]={{10,20,30},{40,50,60}};
    int marks[][]={{1,2,3},{4,5,6}};
    int sum[][]=new int [2][3];
    for(int i=0; i<2; i++)
    {
        for(int j=0; j<3; j++)
        {
            sum[i][j]=numbers[i][j]+marks[i][j];
        }
    }
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println(sum[i][j]);
        }
        
    }


   



}

}