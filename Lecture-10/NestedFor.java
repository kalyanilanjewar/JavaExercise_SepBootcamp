class NestedFor
{
    public static void main(String[] args)
    {
        int weeks = 2;
        int days = 7;

        for(int i=1; i<=weeks; i++)
        {
            System.out.println("Week: " + i);

            for(int j=1; j<=days; j++)
            {
                System.out.println("Day: " + j);
            }
        }
    }
}