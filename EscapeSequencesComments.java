public class EscapeSequencesComments {
    public static void main ( String[] args ) {
        // This exercies demonstrates escape sequences & comments (like these)!
        System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
        System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
        // System.out.frimp( "Learn Java the hard Way" );
        System.out.print( "Hello\n" ); // This line prints Hello.
        System.out.print( "Jello\by\n" ); // This line prints Jelly.
        /* The quick brown fox jumped over the lazy dog.
            Quick wafting zephyrs vex bold Jim. */
        System.out /* testing */ .println( "Hard to believe, eh?" );
        System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
        // Can't go hog wild with comments
        // System.out.print/* doesn't work! */ln( "\\ // -=- \\ //" );
        System.out.println( "\\ // -=- \\ //" );
        System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
        System.out.println( "I hope you understand \"escape sequences\" now.\n");
        // and comments. :)
    }
}