public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     *        each letter in the string based on the character's position. Digits
     *        are duplicated by the value of their digit. Any other character
     *        considered non-alphanumeric will result in all characters being
     *        appended to the result, up to but not including the non-alphanumeric
     *        character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        System.out.println(word);
        String other = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isDigit(c) || Character.isLetter(c)){
                other += c;
            }
            if (Character.isDigit(c)) {
                int repeatCount = Character.getNumericValue(c);
                sb.append(String.valueOf(c).repeat(repeatCount));
            } else if (Character.isLetter(c)) {
                int repeatCount = i + 1;
                sb.append(String.valueOf(c).repeat(repeatCount));
            } else {
                sb.append(other);
            }
        }

        return sb.toString();
    }
}
/*
TODO: Replace this line with your algorithm
*/
