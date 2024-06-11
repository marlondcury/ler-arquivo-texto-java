package aplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplication.Product;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {

       /*


       VERSAO #1

       File file = new File("/Users/marlindo/Documents/in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(sc != null) sc.close();
        }

        ______________________###_____________________

        VERSAO #2


        String path = "/Users/marlindo/Documents/in.txt";

        FileReader fr = null;
        BufferedReader br = null;


        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while ((line != null)){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                br.close();
                fr.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }


     ______________________###_____________________

        VERSAO #3


        String path = "/Users/marlindo/Documents/in.txt";
        List<Product> list = new ArrayList<Product>();
        System.out.println(list);

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while ((line != null)){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        */

        //VERSAO #4


        String path = "/Users/marlindo/Documents/in.txt";
        List<Product> list = new ArrayList<Product>();
        System.out.println(list);

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            line = br.readLine();
            while ((line != null)){

                String[] vect = line.split(",");
                String name = vect[0];
                Double price = Double.parseDouble(vect[1]);
                Integer qtd = Integer.parseInt(vect[2]);

                Product prod = new Product(name, price, qtd);
                list.add(prod);


                System.out.println(line);
                line = br.readLine();
            }
            System.out.println("PRODUTOS");
            for(Product p : list){
                System.out.println(p);
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
