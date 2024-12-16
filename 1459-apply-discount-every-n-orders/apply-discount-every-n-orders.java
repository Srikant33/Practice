class Cashier {
    int cur;
    int actualCur;
    int off;
    HashMap<Integer, Integer> hm = new HashMap<>();

    public Cashier(int n, int discount, int[] products, int[] prices) {
        cur= n;
        actualCur=n;
        off= discount;
        for (int i=0;i <products.length; i++){
            hm.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        double total = 0;
        for (int i=0; i<product.length; i++){
            total += hm.get(product[i])*amount[i];
        }
        // System.out.println(off);
        if (cur == 1){
            cur = actualCur;
            return total * ((100-(double)off)/100);
        }
        else {
            cur--;
            return total;
        }
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */