public static void multiply(Arraylist<ArrayList<Integer>> a, Arraylist<ArrayList<Integer>> b){
       int n = a.size();
       ArrayList<arrayList<Integer>> ans = new ArrayList<>();
       for(int i =0; i<n; i++){
            ans.add(new ArrayList<>());
                for(int j = 0; j<n; j++){
                int sum =0;
                    for(int k =0; k<n; k++){
                        sum+= a.get(i).get(k) * b.get(k).get(j);
                    }
                    ans.get(i).add(sum);
                }
        }
        System.out.print(arr);
    }