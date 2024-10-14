public class Main {
    public static void main(String[] args) {
        double [] numbers = {7.5,3.4, -2.1, 2.8,-4.7,5.8,9.6,-8.4,6.8,11.5,9.3,7.9,13.7,5.9,9.4};
        boolean b = false;
        int sum = 0;
        int num = 0;
        for (double number : numbers){
            if(number< 0) {
                b = true;
            }
            if (b && number > 0) {
                num++;
                sum+= number;
            }
        }
        System.out.println(sum/num);
    }
}