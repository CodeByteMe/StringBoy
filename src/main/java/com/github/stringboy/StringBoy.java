package com.github.stringboy;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class StringBoy {
    public static String BASE64Encoder(String str) {
        String base64 = null;
        try {
            base64 = Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return base64;
    }

    public static String BASE64Decoder(String str) {
        byte[] decode = Base64.getDecoder().decode(str);
        String result = null;
        try {
            result = new String(decode, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int count(String original, String value) {
        int count = 0;
        while (original.indexOf(value) != -1) {
            count++;
            original = original.substring(original.indexOf(value) + value.length());
        }
        return count;
    }

    public static boolean containsAll(String original, String[] strArr) {
        boolean flag = true;
        for (String str : strArr) {
            if (!original.contains(str)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean containsAny(String original, String[] strArr) {
        boolean flag = false;
        for (String str : strArr) {
            if (original.contains(str)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static String first(String original, int length) {
        if (length > original.length()) {
            length = original.length();
        }
        return original.substring(0, length);
    }

    public static String last(String original, int length) {
        if (length > original.length()) {
            length = original.length();
        }
        return original.substring(original.length() - length);
    }

    public static String slice(String original, int start, int end) {
        String result;
        if (end < start && end >= 0) {
            return "";
        }
        if (end < 0) {
            result = original.substring(start, original.length() + end);
        } else {
            result = original.substring(start, end);
        }
        return result;
    }

    public static boolean isBlank(String str) {
        return null == str || "".equals(str.trim());
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException var2) {
            return false;
        }
    }

    public static String upperFirst(String str) {
        char[] chars = str.toCharArray();
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] = (char)(chars[0] - 32);
        }
        return new String(chars);
    }

    public static String swapCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
                continue;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
                continue;
            }
        }
        return new String(chars);
    }
}
