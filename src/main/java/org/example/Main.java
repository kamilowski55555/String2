package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));


    }

    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - wordLength && str.substring(i, i + wordLength).equals(word)) {
                result.append(word);
                i += wordLength; // Przesuń indeks o długość słowa
            } else {
                result.append('+');
                i++;
            }
        }

        return result.toString();
    }


    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '*') {
                // Skip the current star
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                // Skip the character immediately after a star
                continue;
            }
            if (i < len - 1 && str.charAt(i + 1) == '*') {
                // Skip the character immediately before a star
                continue;
            }
            result.append(str.charAt(i));
        }

        return result.toString();
    }


    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p' && i+2 <str.length()) {

                    result.append("zp");
                    i += 2;


            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            result.append(str.charAt(i + 1))
                    .append(str.charAt(i + 2))
                    .append(str.charAt(i));
        }
        return result.toString();
    }

    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length()-1; i++){

            if ((str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1))) {
                return false;
            }
        }
        return true;
    }
    public String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        // Check if there are at least two "bread" substrings
        if (firstBread != -1 && lastBread != -1 && firstBread != lastBread) {
            return str.substring(firstBread + 5, lastBread);
        } else {
            return "";
        }
    }



    public boolean xyzMiddle(String str) {
        int len = str.length();

        // "xyz" can't be in the middle if the string is shorter than 3 characters
        if (len < 3) {
            return false;
        }

        // Iterate over the possible starting positions for "xyz"
        for (int i = 0; i <= len - 3; i++) {
            // Check if "xyz" is at position i
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = len - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);
        return str.substring(n).contains(prefix);
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            if (i == count-1) {
                result.append(word);
            } else {
                result.append(word).append(sep);
            }
        }
        return result.toString();

    }
    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        int index = n;
        for (int i = 0; i < n; i++) {
            result.append(str, 0, index--);
        }
        return result.toString();

    }

    public String repeatEnd(String str, int n) {
        StringBuilder result = new StringBuilder();
        String end = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            result.append(end);
        }
        return result.toString();
    }



    public static String mixString(String a, String b) {

        StringBuilder result = new StringBuilder();
        int maxIterations = Math.max(a.length(), b.length());
        for (int i = 0; i < maxIterations; i++) {

            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }

    public boolean xyBalance(String str) {
        boolean flagBalance = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                flagBalance = false;
            }
            if (str.charAt(i) == 'y') {
                flagBalance = true;
            }
        }
        return flagBalance;
    }

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }


    public boolean xyzThere(String str) {
        // Loop through the string and check each position
        for (int i = 0; i <= str.length() - 3; i++) { // We need at least 3 characters left to have "xyz"
            if (str.startsWith("xyz", i)) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true; // Return true if "xyz" starts the string or isn't preceded by '.'
                }
            }
        }
        return false; // Return false if no valid "xyz" is found
    }


    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if the longer string ends with the shorter one
        return a.endsWith(b) || b.endsWith(a);
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;

    }

    public String doubleChar(String str) {
        int i = 0;
        String result = "";
        while (i < str.length()) {
            result = result + str.charAt(i) + str.substring(i, i + 1);
            i++;
        }

        return result;
    }

    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;

    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                countCat++;
            }
            if (str.startsWith("dog", i)) {
                countDog++;
            }
        }

        return countDog == countCat;
    }
}