//This is Folder is mypackage and in there I have myclass 

package mypackage;
public class myclass {
    public void sayhello() {
        System.out.println("Hello!!");
    }
}

//This is file outside the mypackage folder 

import mypackage.myclass;
public class P22{
    public static void main(String[] args) {
        myclass mc = new myclass();
        mc.sayhello();
    }
}