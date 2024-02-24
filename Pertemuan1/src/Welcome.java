/**
 * Program ini menampilkan sapaan untuk pembaca
 * @versi 0.0.1 2024-02-05
 * @author M Gianluigi Julian */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}