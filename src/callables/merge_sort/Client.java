package callables.merge_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(6,7,8,9,1,2,3,4,5);
        ExecutorService executor = Executors.newCachedThreadPool();
        MergeSort mergeSort = new MergeSort(list,executor);
        Future<List<Integer>> submit = executor.submit(mergeSort);
        try{
            List<Integer> list1 = submit.get();
            for(int i=0; i<list1.size(); i++){
                System.out.print(list1.get(i) + " ");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
