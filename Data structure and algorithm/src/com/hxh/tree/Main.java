package com.hxh.tree;

public class Main {
    Main left;
    Main right;
    int val;
    public Main(int x)
    {
        this.val=x;
    }

    public void insert(int value) {
        if (value <= val) {
            // go toleft
            if (left == null) {
                left = new Main(value);

            } else {
                left.insert(value);
            }
        }else{
            if(right==null)
            {
                right =new Main(value);
            }else{
                right.insert(value);
            }
        }
    }
  public boolean contains(int value){
      if (value == val) {

          return true;
      } else if (value < val) {

          if(left == null){
              return false;
          }else{
              return left.contains(value);
          }

      }else {
          if(right == null ){
              return false;

          }else {
              return right.contains(value);
          }
      }

  }
  public void printInOrder(){
        if(left!=null){
            left.printInOrder();
        }
        System.out.println(val);
        if(right !=null)
        {
            right.printInOrder();
        }

  }

    }
