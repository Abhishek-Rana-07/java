class StrBuff{
    public static void main(String args[])
    {
        StringBuffer s=new StringBuffer("HELLO");
        s.append("Java");
        System.out.println("String after appending Java: "+s+"\n");

        s.insert(1, "Java");
        System.out.println("String after inserting Java at index 1: "+s+"\n");

        s.replace(1,2,"Java");
        System.out.println("String after replacing characeters at index 1 and 2 with Java: "+s+"\n");

        s.delete(1, 4);
        System.out.println("String after deleting character from start index to end-1: "+s+"\n");

        s=new StringBuffer("HELLO");
        s.reverse();
        System.out.println("String HELLO after reversing: "+s+"\n");
    }
}
