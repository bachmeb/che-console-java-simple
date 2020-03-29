/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        String a = "Che";
        System.out.println("Hello World " + a + "!");


        HelloWorld me = new HelloWorld();

        me.addOneAndOne();

    }

    private void addOneAndOne(){

        int sum = Calculator.add(1,1);

        System.out.println("One and one is " + sum + "!");

    }
}
