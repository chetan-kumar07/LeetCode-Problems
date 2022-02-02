class Solution {
    public boolean isAnagram(String s, String t) {
    s=s.replace(" ","");
    t=t.replace(" ","");
        
        s=s.toLowerCase();
        t=t.toLowerCase();
        
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        Boolean result=Arrays.equals(a,b);
        if(result==true){
            return true;
        }
        else{
            return false;
        }
    
    }
}