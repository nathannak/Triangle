import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        [
//        [2],
//        [3,4],
//        [6,5,7],
//        [4,1,8,3]
//        ]

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        temp.add(2);
        res.add(temp);

        temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        res.add(temp);

        temp = new ArrayList<>();
        temp.add(6);
        temp.add(5);
        temp.add(7);
        res.add(temp);

        temp = new ArrayList<>();
        temp.add(4);
        temp.add(1);
        temp.add(8);
        temp.add(3);
        res.add(temp);

        System.out.println( minimumTotal(res));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }

}
