class Solution {
    public int romanToInt(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        Map<Character,Integer>charMap=new HashMap<>();
        charMap.put('I',1);
        charMap.put('V',5);
        charMap.put('X',10);
        charMap.put('L',50);
        charMap.put('C',100);
        charMap.put('D',500);
        charMap.put('M',1000);
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if(charMap.get(s.charAt(i))>=charMap.get(s.charAt(i+1))){
                res=res+charMap.get(s.charAt(i));
            }
            else{
                res=res-charMap.get(s.charAt(i));    
            }
        }
        res=res+charMap.get(s.charAt(s.length()-1));
    return res;}
    
}