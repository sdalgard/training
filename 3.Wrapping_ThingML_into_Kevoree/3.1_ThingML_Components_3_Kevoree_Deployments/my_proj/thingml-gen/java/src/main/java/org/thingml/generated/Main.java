/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.api.*;
import org.thingml.generated.messages.*;

import java.util.*;
public class Main {
//Things
public static TimerJava TimerJava_Deployment0_timer;
public static void main(String args[]) {
//Things
TimerJava_Deployment0_timer = (TimerJava) new TimerJava("Deployment0_timer: TimerJava", (Thread)null).buildBehavior();
//Connectors
//Starting Things
TimerJava_Deployment0_timer.init();
TimerJava_Deployment0_timer.start();
Runtime.getRuntime().addShutdownHook(new Thread() {
public void run() {
System.out.println("Terminating ThingML app...");TimerJava_Deployment0_timer.stop();
System.out.println("ThingML app terminated. RIP!");}
});

}
}
