class strings_func
{
    public static void main(String[]args){

String word1= "Java is My Favourite LANGUAGE";
String word2="  JAVA is,a language";

// 1)  String.length();
System.out.println("1) Length= "+ word1.length());

// 2)  String.charAt(index);
System.out.println("2) Character at index 2= "+ word1.charAt(2));

// 3)  String.substring(begin index, end index);
System.out.println("3) "+word1.substring(0,4));

// 4)  String.equals( another string ); // returns boolean type
System.out.println("4) "+word1.equals(word2));

// 5)  String.toUpperCase();
System.out.println("5) "+ word1.toUpperCase());

// 6)  String.trim();
System.out.println("6) "+word2.trim());

// 7)  String.replace( old char, new char );
System.out.println("7) "+ word1.replace("Java","C++"));

// *  8)  String.split(regex);
String regex="[,]";
String myarray[]=word2.split(regex);
System.out.print("8) ");
for(String word:myarray)
{
System.out.println(word);
}

// 9)  String.contains(sequqnce);
System.out.println("9) "+ word1.contains("JAVA"));

// 10) String.equalsIgnoreCase( another string );
String w="Java";
System.out.println("10) "+ w.equalsIgnoreCase("JAVA"));

// 11) String.indexOf( substring );
System.out.println("11) "+ word1.indexOf("Favourite"));

// 12) 


    }
}