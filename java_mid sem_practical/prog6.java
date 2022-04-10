class StrFunc {
    
    public static void main(String args[])
    {
        String s="Java";

        System.out.println(s.concat("Welcome"));//This will print JavaWelcome but will not change content of s
        System.out.println("String after cocating welcome: "+s);

        System.out.println("Character at index 1: "+s.charAt(1));
        System.out.println("Index of first a: "+s.indexOf("a"));
        System.out.println("Index of second a: "+s.lastIndexOf("a"));

        String s2=new String("JAVA");
        System.out.println("Comparing Java to JAVA : "+s.equals(s2));
        System.out.println("Comparing Java to JAVA ignoring case: "+s.equalsIgnoreCase(s2));

        System.out.println("Index of first 'a' from last: "+s.lastIndexOf("a"));
    }
}
