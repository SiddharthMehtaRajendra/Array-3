//Time Complexity: O(nlogn) -- Because of Sorting
//Space Complexity: O(1)

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        Arrays.sort(citations);
        for(int i = 0; i < n; i++){
            if(citations[i] >= (n - i)) return (n - i);
        }
        return 0;
    }
}
