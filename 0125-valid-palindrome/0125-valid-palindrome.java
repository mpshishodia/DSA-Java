class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char ch = s.charAt(left);
            char cht = s.charAt(right);
            if((ch < 'a' || ch > 'z') && (ch < '0' || ch > '9')){    // here i can also use if(!Character.isLetterOrDigit(ch)){}
                left++;
            }else if((cht < 'a' || cht > 'z') && (cht < '0' || cht > '9')){
                right--;
            }else if(ch != cht){  // insteead of writing a = a.toLowerCase() to optimiz i can write else if (Character.toLowerCase(ch) != Character.toLowerCase(cht)) { 
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}