import java.util.Scanner;

public class CastleBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] player = new int[5];
        for(int i = 0; i < player.length; i++){
            System.out.println("Enter in the number of troops you want for castle " + (i+1));
            int troop = input.nextInt();
            player[i] = troop;
        }
        Castle.ComputerTroops();
        Castle battle = new Castle(player);
        for (int element: Castle.getComputer()) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(battle.compareTroops());
    }
}
