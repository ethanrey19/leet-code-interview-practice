class Solution {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x); 
        String opp = "";
        for(int i = string.length()-1; i >= 0;i--){
            opp+= string.substring(i,i+1);
        }
        if(string.equals(opp)){
            return true;
        }return false;
    }
}