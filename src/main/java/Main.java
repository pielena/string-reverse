public class Main {

    public static void main(String[] args) {
        Integer[] repetitions = {1000, 10000, 100000};
        String input = args[0];
        System.out.println(input);
        System.out.println(reverseStringByStringBuilder(input));

        for (Integer i : repetitions) {
            long startTime = System.nanoTime();
            for (int k = 0; k < i; k++) {
                reverseStringByStringBuilder(input);
            }
            long endTime = System.nanoTime();
            System.out.println(endTime - startTime);
        }

//        Or you can use this variant:

//        for (Integer i : repetitions) {
//            long startTime = System.nanoTime();
//            for (int k = 0; k < i; k++) {
//                reverseStringByLoop(input);
//            }
//            long endTime = System.nanoTime();
//            System.out.println(endTime - startTime);
//        }

    }


    public static String reverseStringByStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        return sb.toString();
    }

    public static String reverseStringByLoop(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(result);
    }
}
