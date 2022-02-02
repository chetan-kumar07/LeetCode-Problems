class Solution {
    public String intToRoman(int num) {
        String ans ="";
        
            if(num>=1000){
                while(num>=1000){
                    num = num -1000;
                    ans+='M';
                }
            }
            if(num>=900 && num<1000){
                num = num -900;
                ans+="CM";
            }
            if(num>=500 && num<900){
                num = num -500;
                ans+='D';
            }
            if(num>=400 && num<500){
                num = num -400;
                ans+="CD";
            }
            if(num>=100 && num<400){
                while(num>=100){
                    num = num-100;
                    ans+='C';
                }
            }
            if(num>=90 && num<100){
                num = num -90;
                ans+="XC";
            }
            if(num>=50 && num<90){
                num = num -50;
                ans+='L';
            }
            if(num>=40 && num<50){
                num = num -40;
                ans+="XL";
            }
            if(num>=10 && num<40){
                while(num>=10){
                    num = num-10;
                    ans+='X';
                }
            }
            if(num==9){
                num = num -9;
                ans+="IX";
            }
            if(num>=5 && num<9){
                num = num -5;
                ans+='V';
            }
            if(num==4){
                num = num - 4;
                ans+="IV";
            }
            while(num!=0){
                num = num - 1;
                ans+='I';
            }
            
        return ans;
    }
}