package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }


    public static void main(String[] args) {

        final double pi = 3.14;
       // pi = 4.14;
       // pi = 5.14;

        final String name;

        name = "java";

        //name= "wooden spoon";

        System.out.println(name);

        FinalVariable obj = new FinalVariable("May/01");



        System.out.println(obj.birthDay);

        System.out.println(name);




    }
}
