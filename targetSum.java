/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class targetSum
{
    public static boolean twoSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;
        while(right>left)
        {
            if(numbers[left]+numbers[right] == target){
                return true;
            }
            else if(numbers[left]+numbers[right] > target){
                right --;
            }
            else{
                left++;
            }
        }
        return false;
        
    }
	public static void main(String[] args) {
	    int[] num = {3,4,5,7,9,12,17,24,25};
	    int target = 2;
	    boolean a = twoSum(num,target);
	    System.out.println(a);
		
	}
}
