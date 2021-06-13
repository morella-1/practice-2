import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class CalculateVolume {
        public static void main(String args[]) {
            File fRead = new File("D:\\goods.txt");
            File fWrite = new File("goodsVolume.txt");
            try { Writer out = new FileWriter(fWrite, true);
                BufferedWriter bufferWrite = new BufferedWriter(out);
                Reader in = new FileReader(fRead);
                BufferedReader bufferRead = new BufferedReader(in);
                String str = null;
                while ((str = bufferRead.readLine()) != null) {
                    double s = Jisuan.getVolume(str);
                    str = str + "体积:" + s + "cm3";
                    System.out.println(str);
                    bufferWrite.write(str);
                    bufferWrite.newLine();
                }
                bufferRead.close();
                bufferWrite.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

    class Jisuan{
        public static double getVolume(String s){
            Scanner scanner=new Scanner(s);
            scanner.useDelimiter("[^0123456789.]+");
            double volume=1;
            while (scanner.hasNext()){
                try{
                    double distance=scanner.nextDouble();
                    volume=volume*distance;
                }
                catch(InputMismatchException exp){
                    String t=scanner.next();
                }
            }
            return volume;
        }
    }

