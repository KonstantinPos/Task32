public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 2359; i++) {
            String a = String.valueOf(i);
            if (a.length() == 1) {
                a = "000" + a;
                if (Character.getNumericValue(a.charAt(0)) == Character.getNumericValue(a.charAt(3)) && Character.getNumericValue(a.charAt(1)) == Character.getNumericValue(a.charAt(2)) && Character.getNumericValue(a.charAt(2)) <= 5) {
                    count++;
                    System.out.println(Character.getNumericValue(a.charAt(0)) + "" + Character.getNumericValue(a.charAt(1)) + ":" + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3)));
                }
            }
            if (a.length() == 2) {
                a = "00" + a;
                if (Character.getNumericValue(a.charAt(0)) == Character.getNumericValue(a.charAt(3)) && Character.getNumericValue(a.charAt(1)) == Character.getNumericValue(a.charAt(2)) && Character.getNumericValue(a.charAt(2)) <= 5) {
                    count++;
                    System.out.println(Character.getNumericValue(a.charAt(0)) + "" + Character.getNumericValue(a.charAt(1)) + ":" + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3)));
                }
            }
            if (a.length() == 3) {
                a = "0" + a;
                if (Character.getNumericValue(a.charAt(0)) == Character.getNumericValue(a.charAt(3)) && Character.getNumericValue(a.charAt(1)) == Character.getNumericValue(a.charAt(2)) && Character.getNumericValue(a.charAt(2)) <= 5) {
                    count++;
                    System.out.println(Character.getNumericValue(a.charAt(0)) + "" + Character.getNumericValue(a.charAt(1)) + ":" + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3)));
                }
            }
            if (a.length() == 4) {
                a = "" + a;
                if (Character.getNumericValue(a.charAt(0)) == Character.getNumericValue(a.charAt(3)) && Character.getNumericValue(a.charAt(1)) == Character.getNumericValue(a.charAt(2)) && Character.getNumericValue(a.charAt(2)) <= 5 && Character.getNumericValue(a.charAt(3)) != 0) {
                    count++;
                    System.out.println(Character.getNumericValue(a.charAt(0)) + "" + Character.getNumericValue(a.charAt(1)) + ":" + Character.getNumericValue(a.charAt(2)) + Character.getNumericValue(a.charAt(3)));

                }
            }

        }
        System.out.println("Количество симметричных комбинаций - " + count);
    }
}