class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0,j=0;i<a.length && j<b.length;){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]){
                i++;
            }
            else {
                j++;
            }
            
        }
        return result;
    }
}