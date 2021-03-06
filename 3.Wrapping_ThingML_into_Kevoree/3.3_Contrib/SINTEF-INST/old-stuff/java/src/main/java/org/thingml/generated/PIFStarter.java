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
 * Definition for type : PIFStarter
 **/
public class PIFStarter extends Component  {

private void sendTimer_start_via_timer(short TimerMsgs_timer_start_delay__var){
//ThingML send
send(timer_startType.instantiate(timer_port, TimerMsgs_timer_start_delay__var), timer_port);
}

private void sendTimer_cancel_via_timer(){
//ThingML send
send(timer_cancelType.instantiate(timer_port), timer_port);
}

private void sendPif_token_via_to_ender(short PrintIncForwardMsgs_pif_token_token__var){
//ThingML send
send(pif_tokenType.instantiate(to_ender_port, PrintIncForwardMsgs_pif_token_token__var), to_ender_port);
}

private void sendCustomPrintS_via_Print(String CustomPrintMsgs_customPrintS_myString__var){
//ThingML send
send(customPrintSType.instantiate(Print_port, CustomPrintMsgs_customPrintS_myString__var), Print_port);
}

private void sendCustomPrintI_via_Print(short CustomPrintMsgs_customPrintI_myInt__var){
//ThingML send
send(customPrintIType.instantiate(Print_port, CustomPrintMsgs_customPrintI_myInt__var), Print_port);
}

//Attributes
private final short PIFStarter_period__var;
//Ports
private Port timer_port;
private Port to_ender_port;
private Port from_ender_port;
private Port Print_port;
//Message types
protected final Timer_startMessageType timer_startType = new Timer_startMessageType();
public Timer_startMessageType getTimer_startType(){
return timer_startType;
}

protected final Timer_cancelMessageType timer_cancelType = new Timer_cancelMessageType();
public Timer_cancelMessageType getTimer_cancelType(){
return timer_cancelType;
}

protected final Timer_timeoutMessageType timer_timeoutType = new Timer_timeoutMessageType();
public Timer_timeoutMessageType getTimer_timeoutType(){
return timer_timeoutType;
}

protected final Pif_tokenMessageType pif_tokenType = new Pif_tokenMessageType();
public Pif_tokenMessageType getPif_tokenType(){
return pif_tokenType;
}

protected final CustomPrintSMessageType customPrintSType = new CustomPrintSMessageType();
public CustomPrintSMessageType getCustomPrintSType(){
return customPrintSType;
}

protected final CustomPrintIMessageType customPrintIType = new CustomPrintIMessageType();
public CustomPrintIMessageType getCustomPrintIType(){
return customPrintIType;
}

//Empty Constructor
public PIFStarter() {
super(4);
PIFStarter_period__var = 5000;
}

//Constructor (only readonly (final) attributes)
public PIFStarter(final short PIFStarter_period__var) {
super(4);
this.PIFStarter_period__var = PIFStarter_period__var;
}

//Constructor (all attributes)
public PIFStarter(String name, final short PIFStarter_period__var) {
super(name, 4);
this.PIFStarter_period__var = PIFStarter_period__var;
}

//Getters and Setters for non readonly/final attributes
public short getPIFStarter_period__var() {
return PIFStarter_period__var;
}

//Getters for Ports
public Port getTimer_port() {
return timer_port;
}
public Port getTo_ender_port() {
return to_ender_port;
}
public Port getFrom_ender_port() {
return from_ender_port;
}
public Port getPrint_port() {
return Print_port;
}
private CompositeState buildPIFStarter_behavior(){
final List<AtomicState> states_PIFStarter_behavior = new ArrayList<AtomicState>();
final AtomicState state_PIFStarter_behavior_Init = new AtomicState("Init")
{
@Override
public void onEntry() {
sendTimer_start_via_timer((short) (getPIFStarter_period__var()));
}

};
states_PIFStarter_behavior.add(state_PIFStarter_behavior_Init);
final AtomicState state_PIFStarter_behavior_Wait = new AtomicState("Wait")
;
states_PIFStarter_behavior.add(state_PIFStarter_behavior_Wait);
final List<Region> regions_PIFStarter_behavior = new ArrayList<Region>();
final List<Handler> transitions_PIFStarter_behavior = new ArrayList<Handler>();
transitions_PIFStarter_behavior.add(new Transition("Handler_13421993",timer_timeoutType, timer_port, state_PIFStarter_behavior_Init, state_PIFStarter_behavior_Wait){
@Override
public void doExecute(final Event e) {
final Timer_timeoutMessageType.Timer_timeoutMessage ce = (Timer_timeoutMessageType.Timer_timeoutMessage) e;
sendCustomPrintS_via_Print((String) ("Sender sends token ... "));
sendPif_token_via_to_ender((short) (1));
}

});
transitions_PIFStarter_behavior.add(new Transition("Handler_21631304",pif_tokenType, from_ender_port, state_PIFStarter_behavior_Wait, state_PIFStarter_behavior_Init){
@Override
public void doExecute(final Event e) {
final Pif_tokenMessageType.Pif_tokenMessage ce = (Pif_tokenMessageType.Pif_tokenMessage) e;
sendCustomPrintS_via_Print((String) (" Sender got token back \n"));
}

});
final CompositeState state_PIFStarter_behavior = new CompositeState("behavior", states_PIFStarter_behavior, state_PIFStarter_behavior_Init, transitions_PIFStarter_behavior, regions_PIFStarter_behavior, false);
return state_PIFStarter_behavior;
}

public Component buildBehavior() {
//Init ports
final List<EventType> inEvents_timer = new ArrayList<EventType>();
final List<EventType> outEvents_timer = new ArrayList<EventType>();
inEvents_timer.add(timer_timeoutType);
outEvents_timer.add(timer_startType);
outEvents_timer.add(timer_cancelType);
timer_port = new Port(PortType.REQUIRED, "timer", inEvents_timer, outEvents_timer, 0);
final List<EventType> inEvents_to_ender = new ArrayList<EventType>();
final List<EventType> outEvents_to_ender = new ArrayList<EventType>();
outEvents_to_ender.add(pif_tokenType);
to_ender_port = new Port(PortType.PROVIDED, "to_ender", inEvents_to_ender, outEvents_to_ender, 1);
final List<EventType> inEvents_from_ender = new ArrayList<EventType>();
final List<EventType> outEvents_from_ender = new ArrayList<EventType>();
inEvents_from_ender.add(pif_tokenType);
from_ender_port = new Port(PortType.REQUIRED, "from_ender", inEvents_from_ender, outEvents_from_ender, 2);
final List<EventType> inEvents_Print = new ArrayList<EventType>();
final List<EventType> outEvents_Print = new ArrayList<EventType>();
outEvents_Print.add(customPrintSType);
outEvents_Print.add(customPrintIType);
Print_port = new Port(PortType.PROVIDED, "Print", inEvents_Print, outEvents_Print, 3);
//Init state machine
behavior = buildPIFStarter_behavior();
return this;
}

}
