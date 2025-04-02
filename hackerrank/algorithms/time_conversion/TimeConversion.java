public class TimeConversion {

    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder(s);

        if (sb.substring(8).equals("AM")) {
            if (sb.substring(0, 2).equals("12")) {
                sb.setCharAt(0, '0');
                sb.setCharAt(1, '0');
                sb.delete(8, 10);
            } else {
                sb.delete(8, 10);
            }
        } else {
            int hrs = Integer.parseInt(sb.substring(0, 2));
            int timeRemaining = 24 - hrs;

            if (timeRemaining == 12) {
                sb.setCharAt(0, '1');
                sb.setCharAt(1, '2');
            } else {
                String militaryHrs = String.valueOf(24 + (12 - timeRemaining));
                sb.setCharAt(0, militaryHrs.charAt(0));
                sb.setCharAt(1, militaryHrs.charAt(1));
            }

            sb.delete(8, 10);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "12:45:54PM";
        System.out.println(timeConversion(s));
    }
}
