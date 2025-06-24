package Java_Tasks._23June;

//   Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
//           :- take the Site URL input from the user


// USING IF - ELSE

import java.util.Scanner;
public class checkingSites {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Website URL ..........");
        String Url=sc.nextLine();



            String trimedUrl = Url.trim();
            if (trimedUrl.isEmpty()) {  // checking input is empty or not
                System.out.println("please enter a valid Url");
            } else {

                int checkdotInUrl = trimedUrl.lastIndexOf('.');  // for finding domain name


                // for checking domain name exsist or not
                if (checkdotInUrl == -1 || checkdotInUrl == trimedUrl.length() - 1 || checkdotInUrl == 0) {
                    System.out.println("Unknown or other types of websites (Invalid Domain Format)");
                } else {
                    // extracting domain names
                    String domainpart = trimedUrl.substring(checkdotInUrl + 1).toLowerCase();
                    if (domainpart.equals("com")) {
                        System.out.println("The website type is: Commercial website");
                    } else if (domainpart.equals("org")) {
                        System.out.println(" The website type is: Non-profit organization");
                    } else if (domainpart.equals("edu")) {
                        System.out.println("The website type is: Educational institution");

                    } else if (domainpart.equals("gov")) {
                        System.out.println("The website type is: Government website");

                    } else if (domainpart.equals("net")) {
                        System.out.println("The website type is: Network-related website");

                    } else if (domainpart.equals("info")) {
                        System.out.println("The website type is: Informational website");

                    } else if (domainpart.equals("xyz")) {
                        System.out.println("The website type is: Unknown or other types of websites");

                    }


                }


            }
        }


    }
