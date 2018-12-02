package com.satish.exp;

public class Test implements Comparable<Test>{

    public Integer age;

    public Test(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Test test1 = new Test(12);
        Test test2 = new Test(12);
        System.out.println(test1.equals(test2));

    }

    @Override
    public int compareTo(Test o) {
        if(this.age == o.age){
            return 0;
        }else if(this.age > o.age){
            return 1;
        }else{
            return -1;        }
    }

    @Override
    public boolean equals(Object obj) {

        return (this.age.equals(((Test)obj).age));
    }
}
