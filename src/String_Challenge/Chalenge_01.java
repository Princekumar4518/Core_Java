package String_Challenge;
// Write a Java program that demonstrates basic string operations including
// concatenation, length, substring, and character extraction.
// Hello World
//OUTPUT:Length: 11, First char: H, Substring: World
public class Chalenge_01 {
    public static void main(String[] args) {
        String Input="Hello World";
        System.out.println("Length :"+" "+Input.length());// length 11

        System.out.println("First Character :"+" "+Input.charAt(0));// first character

        System.out.println("Substring :"+" "+Input.substring(5)); // extracting the World
    }
}
