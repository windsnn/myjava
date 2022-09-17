//学号 202102869
//姓名 张道堃
class Solution {
    public int romanToInt(String s) {
    int length = s.length();
    int[] nums = new int[length];
    int num = 0;
    for (int i = 0; i < length; i++) {
    switch (s.charAt(i)) {
        case 'M':
            num = 1000;
            break;
        case 'D':
            num = 500;
            break;
        case 'C':
            num = 100;
            break;
        case 'L':
            num = 50;
            break;
        case 'X':
            num = 10;
            break;
        case 'V':
            num = 5;
            break;
        case 'I':
            num = 1;
            break;
    }
    nums[i] = num;
}
    int rtn = 0;
    for (int i = 0; i < nums.length; i++) {
        if (i < nums.length - 1 && nums[i] < nums[i+1]) {
            nums[i] = - nums[i];
        }
    rtn += nums[i];
}
return rtn;
    }
}