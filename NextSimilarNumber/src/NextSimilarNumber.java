import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextSimilarNumber {

    public String solve(String A) {
        char[] ch=A.toCharArray();
        int k=0;
        int i;
        for(i=A.length()-1;i>0;i--){
            if(Integer.valueOf(A.charAt(i))>Integer.valueOf(A.charAt(i-1))){
                k=i-1;
                break;
            }
        }
        if(i==0)
            return "-1";
        int mini=i;
        int val=Integer.valueOf(A.charAt(k));
        int j;
        for(j=i+1;j<A.length();j++){
            if(Integer.valueOf(A.charAt(j))>val && Integer.valueOf(A.charAt(j))< Integer.valueOf(A.charAt(mini)) ){
                mini=j;
            }
        }
        char temp=ch[k];
        ch[k]=ch[mini];
        ch[mini]=temp;

        Arrays.sort(ch,i,ch.length);
        return ch.toString();
    }

}
