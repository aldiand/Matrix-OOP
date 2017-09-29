/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author aldiand
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);         
        Scanner sc2 = new Scanner(System.in);  
        Matrix matrix[] = new Matrix[2];         
        Matrix result;
        
        System.out.println("====================================");
        System.out.println("||        Operating Matrix        ||");
        System.out.println("===================================="); 
        System.out.println("||by aldiand                      ||"); 
        System.out.println("====================================");
        
        String x = "";
     
        
        while(x != "0"){
            
            System.out.println("Choose your menu : ");
            System.out.println("1. Input Matrix");
            System.out.println("2. Add Matrix");
            System.out.println("3. Multiply Matrix");
            System.out.println("0. Exit");
            System.out.println("=====================");

            System.out.print("Select menu :");
            x = sc.nextLine();
            switch(x){
                case "1":
                    System.out.println("Input row: ");
                    int row = sc2.nextInt();
                    System.out.println("Input column: ");
                    int col = sc2.nextInt();
                    
                    System.out.println("Matrix A:");
                    matrix[0] = new Matrix(row,col);                    
                    
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Insert Matriks A row %d col %d : ", (i + 1), (j + 1));
                            matrix[0].setElement(i, j, sc2.nextFloat());
                        }
                    }
                    
                    System.out.println("Matrix B:");
                    matrix[1] = new Matrix(row,col);                    
                    
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Insert Matriks B  row %d col %d : ", (i + 1), (j + 1));
                            matrix[1].setElement(i, j, sc2.nextFloat());
                        }
                    }
                    System.out.println("===================");
                    System.out.println("Insert Successful!");
                    System.out.println("===================");
                    break;
                    
                case "2":
                    try{
                        result = Matrix.add(matrix[0], matrix[1]); 
                        System.out.println("Multiply result of Matrix A + Matrix B");
                        System.out.println(result.toString());  
                    }catch(NullPointerException e){
                        System.out.println("=========================");
                        System.out.println("Input your matrix first!");
                        System.out.println("=========================");
                    }
                    break;
                case "3":                  
                    try{
                        result = Matrix.mult(matrix[0], matrix[1]); 
                        System.out.println("Add result of Matrix A + Matrix B");
                        System.out.println(result.toString());  
                    }catch(NullPointerException e){
                        System.out.println("=========================");
                        System.out.println("Input your matrix first!");
                        System.out.println("=========================");
                    }
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Wrong input man");
                    break;
            }
        }
        
    }
       
    
}
