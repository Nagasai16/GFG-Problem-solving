class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int pSize = positive.size();
        int nSize = negative.size();
        while (i < pSize && i < nSize) {
            result.add(positive.get(i));
            result.add(negative.get(i));
            i++;
        }
        while (i < pSize) {
            result.add(positive.get(i));
            i++;
        }
        while (i < nSize) {
            result.add(negative.get(i));
            i++;
        }

        return result;
    }
}