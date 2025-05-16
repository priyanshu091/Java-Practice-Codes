public class SortedArrayMergerApproach2 {

    public static void main(String[] args) {


        System.out.println("Enter Array 1:");
        int[] numarray1=utilityArray.inputArray();
        System.out.println("Enter Array 2:");
        int[] numarray2=utilityArray.inputArray();

        System.out.println("Merge Result will be :");

        int[] merged = merger(numarray1,numarray2);
        System.out.println("Length of new one is "+ merged.length);
        utilityArray.DisplayArray(merged);

    }
    public static int[] merger(int[] Array1,int[] Array2) {
        int[] merged = new int[(Array1.length + Array2.length)];
        int indexmerge = 0;
        int indexA1 = 0;
        int indexA2 = 0;


        while(indexA1< Array1.length && indexA2< Array2.length)
        {
            if(Array1[indexA1]<Array2[indexA2]){
                merged[indexmerge]=Array1[indexA1];
                indexA1++;
                indexmerge++;

            }else{
                merged[indexmerge]=Array2[indexA2];
                indexA2++;
                indexmerge++;

            }
            while(indexA1< Array1.length){
                merged[indexmerge]=Array1[indexA1];
                indexA1++;
                indexmerge++;
            }
            while(indexA2< Array2.length){
                merged[indexmerge]=Array2[indexA2];
                indexA2++;
                indexmerge++;
            }
        }
return merged;
    }
}
