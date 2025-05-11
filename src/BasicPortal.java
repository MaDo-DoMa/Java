public class BasicPortal {
    int [] fieldOfPlacement;
    int howManyHits;

    public void setFieldOfPlacement(int[] fop)
    {
        fieldOfPlacement = fop;
    }

    public String check(String stringField){
        int hit = Integer.parseInt(stringField);
        String result = "miss";
        for(int field : fieldOfPlacement){
            if(hit == field){
                result = "hitted";
                howManyHits++;
                break;
            }
        }
        if(howManyHits == fieldOfPlacement.length){
            result = "sunked";
        }
        System.out.println(result);
        return result;
    }
}
