public class Main
{
    public static void main(String[] args)
    {
        int liczba = 10;
        //labeled while loop
        main_loop:
        while (liczba < 100)
        {
            liczba++;
            int liczba2 = 0;
            while(liczba2 < 30)
            {
                liczba2++;
                if(liczba2 >= 20)
                {
                    break main_loop;
                }
            }
        }
        System.out.println(liczba);

        int wielkaLiczba = 100;
        great_block:
        if(wielkaLiczba < 200)
        {
            break great_block;
        }
        System.out.println(wielkaLiczba);

        int smallNumber = 10;
        while(smallNumber < 20)
        {
            smallNumber++;
            if(smallNumber < 15)
            {
                continue;
            }
            System.out.println("Liczba w pętli to " + smallNumber);
        }

        loop_continue:
        for(int i = 10; i < 20; i++)
        {
            if(i > 15)
            {
                continue loop_continue;
            }
            System.out.println("Number is " + i);
        }
    }
}