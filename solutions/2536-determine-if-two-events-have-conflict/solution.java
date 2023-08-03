class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return event2[0].compareTo(event1[1]) <= 0 && event2[1].compareTo(event1[0]) >= 0;
    }
}
