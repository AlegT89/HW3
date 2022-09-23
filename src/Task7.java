public class Task7
{
    public static void main(String[] args)
    {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum = 0;

        for (int[] ints : array)
        {
            sum = sum + ints.length;
        }
        System.out.println(sum);
    }

}