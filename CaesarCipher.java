import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CaesarCipher {
    /**
     * Returns the character shifted by the given number of letters.
     */
    public static char shiftLetter(char c, int n){
        int u = c;

        if(!Character.isLetter(c))
            return c;
        
        u = u + n;
        if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z'){
            u -= 26;
        }
        if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a'){
            u += 26;
        }

        return (char)u;
    }
    public static void main( String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);

        String plaintext, inFile, outFile, cipher = "";
        int shift;

        //prompt for encryption file
        System.out.print("Enter the name of a file to encrypt: ");
        inFile = keyboard.next();
   
        try{
            Scanner source = new Scanner(new File(inFile));
            System.out.print("Enter Character Shift (0-26): ");
            shift = keyboard.nextInt();

            while(source.hasNext()){
                plaintext = source.next();

                for(int i = 0; i < plaintext.length(); i++){
                    cipher += shiftLetter(plaintext.charAt(i), shift);
                }       
            }
            source.close();
            
        } catch(FileNotFoundException err) {
            System.out.println("Unable to read file " + inFile);
            System.out.println("Exiting...");
            System.exit(1);
        }
            

        System.out.print("\nEnter the name of a file to save to (\"none\" to skip): ");
        outFile = keyboard.next();
        if(!outFile.equals("none")){
            PrintWriter out = new PrintWriter(outFile);
            out.println(cipher);
            out.close();
        } else {
            System.out.println(cipher);
        }

        keyboard.close();
    }
}