package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str ="123";

        int num = Integer.parseInt(str);
        System.out.println(num);

        System.out.println(num +1);

        System.out.println(str +1 );

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println("str2 = " + str2);
        System.out.println("num2 = " + num2);

        System.out.println(num2+1);

        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);

        System.out.println("max = " + max);

        System.out.println("-----------------");

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

        System.out.println("------------------");

        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println("r1 = " + r1);

        String s2 = "123";
        Integer x = Integer.valueOf(s2);

        int y = Integer.valueOf(s2);

        System.out.println("x = " + x);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);

        System.out.println("z = " + z);

        System.out.println("------------------");

        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);

        boolean r3 = Character.isLetter(ch1);

        boolean r4 = Character.isLetterOrDigit(ch1);

        boolean r5 = Character.isUpperCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        System.out.println("------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }

        }
        System.out.println("sum = " + sum);


    }


}
