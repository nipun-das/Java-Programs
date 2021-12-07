public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();
        obj1 = null;
        obj2 = null;
        System.gc();
    }
        public void finalize(){
            System.out.println(this+" Object is garbage collected "); //hash code
        }
}
