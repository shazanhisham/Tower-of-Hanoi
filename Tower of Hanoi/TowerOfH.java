import java.util.Scanner;
public class TowerOfH {

        static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
        {
            if (n == 1)
            {
                System.out.println("Disk 1 moved from rod " +  from_rod + " to rod " + to_rod);
                return;
            }
            towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
            System.out.println("Disk " + n + " moved from rod " +  from_rod + " to rod " + to_rod);
            towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
        }

        public static void main(String[] args)
        {
            Scanner toh = new Scanner(System.in);

            System.out.println("Enter the number of inputs : ");

            int n = Integer.parseInt(toh.nextLine());
            towerOfHanoi(n,'A','C', 'B');
        }

}
