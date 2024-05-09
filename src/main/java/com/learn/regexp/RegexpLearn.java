package com.learn.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpLearn {

    public static void main(String[] args) {
        String reg10 = "(\".+\":.+,?)*";
        String reg10Str = "\"a\":1";

//        String reg11 = "(\\[\\{(\".+\":.+,?)*\\}\\])|(\\{.(\".+\":.+,?)*\\})";
        String reg11 = "(\\[(\\{(\".+\":.+,?)*\\}),?\\])";
        String reg11Str = "[{\"a\":1,\"b\":2},{\"c\":\"d\"}]";

        String reg12 = "(\\{(\".+\":.+,?)*\\})";
        String reg12Str = "{\"a\":1,\"b\":2}";

        String reg13 = "(\\[(\\{(\".+\":.+,?)*\\}),?\\])|(\\{(\".+\":.+,?)*\\})";

        String reg14 = "(\\{(\".+\":.+,?)*\\})";


        if (match(reg13, reg11Str)) {
            System.out.println("====================");
        } else {
            System.out.println("==========FALSE==========");
        }

    }

    private static boolean match(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    private static void regBase() {
        String reg1 = ".*";

        String reg2 = "a|b|c";
        String reg3 = "[abc]";

        String reg4 = "[^abc]";

        String reg5 = "[a-zA-Z]";

        String reg6 = "\\d";
        String reg7 = "\\D";

        String reg8 = "\\[";

        String reg9 = "(\\[\\{.*\\}\\])|(\\{.*\\})";
    }
}
