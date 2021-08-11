package by.vsulab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneSearch {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^\\D*(?:\\d\\D*){12,}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String phoneStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(phoneStr);
        return matcher.find();
    }

    public static void phoneSearch(TextLoader textLoader) {

//        textLoader.trim().replaceAll("\\p{Punct}", "");
//
//        String[] txtArray = textLoader.split(" ");

        textLoader.setImportTxt(textLoader.getImportTxt().trim().replaceAll("\\p{Punct}", ""));

        textLoader.setImportTxt(textLoader.getImportTxt().trim().replaceAll("-- ", ""));

        String[] txtArray = textLoader.getImportTxt().split(" ");

        ArrayList<String> phoneList = new ArrayList<>();

        for (int i = 0; i < txtArray.length; i++) {
            String email = txtArray[i];

            if (validate(txtArray[i])) {
                phoneList.add(email);
            }
        }
        if (phoneList.size() != 0) {

            System.out.println(Arrays.toString(new ArrayList[]{phoneList}));
        } else {
            System.out.println("В данном тексте нет телефонных номеров");
        }

    }
}
