class alpha9 {
    public static void main(String[] args) {
        char ch = '*';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
}
