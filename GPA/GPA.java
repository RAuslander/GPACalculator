import java.util.Scanner;
/**
 * Write a description of class GPA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GPA
{
    private int class1, class2, class3, class4, class5, class6;
    private double GPA1, GPA2, GPA3, GPA4, GPA5, GPA6, GPAFinal;
    private boolean AP1, AP2, AP3, AP4, AP5, AP6;
    public void GPA()
    {
        boolean AP1, AP2, AP3, AP4, AP5, AP6;
        System.out.println("Welcome to the GPA calculator type in the 6 grades from the 6 classes.");
        Scanner sc= new Scanner(System.in);
        System.out.println("Is the class an AP?(True or False ONLY!!!!)");
        AP1=sc.nextBoolean();
        int gclass1=sc.nextInt();
        System.out.println("Is the class an AP?(True or False ONLY!!!!)");
        AP2=sc.nextBoolean();
        int gclass2=sc.nextInt();
        System.out.println("Is the class an AP?(True or False ONLY!!!!)");
        AP3=sc.nextBoolean();
        int gclass3=sc.nextInt();
        System.out.println("Is the class an AP?(True or False ONLY!!!!)");
        AP4=sc.nextBoolean();
        int gclass4=sc.nextInt();
        System.out.println("Is the class an AP?(True or False ONLY!!!!)");
        AP5=sc.nextBoolean();
        int gclass5=sc.nextInt();
        System.out.println("Is the class an AP?(True or False ONLY!!!!)");
        AP6=sc.nextBoolean();
        int gclass6=sc.nextInt();
        GPA point= new GPA();
        
        int [] Percentages = new int[]{gclass1, gclass2, gclass3, gclass4, gclass5, gclass6};
        double[] GPA = new double[]{GPA1, GPA2, GPA3, GPA4, GPA5, GPA6};
        boolean[] AP = new boolean[]{AP1, AP2, AP3, AP4, AP5, AP6};

        
        for (int i = 0; i <6; i++){
            if (AP[i] == false){
            if (Percentages[i] >= 97 && Percentages[i] <=100 ){
                GPA[i]= 4.000;
            }
            if (Percentages[i] >= 93 && Percentages[i] <=96 ){
                GPA[i]= 3.667;
            }
            if (Percentages[i] >= 90 && Percentages[i] <=92 ){
                GPA[i]= 3.333;
            }
            if (Percentages[i] >= 87 && Percentages[i] <=89 ){
                GPA[i]= 3.000;
            }
            if (Percentages[i] >= 83 && Percentages[i] <=86 ){
                GPA[i]= 2.667;
            }
            if (Percentages[i] >= 80 && Percentages[i] <=82 ){
                GPA[i]= 2.333;
            }
            if (Percentages[i] >= 77 && Percentages[i] <=79 ){
                GPA[i]= 2.000;
            }
            if (Percentages[i] >= 73 && Percentages[i] <=76 ){
                GPA[i]= 1.667;
            }
            if (Percentages[i] >= 70 && Percentages[i] <=72 ){
                GPA[i]= 1.333;
            }
            if (Percentages[i] <70 ){
                GPA[i]= 0.000;
            }
        }
        else{
            if (Percentages[i] >= 97 && Percentages[i] <=100 ){
                GPA[i]= 5.000;
            }
            if (Percentages[i] >= 93 && Percentages[i] <=96 ){
                GPA[i]= 4.667;
            }
            if (Percentages[i] >= 90 && Percentages[i] <=92 ){
                GPA[i]= 4.333;
            }
            if (Percentages[i] >= 87 && Percentages[i] <=89 ){
                GPA[i]= 4.000;
            }
            if (Percentages[i] >= 83 && Percentages[i] <=86 ){
                GPA[i]= 3.667;
            }
            if (Percentages[i] >= 80 && Percentages[i] <=82 ){
                GPA[i]= 3.333;
            }
            if (Percentages[i] >= 77 && Percentages[i] <=79 ){
                GPA[i]= 3.000;
            }
            if (Percentages[i] >= 73 && Percentages[i] <=76 ){
                GPA[i]= 2.667;
            }
            if (Percentages[i] >= 70 && Percentages[i] <=72 ){
                GPA[i]= 2.333;
            }
            if (Percentages[i] <70 ){
                GPA[i]= 0.000;
            }
        }
            GPAFinal = GPAFinal+GPA[i];
        }
        GPAFinal = GPAFinal/6;
        System.out.println(GPAFinal);   
    }   
    }

