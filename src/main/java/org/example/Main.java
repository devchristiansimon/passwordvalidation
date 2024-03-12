package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isMinLength(String password) {
        if(password.length() >= 8) {
            return true;
        } else return false;
    }

    public static boolean hasDot(String password){

            if (password.contains(".")) {
                return true;
            }

        return false;
    }
    public static boolean hasUpperAndLower(String password){
        boolean containsLower = false;
        boolean constainsUpper = false;

        for(int i = 0; i< password.length(); i++){
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                containsLower = true;
            } else if (Character.isUpperCase(c)) {
                constainsUpper = true;
            }
            if (containsLower && constainsUpper) {
                return true;
            }
        }

        return false;
    }
    public static boolean hasCommonPassword(String password){
        String[] commonPasswords = {"Password", "abcdefgh", "HalloWelt", "DominicIstDerCoolste123"};
        for (String element : commonPasswords) {
            if (element.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasspecialCharacters(String password){
        char[] specialCharacters = { '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~' };

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            for (char specialChar : specialCharacters) {
                if (currentChar == specialChar) {
                    return true;
                }
            }
        }
        return false;
    }


}