/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicDispatch;

/**
 *
 * @author M KHOLIKUL ANAM ADE K
 */
public class DynamicDispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callthis();

        ref = a;
        ref.callthis();
    }
}
