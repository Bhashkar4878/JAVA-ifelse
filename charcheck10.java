class charcheck10 {
    public static void main(String[] args) {
        char ch = 'G';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet");
        }
    }
}
