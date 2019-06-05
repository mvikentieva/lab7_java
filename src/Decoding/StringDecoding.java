package Decoding;


public class StringDecoding {

        public static String decode(String s){
            StringBuffer decoded = new StringBuffer();
            char buffer = '0';
            int num = 0;
            for (int i = 0; i < s.length(); i++){
                if (!Character.isDigit(s.charAt(i))){
                    if (buffer != '0') {
                        for (int k = 0; k < num; k++)
                            decoded.append(buffer);
                        buffer = '0';
                    }
                    buffer = s.charAt(i);
                    num = 1;
                    if (i == s.length() - 1)
                        decoded.append(buffer);
                }
                else {
                    num = Integer.parseInt(Character.toString(s.charAt(i)));
                }
            }
            return decoded.toString();
        }

    }