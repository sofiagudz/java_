package list;

import java.util.Comparator;

public class StringSort implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        int n = 0;
        int i = 0;
        do{
            if(s1.charAt(i) > s2.charAt(i)){
                return 1;
            }
            else{
                if(s1.charAt(i) < s2.charAt(i)){
                    return -1;
                }
                else{
                    if(s1.charAt(i) == s2.charAt(i)){
                        i++;
                    }
                }
            }
        }while(n == 0);
        return n;
    }

}
