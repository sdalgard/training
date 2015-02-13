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
public static JavaPrinter JavaPrinter_JavaPIF_printer;
public static PIFEnder PIFEnder_JavaPIF_ender;
public static PIFIncDec PIFIncDec_JavaPIF_pif4;
public static PIFIncDec PIFIncDec_JavaPIF_pif2;
public static PIFIncDec PIFIncDec_JavaPIF_pif5;
public static PIFStarter PIFStarter_JavaPIF_starter;
public static TimerJava TimerJava_JavaPIF_timer;
public static PIFIncDec PIFIncDec_JavaPIF_pif3;
public static PIFIncDec PIFIncDec_JavaPIF_pif6;
public static PIFIncDec PIFIncDec_JavaPIF_pif1;
public static void main(String args[]) {
//Things
PIFStarter_JavaPIF_starter = (PIFStarter) new PIFStarter("JavaPIF_starter: PIFStarter", (short)5000).buildBehavior();
TimerJava_JavaPIF_timer = (TimerJava) new TimerJava("JavaPIF_timer: TimerJava", (Thread)null).buildBehavior();
JavaPrinter_JavaPIF_printer = (JavaPrinter) new JavaPrinter("JavaPIF_printer: JavaPrinter").buildBehavior();
PIFEnder_JavaPIF_ender = (PIFEnder) new PIFEnder("JavaPIF_ender: PIFEnder", (short)0).buildBehavior();
PIFIncDec_JavaPIF_pif1 = (PIFIncDec) new PIFIncDec("JavaPIF_pif1: PIFIncDec", (short)0).buildBehavior();
PIFIncDec_JavaPIF_pif6 = (PIFIncDec) new PIFIncDec("JavaPIF_pif6: PIFIncDec", (short)0).buildBehavior();
PIFIncDec_JavaPIF_pif4 = (PIFIncDec) new PIFIncDec("JavaPIF_pif4: PIFIncDec", (short)0).buildBehavior();
PIFIncDec_JavaPIF_pif3 = (PIFIncDec) new PIFIncDec("JavaPIF_pif3: PIFIncDec", (short)0).buildBehavior();
PIFIncDec_JavaPIF_pif5 = (PIFIncDec) new PIFIncDec("JavaPIF_pif5: PIFIncDec", (short)0).buildBehavior();
PIFIncDec_JavaPIF_pif2 = (PIFIncDec) new PIFIncDec("JavaPIF_pif2: PIFIncDec", (short)0).buildBehavior();
//Connectors
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFIncDec_JavaPIF_pif2.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFIncDec_JavaPIF_pif2);
new Connector(PIFIncDec_JavaPIF_pif3.getFrom_starter_port(), PIFIncDec_JavaPIF_pif2.getTo_ender_port(), PIFIncDec_JavaPIF_pif3, PIFIncDec_JavaPIF_pif2);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFIncDec_JavaPIF_pif3.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFIncDec_JavaPIF_pif3);
new Connector(PIFEnder_JavaPIF_ender.getFrom_starter_port(), PIFIncDec_JavaPIF_pif6.getTo_ender_port(), PIFEnder_JavaPIF_ender, PIFIncDec_JavaPIF_pif6);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFIncDec_JavaPIF_pif4.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFIncDec_JavaPIF_pif4);
new Connector(PIFIncDec_JavaPIF_pif4.getFrom_ender_port(), PIFIncDec_JavaPIF_pif5.getTo_starter_port(), PIFIncDec_JavaPIF_pif4, PIFIncDec_JavaPIF_pif5);
new Connector(PIFIncDec_JavaPIF_pif2.getFrom_ender_port(), PIFIncDec_JavaPIF_pif3.getTo_starter_port(), PIFIncDec_JavaPIF_pif2, PIFIncDec_JavaPIF_pif3);
new Connector(PIFIncDec_JavaPIF_pif6.getFrom_starter_port(), PIFIncDec_JavaPIF_pif5.getTo_ender_port(), PIFIncDec_JavaPIF_pif6, PIFIncDec_JavaPIF_pif5);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFIncDec_JavaPIF_pif6.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFIncDec_JavaPIF_pif6);
new Connector(PIFIncDec_JavaPIF_pif2.getFrom_starter_port(), PIFIncDec_JavaPIF_pif1.getTo_ender_port(), PIFIncDec_JavaPIF_pif2, PIFIncDec_JavaPIF_pif1);
new Connector(PIFIncDec_JavaPIF_pif5.getFrom_ender_port(), PIFIncDec_JavaPIF_pif6.getTo_starter_port(), PIFIncDec_JavaPIF_pif5, PIFIncDec_JavaPIF_pif6);
new Connector(PIFStarter_JavaPIF_starter.getTimer_port(), TimerJava_JavaPIF_timer.getTimer_port(), PIFStarter_JavaPIF_starter, TimerJava_JavaPIF_timer);
new Connector(PIFIncDec_JavaPIF_pif5.getFrom_starter_port(), PIFIncDec_JavaPIF_pif4.getTo_ender_port(), PIFIncDec_JavaPIF_pif5, PIFIncDec_JavaPIF_pif4);
new Connector(PIFIncDec_JavaPIF_pif1.getFrom_starter_port(), PIFStarter_JavaPIF_starter.getTo_ender_port(), PIFIncDec_JavaPIF_pif1, PIFStarter_JavaPIF_starter);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFStarter_JavaPIF_starter.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFStarter_JavaPIF_starter);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFIncDec_JavaPIF_pif1.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFIncDec_JavaPIF_pif1);
new Connector(PIFIncDec_JavaPIF_pif4.getFrom_starter_port(), PIFIncDec_JavaPIF_pif3.getTo_ender_port(), PIFIncDec_JavaPIF_pif4, PIFIncDec_JavaPIF_pif3);
new Connector(PIFStarter_JavaPIF_starter.getFrom_ender_port(), PIFIncDec_JavaPIF_pif1.getTo_starter_port(), PIFStarter_JavaPIF_starter, PIFIncDec_JavaPIF_pif1);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFEnder_JavaPIF_ender.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFEnder_JavaPIF_ender);
new Connector(PIFIncDec_JavaPIF_pif3.getFrom_ender_port(), PIFIncDec_JavaPIF_pif4.getTo_starter_port(), PIFIncDec_JavaPIF_pif3, PIFIncDec_JavaPIF_pif4);
new Connector(PIFIncDec_JavaPIF_pif1.getFrom_ender_port(), PIFIncDec_JavaPIF_pif2.getTo_starter_port(), PIFIncDec_JavaPIF_pif1, PIFIncDec_JavaPIF_pif2);
new Connector(JavaPrinter_JavaPIF_printer.getPrint_port(), PIFIncDec_JavaPIF_pif5.getPrint_port(), JavaPrinter_JavaPIF_printer, PIFIncDec_JavaPIF_pif5);
new Connector(PIFIncDec_JavaPIF_pif6.getFrom_ender_port(), PIFEnder_JavaPIF_ender.getTo_starter_port(), PIFIncDec_JavaPIF_pif6, PIFEnder_JavaPIF_ender);
//Starting Things
PIFIncDec_JavaPIF_pif1.init();
PIFIncDec_JavaPIF_pif3.init();
PIFEnder_JavaPIF_ender.init();
PIFIncDec_JavaPIF_pif2.init();
PIFStarter_JavaPIF_starter.init();
PIFIncDec_JavaPIF_pif4.init();
JavaPrinter_JavaPIF_printer.init();
PIFIncDec_JavaPIF_pif6.init();
PIFIncDec_JavaPIF_pif5.init();
TimerJava_JavaPIF_timer.init();
PIFIncDec_JavaPIF_pif6.start();
PIFEnder_JavaPIF_ender.start();
PIFIncDec_JavaPIF_pif1.start();
TimerJava_JavaPIF_timer.start();
PIFIncDec_JavaPIF_pif2.start();
JavaPrinter_JavaPIF_printer.start();
PIFIncDec_JavaPIF_pif5.start();
PIFIncDec_JavaPIF_pif4.start();
PIFIncDec_JavaPIF_pif3.start();
PIFStarter_JavaPIF_starter.start();
Runtime.getRuntime().addShutdownHook(new Thread() {
public void run() {
System.out.println("Terminating ThingML app...");PIFIncDec_JavaPIF_pif1.stop();
PIFEnder_JavaPIF_ender.stop();
PIFIncDec_JavaPIF_pif4.stop();
PIFIncDec_JavaPIF_pif3.stop();
JavaPrinter_JavaPIF_printer.stop();
PIFIncDec_JavaPIF_pif2.stop();
PIFIncDec_JavaPIF_pif6.stop();
PIFStarter_JavaPIF_starter.stop();
PIFIncDec_JavaPIF_pif5.stop();
TimerJava_JavaPIF_timer.stop();
System.out.println("ThingML app terminated. RIP!");}
});

}
}
