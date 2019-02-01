package com.satish.exp.asynch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class CallableAdder implements Callable<Integer> {

     Integer a,b;

     public CallableAdder(Integer a, Integer b){
         this.a = a;
         this.b = b;
     }

    @Override
    public Integer call() throws Exception {
        return a + b;
    }
}


public class CallableFuture{

    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futureList = new ArrayList<>();

        for(int i=0,j=0; i <10 || j < 10; i++,j++ ){
            futureList.add(service.submit(new CallableAdder(i,j)));
        }

        futureList.stream().map( sum -> {
            Integer added = 0;
            try {
                added = sum.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            return added;

        } ).forEach( val -> System.out.println(val));

    }
}
