package mentoring;

public class unlucky {
    public static void main(String[] args) {

    }
    public boolean unlucky1(int[] nums) {
        if(nums.length > 1) {
            if(nums[0] == 1 && nums[1] == 3) {
                return true;
            } else if(nums[1] == 1 && nums[2] == 3){
                return true;
            } else if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
