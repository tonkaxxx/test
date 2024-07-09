class twobottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        return 1;
    }
    public int drink(int numBottles, int numExchange) {
        return numBottles;
    }
    public int change(int numBottles, int numExchange){
        int restempty = numBottles%numExchange;
        int empty = numBottles/numExchange+restempty;
        return empty;
    }
}
 