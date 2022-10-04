package Lab06;

public class Lab6_3 {
    public static String main(String[] args) {
                String myStr = "100 minutes";
                String digits ="";
                for (int i = 0; i < myStr.length(); i++) {
                    char chAt = myStr.charAt(i);
                    if (Character.isDigit(chAt))
                        digits = digits+chAt;
                }
                return digits;
            }
        }
