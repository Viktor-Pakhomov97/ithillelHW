package com.pakhomovHW1;

public class ozz {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("# ");
            }
            System.out.print("   ");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print("#           #");
            if (j == 0) System.out.print("      #                        #");
            if (j == 1) System.out.print("        #                    #");
            if (j == 2) System.out.print("          #                #");
            if (j == 3) System.out.print("            #            #");
            if (j == 4) System.out.print("              #        #");
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("# ");
            }
            System.out.print("   ");
        }
    }
}
