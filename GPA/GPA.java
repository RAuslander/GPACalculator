import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class GPA here.
 * 
 * @author Ryan Auslander Chris Kiefer
 * @version v1
 */
public class GPA
{
    private int class1, class2, class3, class4, class5, class6;
    private int gclass1, gclass2, gclass3, gclass4, gclass5, gclass6;
    private int iterationCheckWeight, iterationCheckGrade;
    private double GPA1, GPA2, GPA3, GPA4, GPA5, GPA6, GPAFinal;
    private String AP1, AP2, AP3, AP4, AP5, AP6;
    private String Weight1Check, Weight2Check, Weight3Check, Weight4Check, Weight5Check, Weight6Check;
    private String AP1Temp, AP2Temp, AP3Temp, AP4Temp, AP5Temp, AP6Temp;
    private boolean runTime = true;
    private boolean errorCheck = true;
    public void GPA()
    {
        System.out.println("Welcome to the GPA calculator type in the 6 grades from the 6 classes.");
        while (runTime = true){        
        String AP1, AP2, AP3, AP4, AP5, AP6;
        Scanner sc= new Scanner(System.in);
        while (errorCheck == true && iterationCheckWeight ==0){
        System.out.println("Is the class an AP, honors, or normal?");
        Weight1Check= sc.next();
        if (Weight1Check.equalsIgnoreCase("AP")){
            AP1Temp= "AP";
            iterationCheckWeight++;
            break;
        }
        else if(Weight1Check.equalsIgnoreCase("Honors")){
            AP1Temp= "Honors";
            iterationCheckWeight++;
            break;
        }
        else if (Weight1Check.equalsIgnoreCase("Normal")){
            AP1Temp= "Normal";
            iterationCheckWeight++;
            break;
        }
        else{
            errorCheck = false;
            break;
        }
        }
        AP1=AP1Temp;
        
        while (errorCheck == true && iterationCheckGrade ==0){
            System.out.println("Input your grade.");
            if(sc.hasNextInt()){
                class1=sc.nextInt();
            if (class1 >100){
                class1= 100;
                iterationCheckGrade++;
                break;
            }
            else if (class1 <0){
                class1= 0;
                iterationCheckGrade++;
                break;
            }
            else if (class1>=0 && class1<=100){
                class1= class1;
                iterationCheckGrade++;
                break;
            }
            }
            else{
                errorCheck = false;
                break;
            }

        }
        gclass1 = class1;
        

        while (errorCheck == true && iterationCheckWeight ==1){
        System.out.println("Is the class an AP, honors, or normal?");
        Weight2Check= sc.next();
        if (Weight2Check.equalsIgnoreCase("AP")){
            AP2Temp= "AP";
            iterationCheckWeight++;
            break;
        }
        else if(Weight2Check.equalsIgnoreCase("Honors")){
            AP2Temp= "Honors";
            iterationCheckWeight++;
            break;
        }
        else if (Weight2Check.equalsIgnoreCase("Normal")){
            AP2Temp= "Normal";
            iterationCheckWeight++;
            break;
        }
        else{
            errorCheck = false;
            break;
        }
        }
        AP2=AP2Temp;
        
        while (errorCheck == true && iterationCheckGrade ==1){
            System.out.println("Input your grade.");
            if(sc.hasNextInt()){
            class2=sc.nextInt();
            if (class2 >100){
                class2= 100;
                iterationCheckGrade++;
                break;
            }
            else if (class2 <0){
                class2= 0;
                iterationCheckGrade++;
                break;
            }
            else if (class2>=0 && class2<=100){
                class2= class2;
                iterationCheckGrade++;
                break;
            }
        }
        else{
            errorCheck=false;
            break;
        }
        }
        gclass2 = class2;
        

        while (errorCheck == true && iterationCheckWeight ==2){
        System.out.println("Is the class an AP, honors, or normal?");
        Weight3Check= sc.next();
        if (Weight3Check.equalsIgnoreCase("AP")){
            AP3Temp= "AP";
            iterationCheckWeight++;
            break;
        }
        else if(Weight3Check.equalsIgnoreCase("Honors")){
            AP3Temp= "Honors";
            iterationCheckWeight++;
            break;
        }
        else if (Weight3Check.equalsIgnoreCase("Normal")){
            AP3Temp= "Normal";
            iterationCheckWeight++;
            break;
        }
        else{
            errorCheck = false;
            break;
        }
        }
        AP3=AP3Temp;
        
        while (errorCheck == true && iterationCheckGrade ==2){
            System.out.println("Input your grade.");
            if(sc.hasNextInt()){
            class3=sc.nextInt();
            if (class3 >100){
                class3= 100;
                iterationCheckGrade++;
                break;
            }
            else if (class3 <0){
                class3= 0;
                iterationCheckGrade++;
                break;
            }
            else if (class3>=0 && class3<=100){
                class3= class3;
                iterationCheckGrade++;
                break;
            }
        }
        else{
            errorCheck=false;
            break;
        }
        }
        gclass3 = class3;
        

        while (errorCheck == true && iterationCheckWeight ==3){
        System.out.println("Is the class an AP, honors, or normal?");
        Weight4Check= sc.next();
        if (Weight4Check.equalsIgnoreCase("AP")){
            AP4Temp= "AP";
            iterationCheckWeight++;
            break;
        }
        else if(Weight4Check.equalsIgnoreCase("Honors")){
            AP4Temp= "Honors";
            iterationCheckWeight++;
            break;
        }
        else if (Weight4Check.equalsIgnoreCase("Normal")){
            AP4Temp= "Normal";
            iterationCheckWeight++;
            break;
        }
        else{
            errorCheck = false;
            break;
        }
        }
        AP4=AP4Temp;
        
        while (errorCheck == true && iterationCheckGrade ==3 ){
            System.out.println("Input your grade.");
            if(sc.hasNextInt()){
            class4=sc.nextInt();
            if (class4 >100){
                class4= 100;
                iterationCheckGrade++;
                break;
            }
            else if (class4 <0){
                class4= 0;
                iterationCheckGrade++;
                break;
            }
            else if (class4>=0 && class4<=100){
                class4= class4;
                iterationCheckGrade++;
                break;
            }
        }
        else{
            errorCheck=false;
            break;
        }
        }
        gclass4 = class4;

        while (errorCheck == true && iterationCheckWeight ==4){
        System.out.println("Is the class an AP, honors, or normal?");
        Weight5Check= sc.next();
        if (Weight5Check.equalsIgnoreCase("AP")){
            AP5Temp= "AP";
            iterationCheckWeight++;
            break;
        }
        else if(Weight5Check.equalsIgnoreCase("Honors")){
            AP5Temp= "Honors";
            iterationCheckWeight++;
            break;
        }
        else if (Weight5Check.equalsIgnoreCase("Normal")){
            AP5Temp= "Normal";
            iterationCheckWeight++;
            break;
        }
        else{
            errorCheck = false;
            break;
        }
        }
        AP5=AP5Temp;
        
        while (errorCheck == true && iterationCheckGrade ==4){
            System.out.println("Input your grade.");
            if(sc.hasNextInt()){
            class5=sc.nextInt();
            if (class5 >100){
                class5= 100;
                iterationCheckGrade++;
                break;
            }
            else if (class5 <0){
                class5= 0;
                iterationCheckGrade++;
                break;
            }
            else if (class5>=0 && class5<=100){
                class5= class5;
                iterationCheckGrade++;
                break;
            }
        }
        else{
            errorCheck=false;
            break;
        }
        }
        gclass5 = class5;

        while (errorCheck == true && iterationCheckWeight ==5){
        System.out.println("Is the class an AP, honors, or normal?");
        Weight6Check= sc.next();
        if (Weight6Check.equalsIgnoreCase("AP")){
            AP6Temp= "AP";
            iterationCheckWeight++;
            break;
        }
        else if(Weight6Check.equalsIgnoreCase("Honors")){
            AP6Temp= "Honors";
            iterationCheckWeight++;
            break;
        }
        else if (Weight6Check.equalsIgnoreCase("Normal")){
            AP6Temp= "Normal";
            iterationCheckWeight++;
            break;
        }
        else{
            errorCheck = false;
            break;
        }
        }
        AP6=AP6Temp;
        
        while (errorCheck == true && iterationCheckGrade ==5){
            System.out.println("Input your grade.");
            if(sc.hasNextInt()){
            class6=sc.nextInt();
            if (class6 >100){
                class6= 100;
                iterationCheckGrade++;
                break;
            }
            else if (class6 <0){
                class6= 0;
                iterationCheckGrade++;
                break;
            }
            else if (class6>=0 && class6<=100){
                class6= class6;
                iterationCheckGrade++;
                break;
            }
        }
        else{
            errorCheck=false;
            break;
        }
        }
        gclass6 = class6;
        //GPA point= new GPA();
        
        int [] Percentages = new int[]{gclass1, gclass2, gclass3, gclass4, gclass5, gclass6};
        double[] GPA = new double[]{GPA1, GPA2, GPA3, GPA4, GPA5, GPA6};
        String[] AP = new String[]{AP1, AP2, AP3, AP4, AP5, AP6};

        
        for (int i = 0; i <6; i++){
            if (AP[i] == "Honors"){
            if (Percentages[i] >= 97 && Percentages[i] <=100 ){
                GPA[i]= 4.500;
            }
            if (Percentages[i] >= 93 && Percentages[i] <=96 ){
                GPA[i]= 4.167;
            }
            if (Percentages[i] >= 90 && Percentages[i] <=92 ){
                GPA[i]= 3.834;
            }
            if (Percentages[i] >= 87 && Percentages[i] <=89 ){
                GPA[i]= 3.167;
            }
            if (Percentages[i] >= 83 && Percentages[i] <=86 ){
                GPA[i]= 2.834;
            }
            if (Percentages[i] >= 80 && Percentages[i] <=82 ){
                GPA[i]= 2.500;
            }
            if (Percentages[i] >= 77 && Percentages[i] <=79 ){
                GPA[i]= 2.167;
            }
            if (Percentages[i] >= 73 && Percentages[i] <=76 ){
                GPA[i]= 1.834;
            }
            if (Percentages[i] >= 70 && Percentages[i] <=72 ){
                GPA[i]= 1.5;
            }
            if (Percentages[i] <70 ){
                GPA[i]= 0.000;
            }
        }
        else if (AP[i] == "AP"){
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
            else{
               
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
            System.out.println(GPAFinal);
            GPAFinal = GPAFinal+GPA[i];

        }
        if (errorCheck == true && iterationCheckWeight ==6 && iterationCheckGrade ==6){
            runTime = false;
            break;
        } 
        else{
            System.out.println("Invalid value, please check your input");
            GPAFinal=0;
            errorCheck = true;
        }
    }
        System.out.println(GPAFinal);
        GPAFinal = GPAFinal/6;
        System.out.println(GPAFinal);
    }   

}

    

