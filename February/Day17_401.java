package February;

import java.util.ArrayList;
import java.util.List;

public class Day17_401 {

    public static void main(String[] args) {
        int turnedOn = 1;
        List<String> ans = new Day17_401().readBinaryWatch(turnedOn);
        System.out.println(ans);
    }
    List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int i = 0;i<12;i++){
            for(int j = 0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    ans.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return ans;
    }
}

// Problem 
// 401. Binary Watch
// Given 1's count of hours and minutes combined return the number of possible time that can be formed

// New Learning 
// String.format("%d:%02d", hour, minute)
// Integer.bitCount(i)+Integer.bitCount(j)
