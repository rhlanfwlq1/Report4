package jp.ac.uryukyu.ie.e185739;

public class Main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
