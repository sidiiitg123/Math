package com.company;

public class SortedRank {
    public int fact(int x){
        if(x<=1){
            return 1;
        }
        return x*fact(x-1);
    }

    public int findRight(String A,int low,int high){
        int count=0;
        for(int j=low+1;j<=high;j++){
            if(A.charAt(j)<A.charAt(low)){
                count++;
            }
        }
        return count;
    }

    public int findRank(String A){
        int rank=1;
        int noRight=0;
        for(int i=0;i<A.length();i++){
            noRight=findRight(A,i,A.length()-1);
            rank+=noRight*fact(A.length()-i-1);
        }
        return  rank;
    }
}
