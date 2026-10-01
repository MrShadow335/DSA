import java.util.*;


public class practice{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        // 2. Add each row instantly using Arrays.asList
        mat.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        mat.add(new ArrayList<>(Arrays.asList(40, 50, 60)));
        mat.add(new ArrayList<>(Arrays.asList(70, 80, 90)));

        for(int i=0; i<mat.size(); i++){
            for(int j=0; j<mat.get(i).size(); j++){
                System.out.print(mat.get(i).get(j) + " ");
            }
        }
    }
}