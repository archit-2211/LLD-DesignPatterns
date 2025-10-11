package PenLLD;

class RefillableBehavior implements OnEmptyBehavior {
    public void handleEmpty() {
        System.out.println("Refill the pen.");
    }
}
