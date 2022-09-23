public class Task6
{
    public static void main(String[] args)
    {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int maxvalue = array[0][0];

        for (int[] ints : array)
        {
            for (int anInt : ints)
                if (maxvalue < anInt)
                {
                    maxvalue = anInt;
                }
        }
        System.out.println(maxvalue);
    }
}