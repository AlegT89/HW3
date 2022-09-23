public class Task3
{
    public static void main(String[] args)
    {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minvalue = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(minvalue > array[i])
            {
                minvalue = array[i];
            }
        }
        System.out.println(minvalue);
    }
}
