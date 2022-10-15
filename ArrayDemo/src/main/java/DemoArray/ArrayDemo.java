package DemoArray;

public class ArrayDemo {

    public static void main(String[] args){}


//    int[][]  gradeTable = {
//            {99, 42, 74, 83, 100},
//            {90, 91, 72, 88, 95},
//            {88, 61, 74, 89, 96},
//            {61, 89, 82, 98, 93},
//            {93, 73, 75, 78, 99},
//            {50, 65, 92, 87, 94},
//            {43, 98, 78, 56, 99},
//
//        System.out.println(gradeTable[0][0]);

    int[][] uneven =
            {
                    {1,9,4},
                    {0,2},
                    {0,1,2,3,4}
            };

    //System.out.println(uneven[2].length);

        for(int row = 0; row < uneven.length; row++ ){
        System.out.println("outer loop at index/row " + row + " :");
        for(int col = 0; col < uneven[row].length; col++ ){
            System.out.println(uneven[row][col] + " ");
            System.out.println("================");
        }
    }
}
