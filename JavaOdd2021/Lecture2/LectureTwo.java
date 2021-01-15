import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class LectureTwo {
    public static void main(String[] args) {
        //Strings Clarification
        String name = "Edgar";
        String name2 = "Edgar";

        String name3 = new String("Edgar");
        String name4 = new String("Edgar");

        //Edgar's Tip -- Remember This
        System.out.println(name3.equals(name4));

        //Arrays
        String[] people;

        String[] people2 = { "Matthew", "Edgar", "Laura" };
        people2[0] = "Makarand";

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int ii = 0; ii < numbers.length; ii++) {
            System.out.println(numbers[ii]);
        }
        System.out.println(Arrays.toString(numbers));

/*        //Strongly Typed
        String name6 = "Laura";
        //Weakly Typed (javaScript)
        var/let/const name6 = "Laura";
        //Weakly Typed (Python)
        name6 = "Laura" */

        ArrayList<String> StringList = new ArrayList<String>();
        StringList.add("one");
        StringList.add("two");
        StringList.add("three");
        StringList.add("four");
        StringList.add("five");

        System.out.println(StringList);
        System.out.println(StringList.contains("Thomas")); //false

        //Adv FOR LOOP
        for(String number : StringList) {
            System.out.println(number);
        }

        //Standard for loop
        for(int iii = 0; iii < StringList.size(); iii++) {
            System.out.println(StringList.get(iii));
        }

        System.out.println(StringList.indexOf(3));

        //HashMaps

        //Key:Value pair
        HashMap<String, String> ourHobbies = new HashMap<String, String>();
        //Put adds into hashmaps
        ourHobbies.put("Matthew", "Photography");
        ourHobbies.put("Laura", "Sewing");
        ourHobbies.put("Tony", "Hockey");
        ourHobbies.put("Kevin", "Soccer");
        ourHobbies.put("Teresa", "Reading");
        ourHobbies.put("Victoria", "Comics");
        ourHobbies.put("Edgar", "Hiking/Biking");
        ourHobbies.put("Robert", "Gaming");
        ourHobbies.put("Michael", "DND");
        System.out.println(ourHobbies);

        //Get method gets value with key
        System.out.println(ourHobbies.get("Michael"));

        //key below is the iterator and can be called whatever I want it to be. 
        for(String key : ourHobbies.keySet()) {
            System.out.println(key);
        }

        System.out.println(maxArrayValue(numbers));

    }

    public static int maxArrayValue(int[] nums) {
        int maxValue = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
}