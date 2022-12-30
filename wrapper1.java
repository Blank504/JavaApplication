import java.lang.*;

// class wrapper1{
//     public static void main(String[]args){
//     //use of boolean wrapper class 
//     Boolean bobj = new Boolean(false);
//      Boolean bobj2 = new Boolean("TRUE");
//      System.out.println("Value of bobj"+bobj);
//      System.out.println("Value of bobj2"+bobj);
//  System.out.println("Value of bobj.TRUE"+bobj.TRUE);
//  System.out.println("Value of bobj.FALSE"+bobj.FALSE);
//  System.out.println("\n Value of bobj12"+bobj2);


//     }
// }

import java.lang.Boolean;
import java.util.Vector;
import java.util.Stack;
 import java.util.Dictionary;
 import java.util.Hashtable;

 
class wrapper1 {
    public static void main(String[] args) {
        // use of Boolean Wrapper Class
        Boolean bobj = new Boolean(false);
        Boolean bobj2 = new  Boolean("True");
        System.out.println("value of bobj: " + bobj);
        System.out.println("value of bobj2: " + bobj2);
        System.out.println("value of bobj.TRUE: " + bobj.TRUE);
        System.out.println("value of bobj.FALSE: " + bobj.FALSE);
        System.out.println("value of bobj.TYPE: " + bobj.TYPE);
        
        
        // use of Byte Wrapper Class;
        byte bt = 12;
        Byte btobj = new Byte(bt);
        Byte btobj2 = new Byte("15");
        System.out.println("value of btobj: " + btobj);
        System.out.println("value of btobj2: " + btobj2);
        System.out.println("value of btobj.MAX_VALUE: " + btobj.MAX_VALUE);
        System.out.println("value of btobj.MIN_VALUE: " + btobj.MIN_VALUE);
        System.out.println("value of btobj.TYPE: " + btobj.TYPE);
        System.out.println("value of btobj.SIZE: " + btobj.SIZE);
        
        // use of Integer Wrapper Class;
        Integer iobj = new Integer(1);
        Integer iobj2 = new Integer("12");
        System.out.println("value of iobj: " + iobj);
        System.out.println("value of iobj2: " + iobj2);
        System.out.println("value of iobj.MAX_VALUE: " + iobj.MAX_VALUE);
        System.out.println("value of iobj.MIN_VALUE: " + iobj.MIN_VALUE);
        System.out.println("value of iobj.TYPE: " + iobj.TYPE);
        System.out.println("value of iobj.SIZE: " + iobj.SIZE);
        
        // use of Float Wrapper Class;
        float f = (float)10.20;
        Float fobj = new Float(f);
        Float fobj2 = new Float("12.234");
        System.out.println("value of fobj: " + fobj);
        System.out.println("value of fobj2: " + fobj2);
        System.out.println("value of fobj.MAX_VALUE: " + fobj.MAX_VALUE);
        System.out.println("value of fobj.MIN_VALUE: " + fobj.MIN_VALUE);
        System.out.println("value of fobj.TYPE: " + fobj.TYPE);
        System.out.println("value of fobj.SIZE: " + fobj.SIZE);
        
         // use of Vector Wrapper Class;
        Vector <Double> vd = new Vector <> ();
        vd.add(12.12);
        vd.add(21.12);
        vd.add(32.43);
        vd.add(54.67);
        System.out.println("value of vd: " + vd);
        System.out.println("size of vd: " + vd.size());
        vd.remove(0);
        System.out.println("value of vd: " + vd);
        System.out.println("size of vd: " + vd.size());

 // use of Short Wrapper Class;
        Short sobj = new Short((short)1);
        Short sobj2 = new Short("12");
        System.out.println("value of sobj: " + sobj);
        System.out.println("value of sobj2: " + sobj2);
        System.out.println("value of sobj.MAX_VALUE: " + sobj.MAX_VALUE);
        System.out.println("value of sobj.MIN_VALUE: " + sobj.MIN_VALUE);
        System.out.println("value of sobj.TYPE: " + sobj.TYPE);
        System.out.println("value of sobj.SIZE: " + sobj.SIZE);
        

         // use of Long Wrapper Class;
         Long lobj = new Long((long)1);
        Long lobj2 = new Long("12");
        System.out.println("value of lobj: " + lobj);
        System.out.println("value of lobj2: " + lobj2);
        System.out.println("value of lobj.MAX_VALUE: " + lobj.MAX_VALUE);
        System.out.println("value of lobj.MIN_VALUE: " + lobj.MIN_VALUE);
        System.out.println("value of lobj.TYPE: " + lobj.TYPE);
        System.out.println("value of lobj.SIZE: " + lobj.SIZE);
        


          // use of Stack Wrapper Class;
        Stack <Integer> s = new Stack <> ();
       s.push(12);
       s.push(21);
       s.push(32);
       s.push(54);
        System.out.println("value ofs: " +s);
        System.out.println("size ofs: " +s.size() + "last elem: " + s.pop());
       
        System.out.println("value ofs: " +s);
        System.out.println("size ofs: " +s.size());

        // use of Dictionary;


     Dictionary d = new Hashtable();
     d.put("name","Ashok");
      d.put("age",12); 
      d.put("roll",1);
      System.out.println(d.get("name"));
      System.out.println(d.get("age"));
      System.out.println(d.get("roll"));
      System.out.println(d.size());



    }
}