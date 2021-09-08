import java.util.*;
import org.apache.commons.lang3.ArrayUtils;
public class Program
{
    /*
    public static String[] l1={                                      " " , " " , " ",                              " " , " " , " ",                              " " , " " , " "   };

    public static String base1=l1[0]+l1[1]+l1[2];
    public static String base2=l1[3]+l1[4]+l1[5];
    public static String base3=l1[6]+l1[7]+l1[8];
    */
    public static int blah=0;
    public static String p1="x";
    public static String p2="o";
    public static int[] allmoves={0,1,2,3,4,5,6,7,8};
    public static int newmove(int z){
        Random rand = new Random();
        int index = Arrays.binarySearch(allmoves, z);
        index=index*1;
        allmoves = ArrayUtils.remove(allmoves,index);
        //System.out.println(Arrays.toString(allmoves));
        return allmoves[(rand.nextInt(allmoves.length))];
    }

    public static void bline(String x){
        System.out.println("|   "+x.charAt(0)+"   |   "+x.charAt(1)+"   |   "+x.charAt(2)+"   |");
    }
    public static String[] l1={" " , " " , " ", " " , " " , " "," " , " " , " "};
    public static void labledbox(){
        System.out.println("_________________________");
        System.out.println("|       |       |       |");
        System.out.println("|   0   |   1   |   2   |");
        System.out.println("|       |       |       |");
        System.out.println("-------------------------");
        System.out.println("|       |       |       |");
        System.out.println("|   3   |   4   |   5   |");
        System.out.println("|       |       |       |");
        System.out.println("-------------------------");
        System.out.println("|       |       |       |");
        System.out.println("|   6   |   7   |   8   |");
        System.out.println("|       |       |       |");
        System.out.println("-------------------------");
    }
    public static void box(int blah,int blah2){

        l1[blah]=p1;
        l1[blah2]=p2;
        String base1=l1[0]+l1[1]+l1[2];
        String base2=l1[3]+l1[4]+l1[5];
        String base3=l1[6]+l1[7]+l1[8];

        if (!l1[blah].equals(p2) && !l1[blah2].equals(p1)){
            System.out.println("_________________________");
            System.out.println("|       |       |       |");
            bline(base1);
            System.out.println("|       |       |       |");
            System.out.println("-------------------------");
            System.out.println("|       |       |       |");
            bline(base2);
            System.out.println("|       |       |       |");
            System.out.println("-------------------------");
            System.out.println("|       |       |       |");
            bline(base3);
            System.out.println("|       |       |       |");
            System.out.println("-------------------------");

        }
        else{
            System.out.println('h');
        }

    }
    public static void main(String[] args) {

        String ganar="ganaste!";
        int yes=0;
        int[] trys={0,1,2,3,4,5};

        int[] choice={2,3,1,5};
        //int[] choice2={6,4,2,8};

        for(int i:trys){
            labledbox();

            Scanner input = new Scanner(System.in);
            System.out.println("Where?: ");
            int ichoice = input.nextInt();

            if (l1[ichoice]==p2){

                System.out.println("Error: Occupied space");
                newmove(ichoice+1);
                break;

            }
            //if (l1[choice2[i]]==p1){
            //    System.out.println("Error: Occupied space");

            //    break;
            //}
            box(ichoice,newmove(ichoice));

            if (l1[0]==p1){
                if (l1[1]==p1){
                    if (l1[2]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }
                if (l1[3]==p1){
                    if (l1[6]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }

                if (l1[4]==p1){
                    if (l1[8]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }

            }
            if (l1[8]==p1){
                if (l1[5]==p1){
                    if (l1[2]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }
                if (l1[7]==p1){
                    if (l1[6]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }

            }
            if (l1[4]==p1){
                if (l1[5]==p1){
                    if (l1[3]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }
                if (l1[1]==p1){
                    if (l1[7]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }
                if (l1[2]==p1){
                    if (l1[6]==p1){
                        System.out.println(ganar);
                        break;

                    }

                }

            }

        }

    }

}
