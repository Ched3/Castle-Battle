public class Castle {
    private int[] troopsA = new int[5];
    private int[] troopsB = {0,0,0,0,0};

    private static int[] computer = new int[5];

    public static void ComputerTroops(){
        int maxTroops = 31;
        int usedTroops = 0;
        for(int i = 0; i < computer.length; i++){
            computer[i] = (int)(Math.random()*(maxTroops - usedTroops));
            usedTroops += computer[i];
        }
        computer[4] += maxTroops - 1 - usedTroops;
    }
    public Castle (int[] a){
        troopsA = a;
    }

    public String compareTroops(){
        int Ascore = 0;
        int Compscore = 0;
        int castleScore = 5;
        for(int i = 0; i < troopsA.length; i++) {
            if (troopsA[i] < computer[i])
                Compscore += castleScore - i;
            if(troopsA[i] > computer[i])
                Ascore += castleScore - i;
        }
        if(Ascore > Compscore)
            return "Player wins!";
        else if(Compscore > Ascore)
            return "Computer wins!";
        return "It's a tie!";
    }
    public static int[] getComputer(){
        return computer;
    }
}
