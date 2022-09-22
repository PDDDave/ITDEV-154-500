
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class AlgorithmTest {
    private final int UPPER_BOUND = 100;
    private Integer[] arr100 = new Integer[100];  //have to use Integer instead of int due to "confusing primitive array argument to varargs method" error.
    private Integer[] arr1k = new Integer[1000];  //the above error caused my lists to not print as expected, see https://stackoverflow.com/questions/25409103/why-does-netbeans-warn-about-passing-int-to-vararg
    private List<String> list100 = new LinkedList();
    private List<String> list1k = new LinkedList();
    
    public AlgorithmTest (){
        PopulateStructure(arr100);
        PopulateStructure(arr1k);
        
        CopyData(arr100,list100);
        CopyData(arr1k, list1k);
        
        TimeTest(arr100,list100);
        TimeTest(arr1k, list1k);
    }

    private void PopulateStructure(Integer[] arr) {
        Random rand = new Random();
        for(int i =0; i < arr.length; i++){
            arr[i] = rand.nextInt(UPPER_BOUND);
        }
    }



    public List getList100() {
        return list100;
    }

    public void setList100(List list100) {
        this.list100 = list100;
    }

    public List getList1k() {
        return list1k;
    }

    public void setList1k(List list1k) {
        this.list1k = list1k;
    }

    private void CopyData(Integer[] arr, List list) {
        Collections.addAll(list, arr);
        list.forEach(element ->{
            System.out.println(element);
        });
    }

    public Integer[] getArr100() {
        return arr100;
    }

    public void setArr100(Integer[] arr100) {
        this.arr100 = arr100;
    }

    public Integer[] getArr1k() {
        return arr1k;
    }

    public void setArr1k(Integer[] arr1k) {
        this.arr1k = arr1k;
    }

    private void TimeTest(Integer[] arr100, List<String> list100) {
        
    }
    
}
