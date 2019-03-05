import java.util.Scanner;

class Actor {
    String name;
    String role;
    String birthdate;

    Actor(String _name, String _role, String _birthdate){
        name = _name;
        role = _role;
        birthdate = _birthdate;
    }
}


public class ActorList {
    public static void main( String[] args) throws Exception{
        String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
        // Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
        Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
        int actorCount = 0;
        while (inFile.hasNext()){
            Actor a = getActor(inFile);
            System.out.print(a.name + " was born on " + a.birthdate);
            System.out.println(" and played " + a.role);
            ++actorCount;
        }
        System.out.println(actorCount + " records processed.");
        inFile.close();
    }

    public static Actor getActor(Scanner input){
        return new Actor(input.nextLine(), input.nextLine(), input.nextLine());
    }
}