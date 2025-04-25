package org.abstraction;

public class TestFace implements face1,face2{

    public void fun(){
        System.out.println("fun method");
    }
    public static void main(String args[]){
        TestFace tf = new TestFace();
        tf.fun();
    }
}
