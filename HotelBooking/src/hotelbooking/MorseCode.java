package hotelbooking;
import java.util.Scanner;

public class MorseCode {
    public static String[][] mor = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"," "},{".-","-...", "-.-.", "-..",  ".","..-.", "--.",  "....", "..",".---", "-.-",  ".-..", "--",   "-.",   "---",".--.", "--.-", ".-.",  "...",  "-","..-",  "...-", ".--",  "-..-", "-.--","--..","_____", ".____","..___","...__","...._",".....","_....","__...","___..","____.","++"}};
    
    public static String encode(String data){
        data = data.toLowerCase();
        String encodedData = "";
        for(int i = 0;i<data.length();i++){
            char temp = data.charAt(i);
            for(int j = 0; j<37;j++){
                if((mor[0][j].charAt(0)) == temp){
                    encodedData = encodedData+(mor[1][j]);
                    encodedData = encodedData+" ";
                }
            }
        }
        return (encodedData);
    }
    public static String decode(String data){
        String decodedData = "";
        for(int j = 0; j<37;j++){
            if(mor[1][j].equals(data)){
                decodedData = decodedData+(mor[0][j].charAt(0));
            }
        }
        return (decodedData);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String Or A Number: ");
        String data = sc.nextLine();
        String res = encode(data);
        System.out.println("Before Encoding The Data = '"+data+"' After Encoding Data = '"+res+"'");
        System.out.println("Enter The Morse Code: ");
        data = sc.nextLine();
        System.out.print("Before Decoding The Data = '"+data+"' After Decoding The Data = '");
        String[] arrOfStr = data.split(" ");
        for (String a : arrOfStr){
            res = decode(a);
            System.out.print(res);
        }
        System.out.println("'");
        System.out.println();
    }
}
