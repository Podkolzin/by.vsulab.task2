package by.vsulab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailSearch extends TextLoader {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }


    public static void emailSearch(TextLoader textLoader) {

//        textLoader.trim().replaceAll("\\p{Punct}", "");
//
//        String[] txtArray = textLoader.split(" ");

        textLoader.setImportTxt(textLoader.getImportTxt().trim().replaceAll("\\p{Punct}", ""));

        textLoader.setImportTxt(textLoader.getImportTxt().trim().replaceAll("-- ", ""));

        String[] txtArray = textLoader.getImportTxt().split(" ");

        ArrayList<String> email_list = new ArrayList<String>();

        for (int i = 0; i < txtArray.length; i++) {
            String email = txtArray[i];

            if (validate(txtArray[i])) {
                email_list.add(email);
            }
        }
        if (email_list.size() != 0) {

            System.out.println(Arrays.toString(new ArrayList[]{email_list}));
        } else {
            System.out.println("В данном тексте нет электронной почты");
        }

    }
}
