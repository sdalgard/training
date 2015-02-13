/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.messages.*;

import java.util.*;

/**
 * Definition for type : JavaPrinter
 **/
public class JavaPrinter extends Component  {

//Attributes
//Ports
private Port Print_port;
//Message types
protected final CustomPrintSMessageType customPrintSType = new CustomPrintSMessageType();
public CustomPrintSMessageType getCustomPrintSType(){
return customPrintSType;
}

protected final CustomPrintIMessageType customPrintIType = new CustomPrintIMessageType();
public CustomPrintIMessageType getCustomPrintIType(){
return customPrintIType;
}

//Empty Constructor
public JavaPrinter() {
super(1);
}

//Constructor (all attributes)
public JavaPrinter(String name) {
super(name, 1);
}

//Getters and Setters for non readonly/final attributes
//Getters for Ports
public Port getPrint_port() {
return Print_port;
}
private CompositeState buildJavaPrinter_behavior(){
final List<AtomicState> states_JavaPrinter_behavior = new ArrayList<AtomicState>();
final AtomicState state_JavaPrinter_behavior_greetings = new AtomicState("greetings")
;
states_JavaPrinter_behavior.add(state_JavaPrinter_behavior_greetings);
final List<Region> regions_JavaPrinter_behavior = new ArrayList<Region>();
final List<Handler> transitions_JavaPrinter_behavior = new ArrayList<Handler>();
transitions_JavaPrinter_behavior.add(new InternalTransition("Handler_18103914",customPrintSType, Print_port, state_JavaPrinter_behavior_greetings){
@Override
public void doExecute(final Event e) {
final CustomPrintSMessageType.CustomPrintSMessage ce = (CustomPrintSMessageType.CustomPrintSMessage) e;
System.out.print(ce.myString);
}

});
transitions_JavaPrinter_behavior.add(new InternalTransition("Handler_15102240",customPrintIType, Print_port, state_JavaPrinter_behavior_greetings){
@Override
public void doExecute(final Event e) {
final CustomPrintIMessageType.CustomPrintIMessage ce = (CustomPrintIMessageType.CustomPrintIMessage) e;
System.out.print( " " + ce.myInt + " ");
}

});
final CompositeState state_JavaPrinter_behavior = new CompositeState("behavior", states_JavaPrinter_behavior, state_JavaPrinter_behavior_greetings, transitions_JavaPrinter_behavior, regions_JavaPrinter_behavior, false);
return state_JavaPrinter_behavior;
}

public Component buildBehavior() {
//Init ports
final List<EventType> inEvents_Print = new ArrayList<EventType>();
final List<EventType> outEvents_Print = new ArrayList<EventType>();
inEvents_Print.add(customPrintSType);
inEvents_Print.add(customPrintIType);
Print_port = new Port(PortType.REQUIRED, "Print", inEvents_Print, outEvents_Print, 0);
//Init state machine
behavior = buildJavaPrinter_behavior();
return this;
}

}
