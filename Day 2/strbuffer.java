class strbuffer {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("welcome");

        str.append(" to I-Exceed");
        System.out.println(str);               // welcome to I-Exceed

        System.out.println(str.length());      // length of the current string

        System.out.println(str.insert(7, " bye")); // inserts " bye" at index 7

        // Uncomment to reverse the string
        // System.out.println(str.reverse());

        System.out.println(str.replace(8, 11, "to")); // replaces characters at index 8 to 10 with "to"
    }
}
