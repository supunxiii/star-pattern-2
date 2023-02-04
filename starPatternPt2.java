public class starPatternPt2{
    public static void main(String[] args){
        int p = 8;
        for (int q = 1; q <= p ; q++){
          for (int s = 1; s < q; s++){
                System.out.print(" ");
            }
          for (int s = q; s <= p; s++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
     }
   }
