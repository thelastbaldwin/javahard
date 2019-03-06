public class FarmerBrown {
    public static void main( String[] args){
        double  cPrice = 0.5,
                gPrice = 3.5,
                sPrice = 10.00;

        for(int s = 1; s <= 100 && s * sPrice < 100.0; s++){
            for(int g = 1; g <= 100 && g * gPrice < 100.0; g++){
                for(int c = 1; c <= 100 && c * cPrice < 100.0; c++){
                    if (s+g+c == 100 && sPrice * s + gPrice * g + cPrice * c == 100.00){
                        System.out.print(s + " sheep, ");
                        System.out.print(g + " goats, and ");
                        System.out.println(c + " chickens.");
                    }
                }
            }
        }
    }
}