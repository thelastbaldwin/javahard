public class RandomNumbers {
  private static int random(double from, double to){
    return (int)from + (int)((to - from + 1) * Math.random());
  }

  private static int[] random4(double from, double to){
    int[] nums = new int[4];
    for(int i = 0; i < nums.length; ++i){
      nums[i] = random(from, to);
    }
    return nums;
  }

  private static void print4(int[] nums, String range){
    System.out.println(range + ": \t" + nums[0] + "\t" + nums[1] + "\t" + nums[2] + "\t" + nums[3]);
  }

  public static void main( String[] args) {
    int[] nums = new int[4];
    double r, rps;

    rps = Math.random();
    if(rps < 0.3333333){
      System.out.println("ROCK");
    } else if (rps < 0.6666667) {
      System.out.println("PAPER");
    } else {
      System.out.println("SCISSORS");
    }

    nums = random4(0, 10);
    print4(nums, "0-10");

    nums = random4(0, 6);
    print4(nums, "0-6");

    nums = random4(0, 100);
    print4(nums, "0-100");

    nums = random4(0, 99);
    print4(nums, "0-99");

    nums = random4(10, 20);
    print4(nums, "10-20");

    System.out.println("0-1:\t" +  Math.random() + "\t" + Math.random());
    System.out.println("0-1:\t" +  Math.random() + "\t" + Math.random());

    r = 10 * Math.random();
    System.out.println("0-9.99:\t" + r);
    System.out.println("0-9:\t" + (int)r);
    System.out.println("1-10:\t" + (1 + (int)r));
  }
}