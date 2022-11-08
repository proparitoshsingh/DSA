class Solution {
    public int maximum69Number (int num) {
        int a=num;
        int i=0;
        int ptr=0;
        while(a%10!=0){
            i++;
            if(a%6==0){
                ptr=i;
            }a=a/10;
        }if(ptr==0){
            return num;
        }a=num;
        int b=a%(int)(Math.pow(10,ptr));
        b=b-(6*(int)Math.pow(10,ptr-1))+(9*(int)Math.pow(10,ptr-1));
        a=a/((int)Math.pow(10,ptr));
        a=a*((int)Math.pow(10,ptr));
        a=a+b;
        return a;
    }
}