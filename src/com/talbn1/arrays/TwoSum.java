package talbn1.codeleet.arrays;

import com.sun.jmx.remote.util.EnvHelp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author talbn on 6/15/2020
 **/
public class TwoSum {

    public static void main(String[] args) throws Exception {

        /**
         * Given nums = [2, 7, 11, 15], target = 9,
         * Because nums[0] + nums[1] = 2 + 7 = 9,
         * return [0, 1].
         * */
        int[] nums = {13, 2, 11, 7,3,5,8,12,22,34};

        int[] rv = {0,0};
            rv =     Solution.twoSum(nums, 36);

            for (int i = 0 ; i< rv.length ; i++){
                System.out.println(rv[i]);
            }
    }


}

class Solution {

    public static int[] twoSum(int[] nums, int target) throws Exception {

        Map<Integer, Integer> diffmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (diffmap.containsKey(diff)) {
                return new int[]{diffmap.get(diff), i};
            }
            diffmap.put(nums[i], i);
        }
        throw new Exception("error");
    }

}

/*



13|0  = diff = 36-13 = 23
02|1  = diff = 36-02 = 34  --------
11|2  = diff = 36-11 = 25
07|3  = diff = 36-07 = 29
03|4  = diff = 36-03 = 33
05|5  = diff = 36-05 = 31
08|6  = diff = 36-08 = 28
12|7  = diff = 36-12 = 24
22|8  = diff = 36-22 = 14
34|9  = diff = 36-34 = 02  --------- diffMap contain 34?? yes, then return 01,09 that equals to
02 and 34 that equls to 36






*/
