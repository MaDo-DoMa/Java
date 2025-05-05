public class Tester {
    public static void main(String[] args){
        BasicPortal wit= new BasicPortal();
        int[] placement = {2,3,4};
        wit.setFieldOfPlacement(placement);
        String choosenField = "2";
        String result = wit.check(choosenField);
        choosenField = "3";
        result = wit.check(choosenField);
        choosenField = "4";
        result = wit.check(choosenField);
    }
}
