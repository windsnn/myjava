//学号 202102869
//姓名 张道堃
class Solution {
    public boolean isPalindrome(int x) {
    if (x < 0||( x % 10==0 && x!= 0)) {
            return false;
        }
    int a=0;
    while(x>a){
        a=a*10+x%10;
        x/=10;
        }
        return x==a||x==a/10;
    }
}