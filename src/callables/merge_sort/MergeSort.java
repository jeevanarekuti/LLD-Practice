package callables.merge_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    ExecutorService service;
    List<Integer> list;

    public MergeSort(List<Integer> list, ExecutorService service) {
        this.list = list;
        this.service = service;
    }


    @Override
    public List<Integer> call() throws Exception {
        System.out.println("MERGE SORT" + list + " " + Thread.currentThread().getName());
        int size = list.size();
        if(size <= 1){
            return list;
        }
        int middle = size / 2;
        List<Integer> leftArr = new ArrayList<Integer>();
        for (int i = 0; i < middle; i++) {
            leftArr.add(list.get(i));
        }
        List<Integer> rightArr = new ArrayList<>();
        for (int i = middle; i < size; i++) {
            rightArr.add(list.get(i));
        }

        MergeSort mergeSort = new MergeSort(leftArr, service);
        MergeSort mergeSort2 = new MergeSort(rightArr, service);

        Future<List<Integer>> futureleftArr = service.submit(mergeSort);
        Future<List<Integer>> futurerightArr = service.submit(mergeSort2);

        leftArr = futureleftArr.get();
        rightArr = futurerightArr.get();

        List<Integer> mergedList = new ArrayList<>();
        int i=0;int j=0;
        while(i<leftArr.size() && j<rightArr.size()){
            if(leftArr.get(i)<rightArr.get(j)){
                mergedList.add(leftArr.get(i));
                i++;
            }
            else{
                mergedList.add(rightArr.get(j));
                j++;
            }
        }
        while(i<leftArr.size()){
            mergedList.add(leftArr.get(i));
            i++;
        }
        while(j<rightArr.size()){
            mergedList.add(rightArr.get(j));
            j++;
        }
        return mergedList;
    }
}
