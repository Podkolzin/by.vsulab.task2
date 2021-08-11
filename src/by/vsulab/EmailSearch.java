package by.vsulab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSearch extends TextLoader {

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

        ArrayList<String> emailList = new ArrayList<>();

        for (int i = 0; i < txtArray.length; i++) {
            String email = txtArray[i];

            if (validate(txtArray[i])) {
                emailList.add(email);
            }
        }
        if (emailList.size() != 0) {

            System.out.println(Arrays.toString(new ArrayList[]{emailList}));
        } else {
            System.out.println("В данном тексте нет электронной почты");
        }

    }
}
