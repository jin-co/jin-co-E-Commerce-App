package add.console;

import data.structures.DataStructures;
import data.structures.RunningTime;

public class Main {

    public static void main(String[] args) {
        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] participant1 = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant2 = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"eden", "kiki"};
        String[] completion1 = new String[] {"josipa", "filipa", "marina", "nikola"};
        String[] completion2 = new String[] {"stanko", "ana", "mislav", "ana"};

//        System.out.println(Maraton.solution(participant2, completion2));
        int[] stones = new int[] {1, 3, 2};
        int k = 3;

        System.out.println(Stone.stone(stones, k));

//        String[] input = new String[] {"119", "97674223", "12","13","15","567","88", "1195524421"};
//        System.out.println(PhoneBook.phone(input));
        int[] nums = {1, 4, 2, 5};
        System.out.println(nums[0]);

    }
}
