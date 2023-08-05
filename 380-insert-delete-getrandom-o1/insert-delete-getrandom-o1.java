class RandomizedSet {
    HashMap<Integer, Integer> hm;
    List<Integer> l;
    public RandomizedSet() {
        hm = new HashMap<>();
        l = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (hm.containsKey(val)){
            return false;
        }
        else {
            hm.put(val, l.size());
            l.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (hm.containsKey(val)){
            l.remove(Integer.valueOf(val));
            hm.remove(val);
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getRandom() {
        // System.out.println(hm+ " " +l.size());
        return l.get((int)(Math.random()*l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */