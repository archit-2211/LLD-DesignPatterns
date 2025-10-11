package PenLLD;

class DisposableBehavior implements OnEmptyBehavior {
    public void handleEmpty() {
        System.out.println("Dispose the pen.");
    }
}