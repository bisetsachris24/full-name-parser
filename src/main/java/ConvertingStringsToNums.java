public class ConvertingStringsToNums {

    public static void main(String[] args) {


        // string contains "id|description|quantity|price"
        String theString = "111|Hot Chocolate (12-count)|21|4.99";
        String[] theStringParts =theString.split("\\|");

        int id = Integer.parseInt(theStringParts[0]);

        System.out.println(id);






    }
}
